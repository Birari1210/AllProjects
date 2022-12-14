package com.project.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.entity.Post;
import com.project.blog.payroll.ApiResponse;
import com.project.blog.payroll.PostDto;
import com.project.blog.service.PostService;

@RestController
@RequestMapping("/api")
public class PostController {
	
	@Autowired
	PostService postService;
	
	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto , @PathVariable Integer userId, @PathVariable Integer categoryId)
	{
		PostDto createPost = this.postService.createPost(postDto, categoryId, userId);
		return new ResponseEntity<>(createPost, HttpStatus.CREATED);
	}
	
	
	@PutMapping("/posts/{postId}")
	public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto, @PathVariable Integer postId)
	{
		PostDto updatePost = postService.updatePost(postDto, postId);
		return ResponseEntity.ok(updatePost);
	}
	
	@DeleteMapping("/posts/{postId}")
	public ApiResponse deletePost(@PathVariable Integer postId)
	{
		 this.postService.deletePost(postId);
		return new ApiResponse("Post is deleted Successfuly", true);
	}
		
	@GetMapping("/user/{userId}/posts")
	public ResponseEntity<List<PostDto>> getPostByUser(@PathVariable Integer userId ){
		
		List<PostDto> postDtos = this.postService.getPostByUser(userId);
		
		return new ResponseEntity<List<PostDto>>(postDtos, HttpStatus.OK);
		
	}
	
	@GetMapping("/category/{categoryId}/posts")
	public ResponseEntity<List<PostDto>> getPostByCategory(@PathVariable Integer categoryId)
	{
		List<PostDto> postDtos = this.postService.getPostByCategory(categoryId);
		return new ResponseEntity<List<PostDto>>(postDtos,HttpStatus.OK);
	}

	@GetMapping("/posts")
	public ResponseEntity<List<PostDto>> getAllPost(@RequestParam(value="pageNumber",defaultValue = "2", required = false)Integer pageNumber,
	     @RequestParam(value="pageSize",defaultValue = "2",required = false)Integer pageSize)
	{
		List<PostDto> allPost = this.postService.getAllPost(pageNumber,pageSize);
		
		return new ResponseEntity<List<PostDto>>(allPost,HttpStatus.OK);
	}
	
	@GetMapping("/post/{postId}")
	public ResponseEntity<PostDto> getSinglePost(@PathVariable Integer postId)
	{
		PostDto singlePost = postService.getSinglePost(postId);
		return new ResponseEntity<PostDto>(singlePost, HttpStatus.OK);
	}
}

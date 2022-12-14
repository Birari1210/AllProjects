package com.project.blog.service.impl;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import com.project.blog.entity.Category;
import com.project.blog.entity.Post;
import com.project.blog.entity.User;
import com.project.blog.exceptions.ResourceNotFoundException;
import com.project.blog.payroll.PostDto;
import com.project.blog.repositories.CategoryRepo;
import com.project.blog.repositories.PostRepo;
import com.project.blog.repositories.UserRepo;
import com.project.blog.service.PostService;


@Service
public class PostServiceImpl implements PostService{

	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	PostRepo postRepo;
	
	@Autowired
	ModelMapper modelMapper;
	
	
	@Override
	public PostDto createPost(PostDto postDto, Integer categoryId, Integer userId) {
		
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "User ID", userId));
		
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category", "category Id", categoryId));
		
		Post post = this.modelMapper.map(postDto ,Post.class);
		post.setImageName("default.png");
		post.setDateOfAdd(new Date());
		post.setCategory(category);
		post.setUser(user);
		
		Post newPost= this.postRepo.save(post);
		
		return this.modelMapper.map(newPost, PostDto.class);
	
	}
	
	@Override
	public PostDto updatePost(PostDto postDto, Integer postId) {
		
		Post post = postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", "post Id", postId));
		
		post.setTitle(postDto.getTitle());
		post.setContent(postDto.getContent());
	//	post.setCategory(postDto.getCategory());
		post.setImageName(postDto.getImageName());
		
		Post savepost = postRepo.save(post);
		return this.modelMapper.map(savepost, PostDto.class);

	}

	@Override
	public void deletePost(Integer postId) {
		 
		 Post posts = postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", "post Id", postId));
		this.postRepo.delete(posts);
	}

	@Override
	public PostDto getSinglePost(Integer postId) {
		
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", "post id", postId));
		
		return this.modelMapper.map(post, PostDto.class);
	}

	@Override
	public List<PostDto> getAllPost(Integer pageNumber, Integer pageSize) {
		
//		 pageSize=3;
//		 pageNumber=2;
		
		Pageable p = PageRequest.of(pageNumber, pageSize);

	   Page<Post> pagePost = this.postRepo.findAll(p);
	   List<Post> postAll = pagePost.getContent();
		
		
		List<PostDto> postDtos = postAll.stream().map((post)-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		return postDtos;
	}

	

	@Override
	public List<PostDto> getPostByCategory(Integer categoryId) {
		
		Category cat = this.categoryRepo.findById(categoryId).orElseThrow(()->new ResourceNotFoundException("Category", "category Id", categoryId));
		
		List<Post> posts = this.postRepo.findByCategory(cat);  //this.getPostByCategory(categoryId).stream().map(poster)-> 
		
		List<PostDto> postDtos = posts.stream().map((post)-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
	
		return postDtos;
	}

	@Override
	public List<PostDto> getPostByUser(Integer userId) {
		
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User", "user id", userId));
		List<Post> posts = this.postRepo.findByUser(user);
		
		List<PostDto> postDtos = posts.stream().map((post)-> this.modelMapper.map(post, PostDto.class)).collect(Collectors.toList());
		return postDtos;
	}

	@Override
	public List<Post> searchPost(String keyWord) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Override
//	public PostDto createPost(PostDto post) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public PostDto updatePost(PostDto post, Integer postId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public PostDto deletePost(Integer postId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public PostDto getSinglePost(Integer postId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<PostDto> getAllUser() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	

}

package com.project.blog.service;

import java.util.List;

import com.project.blog.entity.Post;
import com.project.blog.payroll.PostDto;

public interface PostService {
	
	PostDto createPost(PostDto postDto, Integer categoryId, Integer userId);
	
	PostDto updatePost(PostDto postDto, Integer postId);// Integer postId
	
	void deletePost(Integer postId);
	
	PostDto getSinglePost(Integer postId);
	
	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	List<PostDto> getPostByUser(Integer UserId);
	
	List<Post> searchPost(String keyWord);

}

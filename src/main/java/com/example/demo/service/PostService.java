package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import com.example.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;

//import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
public class PostService {

//    private final List<Post> posts = new ArrayList<>();
//
//    {
//        posts.add(new Post((long)0, "Первый пост - введение", new Date(2019, 8, 1)));
//        posts.add(new Post((long)1, "Второй пост - подробности", new Date(2019, 8, 5)));
//        posts.add(new Post((long)2, "Третий пост - заключение", new Date(2019, 8, 10)));
//    }
    @Autowired
    PostRepository postRepository;

    public List<Post> listAllPosts() {
        return StreamSupport.stream(postRepository.findAll().spliterator(), false).toList();
    }

    public void create(final String text) {
//        int index = posts.size();
//        posts.add(new Post((long)index, text, new Date()));
        Post post = new Post(null, text, new Date());
        postRepository.save(post);

    }

//    public List<Post> listAllPosts() {
//        return posts;
//    }
}
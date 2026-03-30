package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();

        posts.add(new Post("Первый пост - введение"));
        posts.add(new Post("Второй пост - подробности"));
        posts.add(new Post("Третий пост - заключение"));

        return posts;
    }
}
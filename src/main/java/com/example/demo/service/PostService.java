package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    private List<Post> posts = new ArrayList<>();

    { // 👇 БЛОК ИНИЦИАЛИЗАЦИИ
        posts.add(new Post("Первый пост - введение", new Date(2019, 8, 1)));
        posts.add(new Post("Второй пост - подробности", new Date(2019, 8, 5)));
        posts.add(new Post("Третий пост - заключение", new Date(2019, 8, 10)));
    }

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }
}
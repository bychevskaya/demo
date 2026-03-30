package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@Service
public class PostService {

    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();

        // Создаём три поста с датами
        posts.add(new Post("Первый пост - введение", new Date(2025 - 1900, 8, 1))); // Сентябрь 2019
        posts.add(new Post("Второй пост - подробности", new Date(2025 - 1900, 8, 5)));
        posts.add(new Post("Третий пост - заключение", new Date(2025 - 1900, 8, 10)));

        return posts;
    }
}
package com.example.demo.controller;

import com.example.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostsCreateController {

    @Autowired
    private PostService postService;

    @GetMapping(path = "/new")//Открывает страницу создания нового поста
    public String showCreate() {
        return "create"; // Возвращает имя шаблона без .html
    }

    @PostMapping(path = "/new")
    public String doCreate(@ModelAttribute("text") String text) {
        postService.create(text);
        return "redirect:/";
    }
}
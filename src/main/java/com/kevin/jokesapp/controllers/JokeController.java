package com.kevin.jokesapp.controllers;

import com.kevin.jokesapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Kevin Lee on 10/19/22
 */
@Controller
public class JokeController {

    private final JokeServiceImpl jokeService;

    public JokeController(JokeServiceImpl jokeService) {this.jokeService = jokeService;}

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {

        model.addAttribute("joke", jokeService.getJoke());

        return "index";
    }
}

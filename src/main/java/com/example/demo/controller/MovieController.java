package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/movie/{id}")
    public String getAll(@PathVariable Long id, Model model){
        model.addAttribute("movie", movieService.getOne(id));
        return "movie";
    }

    @GetMapping("/addMovie")
    public String sendForm(Model model){
        model.addAttribute("movie", new Movie());
        return "addMovie";
    }

    @PostMapping("/addMovie")
    public String addMovie(@ModelAttribute Movie movie, Model model){
        model.addAttribute("movie", movieService.save(movie));
        return "addMovie";
    }

}

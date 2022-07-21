package com.example.demo.controller;

import com.example.demo.model.Song;
import com.example.demo.service.SongService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@AllArgsConstructor
public class SongController {

    private final SongService songService;

    @GetMapping("/song/{id}")
    public String getOne(@PathVariable Long id, Model model){
        model.addAttribute("song", songService.getOne(id));
        return "song";
    }

}

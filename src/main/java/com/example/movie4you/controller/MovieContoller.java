package com.example.movie4you.controller;

import com.example.movie4you.service.IMovieService;
import com.example.movie4you.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MovieApi")
public class MovieContoller {
    private final MovieService movieService;
    @Autowired
    public MovieContoller(MovieService movieService) {
        this.movieService = movieService;
    }
}

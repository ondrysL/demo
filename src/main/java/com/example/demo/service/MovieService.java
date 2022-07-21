package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.model.Movie;
import com.example.demo.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public Optional<Movie> getOne(Long id){
        return movieRepository.findById(id);
    }

    public Movie save(Movie movie){
        Movie setMovie = movieRepository.findTopByOrderByIdDesc();
        if(setMovie != null){
            movie.setId(setMovie.getId()+1);
        }else{
            movie.setId(0L);
        }
        movieRepository.save(movie);
        return movie;
    }

}

package io.mylearning.movieinfoservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @RequestMapping("/{movieId}")
public Movie getMovieInfo(@PathVariable String movieId)
{
    return new Movie("123","Transformers");


}


}

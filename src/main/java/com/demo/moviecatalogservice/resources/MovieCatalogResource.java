package com.demo.moviecatalogservice.resources;

import com.demo.moviecatalogservice.models.CatalogItem;
import com.demo.moviecatalogservice.models.Movie;
import com.demo.moviecatalogservice.models.MovieRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        // get all the movies user had rated i.e all the movies in rating list
        // for all the rated movies call the movie-detail-service using movieId from rating list
        //collect all the movies and return

        List<MovieRating> ratings = Arrays.asList(
          new MovieRating("12345", 7),
          new MovieRating("123456", 8)
        );

        // response list
        List<CatalogItem> responseList = new ArrayList<>();
        for(MovieRating movieRating : ratings){
            RestTemplate restTemplate = new RestTemplate();
            Movie movie = restTemplate.getForObject("http://localhost:8082/movie/" + movieRating.getMoveId(), Movie.class);
            CatalogItem catalogItem = new CatalogItem(movie.getMovieId(), movie.getMovieName(), movie.getDesc(), movieRating.getRating());
            responseList.add(catalogItem);

        }
        return  responseList;
    }
}

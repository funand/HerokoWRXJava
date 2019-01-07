package com.example.prince.heroku;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface JSONInterface {

    String BASE_URL = "https://movies-sample.herokuapp.com/api/";
    @GET("movies/")
    Observable<Data> getMovies();

}

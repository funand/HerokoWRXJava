package com.example.prince.heroku;

public class Movies {
    private Integer id;
    private String year;
    private String title;
    private String genre;
    private String poster;

    public Movies(Integer id, String year, String title, String genre, String poster) {
        this.id = id;
        this.year = year;
        this.title = title;
        this.genre = genre;
        this.poster = poster;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}

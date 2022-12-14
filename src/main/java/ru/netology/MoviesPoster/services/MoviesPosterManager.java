package ru.netology.MoviesPoster.services;

public class MoviesPosterManager {
    // private String movies;
    private String[] moviesPoster = new String[0];
    private int limit;

    public MoviesPosterManager(int limit) {
        this.limit = limit;
    }

    public MoviesPosterManager() {
        this.limit = 10;
    }

    public String[] addNewMovie(String movie) {
        String[] newMovies = new String[moviesPoster.length + 1];
        for (int i = 0; i < moviesPoster.length; i++) {
            newMovies[i] = moviesPoster[i];
        }
        newMovies[newMovies.length - 1] = movie;
        moviesPoster = newMovies;
        return newMovies;
    }

    public String[] showMoviesLastToFirst() {
        String[] allMovies = new String[limit];
        for (int i = 0; i < allMovies.length; i++) {
            allMovies[i] = moviesPoster[moviesPoster.length - 1 - i];
        }
        return allMovies;
    }

    public String[] findLast() {
        int resultLength;
        if (limit >= moviesPoster.length) {
            resultLength = moviesPoster.length;
        } else {
            resultLength = limit;
        }
        String[] reversed = new String[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = moviesPoster[moviesPoster.length - 1 - i];
        }
        return reversed;
    }
}

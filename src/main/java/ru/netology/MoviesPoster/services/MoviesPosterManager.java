package ru.netology.MoviesPoster.services;

public class MoviesPosterManager {
    private String movies;
    private String[] moviesPoster = new String[0];
    private int limit;

    public MoviesPosterManager(){
        this.limit=10;
    }

    public String[] addNewMovie (String movie) {
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
            allMovies[i] = moviesPoster[moviesPoster.length-1 - i];
        }
        return allMovies;
    }

    public String[] showAskedNumberOfLastMovies (int limit) {
        int actualLimit= moviesPoster.length;
        if (actualLimit >= limit) {
            actualLimit = limit;
        } else {
            actualLimit = moviesPoster.length;
        }
        String[] askedNumberMovies = new String[actualLimit];
        for (int i=0; i<askedNumberMovies.length; i++) {
            askedNumberMovies[i] = moviesPoster[moviesPoster.length - 1 - i];
        }
        return askedNumberMovies;
    }

}

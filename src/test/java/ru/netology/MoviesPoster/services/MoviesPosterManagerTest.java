package ru.netology.MoviesPoster.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.MoviesPoster.services.MoviesPosterManager;

public class MoviesPosterManagerTest {
    MoviesPosterManager manager = new MoviesPosterManager();

    @Test
    public void shouldAddNewMovie() {

        String[] actual = manager.addNewMovie("film5");
        String[] expected = {"film5"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowMoviesLastToFirst() {
        manager.addNewMovie("film1");
        manager.addNewMovie("film2");
        manager.addNewMovie("film3");
        manager.addNewMovie("film4");
        manager.addNewMovie("film5");
        manager.addNewMovie("film6");
        manager.addNewMovie("film7");
        manager.addNewMovie("film8");
        manager.addNewMovie("film9");
        manager.addNewMovie("film10");
        manager.addNewMovie("film11");
        manager.addNewMovie("film12");
        manager.addNewMovie("film13");

        String[] actual = manager.showMoviesLastToFirst();
        String[] expected = {"film13", "film12", "film11", "film10", "film9", "film8", "film7", "film6", "film5", "film4"};

        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    public void shouldShowAskedNumberOfLastAddedMovies() {
        manager.addNewMovie("film1");
        manager.addNewMovie("film2");
        manager.addNewMovie("film3");
        manager.addNewMovie("film4");
        manager.addNewMovie("film5");
        manager.addNewMovie("film6");
        manager.addNewMovie("film7");
        manager.addNewMovie("film8");
        manager.addNewMovie("film9");
        manager.addNewMovie("film10");
        manager.addNewMovie("film11");
        manager.addNewMovie("film12");
        manager.addNewMovie("film13");

        String[] actual = manager.findLast();
        String[] expected = {"film13", "film12", "film11", "film10"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllMoviesIfLessThanAsked() {
        manager.addNewMovie("film1");
        manager.addNewMovie("film2");
        manager.addNewMovie("film3");

        String[] actual = manager.findLast();
        String[] expected = {"film3", "film2", "film1"};

        Assertions.assertArrayEquals(expected, actual);
    }


}

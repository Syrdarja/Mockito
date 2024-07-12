package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    String film1 = "Бладшот";
    String film2 = "Вперед";
    String film3 = "Отель Белград";
    String film4 = "Джентельмены";
    String film5 = "Человек-невидимка";
    String film6 = "Тролли.мировой тур";
    String film7 = "Номер один";

    @Test

    public void addingNewFilms() {
        Poster poster = new Poster();

        poster.addeningFilm(film1);
        poster.addeningFilm(film2);
        poster.addeningFilm(film3);
        poster.addeningFilm(film4);
        poster.addeningFilm(film5);
        poster.addeningFilm(film6);
        poster.addeningFilm(film7);

        String[] actual = poster.findAll();
        String[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void displayingAllFilmsOrderAdded() {
        Poster poster = new Poster();

        poster.addeningFilm(film1);
        poster.addeningFilm(film2);
        poster.addeningFilm(film3);
        poster.addeningFilm(film4);
        poster.addeningFilm(film5);
        poster.addeningFilm(film6);
        poster.addeningFilm(film7);
        String[] actual = poster.reversOrder();
        String[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void mustBeReverseOfLimit() {
        Poster poster = new Poster();

        poster.addeningFilm(film1);
        poster.addeningFilm(film2);
        poster.addeningFilm(film3);
        poster.addeningFilm(film4);
        poster.addeningFilm(film5);
        poster.addeningFilm(film6);
        poster.addeningFilm(film7);
        String[] actual = poster.findLast();
        String[] expected = {film7, film6, film5, film4, film3};
        Assertions.assertArrayEquals(expected, actual);
    }
}

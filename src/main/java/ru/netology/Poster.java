package ru.netology;

class Poster {
    private String[] films = new String[0];
    private final int limit;

    public Poster() {
        this.limit = 5;
    }

    public Poster(int limit) {
        this.limit = limit;
    }

    public void addeningFilm(String newFilm) {
        String[] tmp = new String[films.length + 1];
        System.arraycopy(films, 0, tmp, 0, films.length);
        tmp[tmp.length - 1] = newFilm;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < films.length) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }

    public String[] reversOrder() {
        String[] revers = new String[films.length];
        for (int i = 0; i < films.length; i++) {
            revers[i] = films[films.length - 1 - i];
        }
        return revers;
    }
}
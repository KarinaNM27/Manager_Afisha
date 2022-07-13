
package ru.netology.manager;

public class ManagerAfisha {
    private Movies[] movies = new Movies[0];
    private int limit;

    public void add(Movies movie) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;


    }

    public ManagerAfisha() {
        limit = 10;

    }

    public ManagerAfisha(int limit) {
        this.limit = limit;

    }


    public Movies[] findAll() {
        return movies;
    }


    public Movies[] findLast() {

        int resultLength;

        if (limit < movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Movies[] result = new Movies[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
            // заполняем result из массива что лежит в поле
            // в обратном порядке
        }
        return result;
    }
}

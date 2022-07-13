package ru.netology.manager;

public class RepositoryAfisha {
    private Movies[] movies = new Movies[0];


    public void save(Movies movie) {
        int length = movies.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;


    }

    public Movies[] findAll() {
        return movies;
    }


    public void removeById(int id) {
        int length = movies.length - 1;
        Movies[] tmp = new Movies[length];
        int index = 0;
        for (Movies movie : movies) {
            if (movie.getId() != id) {
                tmp[index] = movie;
                index++;
            }

        }
        movies = tmp;
    }

    public Movies findById(int id) {

        Movies[] movieById = new Movies[0];
        int idd = 0;
        for (Movies movie : movies) {
            if (movie.getId() == idd) {
                movieById[idd] = movie;
                idd++;
            }
            return movie;

        }

        return null;
    }


    public Movies removeAll(int id) {
        Movies[] removeAllById = new Movies[0];
        int count = 0;
        for (Movies movie : movies) {
            if (movie.getId() == count) {
                int[] item = {};
                count++;
            }

        }
        return null;
    }
}


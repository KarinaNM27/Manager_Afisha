
package ru.netology.manager;

public class ManagerAfisha {

    private RepositoryAfisha repository;

    public ManagerAfisha(RepositoryAfisha repository) {
        this.repository = repository;
    }

    public void add(Movies movie) {
        repository.save(movie);
    }


    public void findAll1() {
        repository.findAll();

    }

    public void removeById1(int id) {
        repository.removeById(id);
    }

    public int findById1(int id) {
        repository.findById(id);

        return id;
    }


    public void removeAll1(int id) {
        repository.removeAll(id);
    }


}

package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Manager_AfishaTest {
    Movies first = new Movies(111, "Бладшот", "боевик");
    Movies second = new Movies(222, "Вперед", "мультфильм");
    Movies third = new Movies(333, "Отель Белград", "комедия");
    Movies fourth = new Movies(444, "Джентльмены", "боевик");
    Movies fifth = new Movies(555, "Человек-невидимка", "ужасы");
    Movies sixth = new Movies(666, "Тролли.Мировой тур", "мультфильм");
    Movies seventh = new Movies(777, "Номер один", "комедия");


    @Test
    public void findAllTest() {
        Manager_Afisha manager = new Manager_Afisha();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);


        Movies[] actual1 = manager.findAll();
        Movies[] expected1 = new Movies[]{first, second, third, fourth, fifth, sixth, seventh};

        Assertions.assertArrayEquals(expected1, actual1);
    }


    @Test
    public void findLastTest() {
        Manager_Afisha manager = new Manager_Afisha();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);


        Movies[] actual2 = manager.findLast();
        Movies[] expected2 = {seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected2, actual2);
    }
}

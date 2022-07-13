package ru.netology.manager;

public class Main {
    public static void main(String[] args) {

        Movies first = new Movies(111, "Бладшот", "боевик");
        Movies second = new Movies(222, "Вперед", "мультфильм");
        Movies third = new Movies(333, "Отель Белград", "комедия");
        Movies fourth = new Movies(444, "Джентльмены", "боевик");
        Movies fifth = new Movies(555, "Человек-невидимка", "ужасы");
        Movies sixth = new Movies(666, "Тролли.Мировой тур", "мультфильм");
        Movies seventh = new Movies(777, "Номер один", "комедия");

        ManagerAfisha manager = new ManagerAfisha();
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
    }


}

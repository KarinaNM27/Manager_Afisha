package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;


public class ManagerAfishaTest {
    //    @Mock
    private RepositoryAfisha repository = Mockito.mock(RepositoryAfisha.class);

    //    @InjectMocks
    private ManagerAfisha manager = new ManagerAfisha(repository);
    private Movies first = new Movies(111, "Бладшот", "боевик");
    private Movies second = new Movies(222, "Вперед", "мультфильм");
    private Movies third = new Movies(333, "Отель Белград", "комедия");
    private Movies fourth = new Movies(444, "Джентльмены", "боевик");
    private Movies fifth = new Movies(555, "Человек-невидимка", "ужасы");
    private Movies sixth = new Movies(666, "Тролли.Мировой тур", "мультфильм");
    private Movies seventh = new Movies(777, "Номер один", "комедия");


    @Test
    public void shouldFindById() {
        Movies[] returned = {first, second, third, fourth, fifth, sixth, seventh};
        doReturn(returned).when(repository).findAll();
        int expected3 = 333;
        int actual3 = manager.findById1(333);

//        Manager_Afisha manager = new Manager_Afisha();
//        manager.add(first);
//        manager.add(second);
//        manager.add(third);
//        manager.add(fourth);
//        manager.add(fifth);
//        manager.add(sixth);
//        manager.add(seventh);


//        Movies[] actual1 = manager.findAll();
//        Movies[] expected1 = new Movies[]{first, second, third, fourth, fifth, sixth, seventh};

        assertEquals(expected3, actual3);
        verify(repository).findById(333);

    }
}



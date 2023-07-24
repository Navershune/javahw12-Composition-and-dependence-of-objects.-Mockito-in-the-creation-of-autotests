package ru.netology;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ManagerTest {

    @Test
    public void testAddFilm() {
        Manager manager = new Manager();
        manager.addFilm("Film 1");
        assertArrayEquals(new String[]{"Film 1"}, manager.findAll());

        manager.addFilm("Film 2");
        assertArrayEquals(new String[]{"Film 1", "Film 2"}, manager.findAll());

        manager.addFilm("Film 3");
        assertArrayEquals(new String[]{"Film 1", "Film 2", "Film 3"}, manager.findAll());
    }

    @Test
    public void testFindAll() {
        Manager manager = new Manager();
        assertArrayEquals(new String[0], manager.findAll());

        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        assertArrayEquals(new String[]{"Film 1", "Film 2"}, manager.findAll());
    }

    @Test
    public void testFindLast() {
        Manager manager = new Manager(2);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        manager.addFilm("Film 3");

        assertArrayEquals(new String[]{"Film 3", "Film 2"}, manager.findLast());

        manager = new Manager();
        manager.addFilm("Film 1");
        assertArrayEquals(new String[]{"Film 1"}, manager.findLast());

        manager = new Manager(1);
        manager.addFilm("Film 1");
        manager.addFilm("Film 2");
        assertArrayEquals(new String[]{"Film 2"}, manager.findLast());
    }
}

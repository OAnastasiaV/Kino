import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.manager;

public class managerTest {

    @Test
    public void addTest() {
        manager manager = new manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd1() {
        manager manager = new manager();

        manager.addFilm("Movie1");


        String[] actual = manager.findAll();
        String[] expected = {"Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd0() {
        manager manager = new manager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength3() {
        manager manager = new manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");

        String[] actual = manager.findLast();
        String[] expected = {"Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength5() {
        manager manager = new manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");

        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimit7() {
        manager manager = new manager(7);

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        manager.addFilm("Movie6");
        manager.addFilm("Movie7");

        String[] actual = manager.findLast();
        String[] expected = {"Movie7", "Movie6", "Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength0() {
        manager manager = new manager();



        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

}

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Manager;

public class ManagerTest {

    @Test
    public void addTest() {
        Manager manager = new Manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");

        String[] actual = manager.findAll();
        String[] expected = {"Movie1", "Movie2", "Movie3"};
        Assertions.assertArrayEquals(expected, actual);
    }



    @Test
    public void testAdd1() {
        Manager manager = new Manager();

        manager.addFilm("Movie1");


        String[] actual = manager.findAll();
        String[] expected = {"Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd0() {
        Manager manager = new Manager();


        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength3() {
        Manager manager = new Manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");

        String[] actual = manager.findLast();
        String[] expected = {"Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength5() {
        Manager manager = new Manager();

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
        Manager manager = new Manager(7);

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
    public void testLimit7_3() {
        Manager manager = new Manager(7);

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");


        String[] actual = manager.findLast();
        String[] expected = {"Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLimit7_10() {
        Manager manager = new Manager(7);

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        manager.addFilm("Movie6");
        manager.addFilm("Movie7");
        manager.addFilm("Movie8");
        manager.addFilm("Movie9");
        manager.addFilm("Movie10");

        String[] actual = manager.findLast();
        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6", "Movie5", "Movie4"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength0() {
        Manager manager = new Manager();



        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength5_2() {
        Manager manager = new Manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");

        String[] actual = manager.findLast();
        String[] expected = {"Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength5_10() {
        Manager manager = new Manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");
        manager.addFilm("Movie6");
        manager.addFilm("Movie7");
        manager.addFilm("Movie8");
        manager.addFilm("Movie9");
        manager.addFilm("Movie10");

        String[] actual = manager.findLast();
        String[] expected = {"Movie10", "Movie9", "Movie8", "Movie7", "Movie6"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testResultLength5_5() {
        Manager manager = new Manager();

        manager.addFilm("Movie1");
        manager.addFilm("Movie2");
        manager.addFilm("Movie3");
        manager.addFilm("Movie4");
        manager.addFilm("Movie5");

        String[] actual = manager.findLast();
        String[] expected = {"Movie5", "Movie4", "Movie3", "Movie2", "Movie1"};
        Assertions.assertArrayEquals(expected, actual);
    }

}

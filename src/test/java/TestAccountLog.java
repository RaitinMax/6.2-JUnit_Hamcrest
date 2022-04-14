import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;

public class TestAccountLog {
    public static Users users;
    private static long suiteStartTime;
    private long testStartTime;

    @BeforeAll
    public static void initSuite() {
        System.out.println("Running accountTests");
        suiteStartTime = System.nanoTime();
    }

    @AfterAll
    public static void completeloggin() {
        System.out.println("AccountTests have been completed: " + (System.nanoTime() - suiteStartTime));
    }

    @Test
    public void contains() throws UserNotFoundException, AccessDeniedException {
        User user1 = new User( "jhon", "jhon@gmail.com", "pass", 15);
        User userMax = new User("max", "max@gmail.com", "qwerty", 21);
        User userMia = new User("mia", "max@gmail.com", "qwerty", 21);
        String login = "max";
        String password = "qwerty";
//        User user = users.getUserByLoginAndPassword(login,password);
//        users.validateUser(user);
        List<User> usersStorage = users.getUsers();

        List<User> findItems = new ArrayList<>();
        findItems.add(user1);
        findItems.add(userMax);

        MatcherAssert.assertThat((usersStorage), hasItems(user1,userMax));
    }
}

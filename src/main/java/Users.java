import java.util.ArrayList;
import java.util.List;

public class Users {

    public static ArrayList<User>  getUsers() {
        User user1 = new User( "jhon", "jhon@gmail.com", "pass", 15);
        User user2 = new User("max", "max@gmail.com", "qwerty", 21);
        User user3 = new User("lilia", "lilia@gmail.com", "qazwsx", 20);
        User user4 = new User("lilia", "lilia@gmail.com", "qazwsx", 20);
        List<User> users =new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i).getLogin()+" "
                    +users.get(i).getPassword());
        }
        return new ArrayList<>(users);
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        ArrayList<User> users = getUsers();
        for (User user : users) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < 18) {
            throw new AccessDeniedException("s 18< Access is denied");
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

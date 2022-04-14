import java.util.*;

public class Main {
    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        String login = "max";
        System.out.println("Enter password");
        String password = "qwerty";
        User user = getUserByLoginAndPassword(login, password);
        validateUser(user);
        System.out.println("Welcome");
    }

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
        if(user3.equals(user4)){
            System.out.println("True!");
        }
        System.out.println(user3.equals(user4));
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

}

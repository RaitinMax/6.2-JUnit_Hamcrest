public class User {
    private String login;
    private String emailAdress;
    private String password;
    private int age;

    public User(String login, String emailAdress, String password, int age) {
        this.login = login;
        this.emailAdress = emailAdress;
        this.password = password;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return login.equals(user.login) &&
                emailAdress.equals(user.emailAdress) &&
                password.equals(user.password)&&
               age == user.age;
    }

}

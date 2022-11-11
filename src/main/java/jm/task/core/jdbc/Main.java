package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        User user = new User("Bob", "Simpson", (byte) 16);
        User user1 = new User("Lob", "Simpson2", (byte) 36);
        User user2 = new User("Mike", "Simpson3", (byte) 26);
        User user3 = new User("JO", "Simpson4", (byte) 46);
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser(user.getName(), user.getLastName(), user.getAge());
        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

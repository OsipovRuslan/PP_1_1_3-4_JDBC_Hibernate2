package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDaoJDBCImpl = new UserDaoJDBCImpl();
    //private UserDao userDaoJDBCImpl = new UserDaoHibernateImpl();
    public void createUsersTable() throws SQLException {
        userDaoJDBCImpl.createUsersTable();
    }

    public void dropUsersTable() throws SQLException {
        userDaoJDBCImpl.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws SQLException {
        userDaoJDBCImpl.saveUser(name, lastName, age);
        System.out.println(String.format("User с именем – %s добавлен в базу данных", name));
    }

    public void removeUserById(long id) throws SQLException {
        userDaoJDBCImpl.removeUserById(id);
    }

    public List<User> getAllUsers() throws SQLException {
        return userDaoJDBCImpl.getAllUsers();
    }

    public void cleanUsersTable() throws SQLException {
        userDaoJDBCImpl.cleanUsersTable();
    }
}

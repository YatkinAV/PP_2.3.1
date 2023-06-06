package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(User user);

    User getById(Integer id);

    void updateUser(Integer id, User user);
}

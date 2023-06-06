package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    void deleteUser(User user);

    User getByIdUser(int id);
}

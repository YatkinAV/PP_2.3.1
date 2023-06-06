package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    void updateUser(Integer id, User user);

    void deleteUser(User user);

    User getById(Integer id);
}

package web.service;

import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.model.User;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDao;

    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }

    @Override
    public User getByIdUser(int id) {
        return userDao.getByIdUser(id);
    }
}

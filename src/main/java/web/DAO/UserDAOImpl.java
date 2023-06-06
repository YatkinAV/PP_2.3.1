package web.DAO;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;

    public UserDAOImpl() {
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {
        entityManager.persist(user);

        //entityManager.persist(entityManager.merge(user));
    }

    @Override
    public void updateUser(Integer id, User user) {
        User user1 = entityManager.find(User.class, id);
        user1.setId(user.getId());
        user1.setName(user.getName());
        user1.setLastName(user.getLastName());
        user1.setMail(user.getMail());
        user1.setAge(user.getAge());
        entityManager.merge(user1);
    }

    @Override
    public void deleteUser(User user) {
        entityManager.remove(entityManager.merge(user));
    }

    @Override
    public User getById(Integer id) {
        return entityManager.find(User.class, id);
    }
}

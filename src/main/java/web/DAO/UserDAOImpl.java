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
        User managed = entityManager.merge(user);
        entityManager.persist(managed);

        //entityManager.persist(entityManager.merge(user));
    }

   // @Transactional
    @Override
    public void deleteUser(User user) {
        User managed = entityManager.merge(user);
        entityManager.remove(managed);

        //entityManager.remove(entityManager.merge(user));
    }

    @Override
    public User getByIdUser(int id) {
        return entityManager.find(User.class, id);
    }
}

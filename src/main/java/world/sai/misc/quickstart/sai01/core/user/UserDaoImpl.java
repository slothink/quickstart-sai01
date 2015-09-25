package world.sai.misc.quickstart.sai01.core.user;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import world.sai.misc.quickstart.sai01.core.hibernate.HibernateUtil;

import java.util.List;

/**
 * Created by sai on 15. 9. 25..
 */
@Service("userDao")
public class UserDaoImpl implements UserDao{

    @Override
    public List<User> getAllLst() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        return session.createCriteria(User.class).list();
    }

    @Override
    public User save(User user) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.save(user);
        return user;
    }

    @Override
    public void delete(User user) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.delete(user);
    }
}

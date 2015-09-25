package world.sai.misc.quickstart.sai01.core.user;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by sai on 15. 9. 25..
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao dao;

    @Override
    public List<User> getAllLst() {
        return dao.getAllLst();
    }

    @Override
    public User save(User user) {
        return dao.save(user);
    }

    @Override
    public void delete(User user) {
        dao.delete(user);
    }
}

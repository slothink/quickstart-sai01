package world.sai.misc.quickstart.sai01.core.user;

import org.hibernate.Session;

import java.util.List;

/**
 * Created by sai on 15. 9. 25..
 */
public interface UserDao {

    List<User> getAllLst();

    User save(User user);

    void delete(User user);
}

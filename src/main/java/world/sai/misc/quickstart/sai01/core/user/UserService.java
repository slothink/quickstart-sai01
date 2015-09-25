package world.sai.misc.quickstart.sai01.core.user;

import java.util.List;

/**
 * Created by sai on 15. 9. 25..
 */
public interface UserService {
    List<User> getAllLst();

    User save(User user);

    void delete(User user);
}

package assignment;

import java.util.Optional;

public interface UserRepo {

    Optional<User> getUserByUsername(String username);
}

package assignment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserServiceTest {


    @ParameterizedTest
    @CsvSource(value = {"anv, pass","jöns, gillarhöns"})
    public void user_is_authenticated(String username, String password){

        User user;

        user = new User(username, password);
        boolean authenticated = UserService.authenticate(user.getUsername(), user.getPassword());

        assertTrue(authenticated);
    }
}

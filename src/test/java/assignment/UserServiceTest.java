package assignment;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    private UserRepo userRepo;

    @ParameterizedTest
    @CsvSource(value = {"anv, pass","jöns, gillarhöns"})
    public void user_is_authenticated(String username, String password){

        when(userRepo.getUserByUsername(username)).thenReturn(Optional.of(new User("jöns", "gillarhöns")));
        UserService userService = new UserService(userRepo);

        User user = userService.findByUsername(username);

        //boolean authenticated = userService.authenticate(user.getUsername(), user.getPassword());

        assertEquals(new User("jöns", "gillarhöns"), user);
    }
}

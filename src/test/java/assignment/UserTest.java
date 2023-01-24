package assignment;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {


    @Test
    public void user_created(){
        User user;
        user = new User("anv", "pass");
        assertNotNull(user);
    }

    @ParameterizedTest
    @CsvSource(value = {"anv, pass"})
    public void user_has_fields(String username, String password){

        User user;

        user = new User(username, password);

        assertEquals(username, user.getUsername());
        assertEquals(password, user.getPassword());


    }
}

package assignment;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class UserTest {

    @Test
    public void user_class_exists(){
        User user;

        User user = new User();

        assertNotNull(user);
    }

    @Test
    @ValueSource(strings = {"username", "password"})
    public void user_has_fields(String uname, String pword){

        User user;
"
        user = new User("anv","pass");

        assertEquals("username", user.getClass().getField(uname));
        assertEquals("password", user.getClass().getField(pword));
    }
}

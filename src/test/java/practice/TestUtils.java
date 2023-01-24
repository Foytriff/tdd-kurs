package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestUtils {
    @Test
    public void helloW(){
        //Given
        Utils utils;
        //When
        Utils test = new Utils(10, "tioåring");
        //Then
        assertAll(
                () -> assertNotNull(test),
                () -> assertEquals(10, test.getAge()),
                () -> assertEquals("tioåring", test.getName()),
                () -> assertEquals(new Utils(10, "tioåring"), test)

        );
    }
}

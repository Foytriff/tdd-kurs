package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestUtils {
    @Test
    public void helloW(){
        //Given
        int a = 5;
        int b = 0;

        //When
        //Then
        assertThrows(Exception.class, () -> Utils.divide(a,b));
    }
}

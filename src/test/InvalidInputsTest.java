package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Main;

public class InvalidInputsTest {

    @Test
    void TC01() {
        assertEquals("Invalid Input", Main.result(0,50,50));
    }

    @Test
    void TC02() {
        assertEquals("Invalid Input", Main.result(101,50,50));
    }

    @Test
    void TC03() {
        assertEquals("Invalid Input", Main.result(50,0,50));
    }

    @Test
    void TC04() {
        assertEquals("Invalid Input", Main.result(50,101,50));
    }

    @Test
    void TC05() {
        assertEquals("Invalid Input", Main.result(50,50,0));
    }

    @Test
    void TC06() {
        assertEquals("Invalid Input", Main.result(50,50,101));
    }
}
package test;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvalidInputTest {
    @Test
    void TC_01() {
        assertEquals("Invalid Input", Main.decideLoan(17, 250.0, 600, 'C'));
    }

    @Test
    void TC_02() {
        assertEquals("Invalid Input", Main.decideLoan(66, 250.0, 600, 'C'));
    }

    @Test
    void TC_03() {
        assertEquals("Invalid Input", Main.decideLoan(30, 4.9, 600, 'C'));
    }

    @Test
    void TC_04() {
        assertEquals("Invalid Input", Main.decideLoan(30, 500.1, 600, 'C'));
    }

    @Test
    void TC_05() {
        assertEquals("Invalid Input", Main.decideLoan(30, 250.0, 299, 'C'));
    }

    @Test
    void TC_06() {
        assertEquals("Invalid Input", Main.decideLoan(30, 250.0, 851, 'C'));
    }

    @Test
    void TC_07() {
        assertEquals("Invalid Input", Main.decideLoan(30, 250.0, 600, 'X'));
    }


}
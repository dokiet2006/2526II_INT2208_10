package test;

import main.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LogicTest {
    @Test
    void TC_08() {
        assertEquals("REJECT", Main.decideLoan(30, 10.0, 400, 'C'));
    }

    @Test
    void TC_09() {
        assertEquals("REJECT", Main.decideLoan(30, 20.0, 400, 'C'));
    }

    @Test
    void TC_10() {
        assertEquals("MANUAL REVIEW", Main.decideLoan(30, 10.0, 800, 'C'));
    }

    @Test
    void TC_11() {
        assertEquals("REJECT", Main.decideLoan(30, 10.0, 600, 'C'));
    }

    @Test
    void TC_12() {
        assertEquals("APPROVE", Main.decideLoan(30, 20.0, 800, 'C'));
    }

    @Test
    void TC_13() {
        assertEquals("APPROVE", Main.decideLoan(30, 20.0, 600, 'C'));
    }

    @Test
    void TC_14() {
        assertEquals("MANUAL REVIEW", Main.decideLoan(30, 20.0, 800, 'F'));
    }

    @Test
    void TC_15() {
        assertEquals("MANUAL REVIEW", Main.decideLoan(30, 20.0, 600, 'F'));
    }
}
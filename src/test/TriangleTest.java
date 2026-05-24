package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import main.Main;

public class TriangleTest {

    @Test void TC01() {
        assertEquals("Invalid Input", Main.result(0,50,50));
    }

    @Test void TC02() {
        assertEquals("Invalid Input", Main.result(101,50,50));
    }

    @Test void TC03() {
        assertEquals("Invalid Input", Main.result(50,0,50));
    }

    @Test void TC04() {
        assertEquals("Invalid Input", Main.result(50,101,50));
    }

    @Test void TC05() {
        assertEquals("Invalid Input", Main.result(50,50,0));
    }

    @Test void TC06() {
        assertEquals("Invalid Input", Main.result(50,50,101));
    }

    @Test void TC07() {
        assertEquals("Not a Triangle", Main.result(10,20,50));
    }

    @Test void TC08() {
        assertEquals("Not a Triangle", Main.result(1,2,3));
    }

    @Test void TC09() {
        assertEquals("Equilateral", Main.result(50,50,50));
    }

    @Test void TC10() {
        assertEquals("Equilateral", Main.result(100,100,100));
    }

    @Test void TC11() {
        assertEquals("Isosceles", Main.result(50,50,40));
    }

    @Test void TC12() {
        assertEquals("Isosceles", Main.result(40,50,50));
    }

    @Test void TC13() {
        assertEquals("Isosceles", Main.result(50,40,50));
    }

    @Test void TC14() {
        assertEquals("Scalene", Main.result(3,4,5));
    }

    @Test void TC15() {
        assertEquals("Scalene", Main.result(98,99,100));
    }
}
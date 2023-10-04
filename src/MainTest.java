import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void calculateGrade() {
        assertEquals('A', Main.calculateGrade(96));
        assertEquals('B', Main.calculateGrade(80));
        assertEquals('C', Main.calculateGrade(75));
        assertEquals('D', Main.calculateGrade(65));
        assertEquals('F', Main.calculateGrade(54));
    }

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        assertEquals("fizz", Main.fizzBuzz(2));
        assertEquals("buzz", Main.fizzBuzz(7));
        assertEquals("fizzbuzz", Main.fizzBuzz(14));
        assertEquals("unlucky", Main.fizzBuzz(15));
        assertEquals("buzz", Main.fizzBuzz(105));
    }

    @org.junit.jupiter.api.Test
    void frontBack() {
        assertEquals("lohellolo", Main.backFront("hello"));
        assertEquals("hihihi", Main.backFront("hi"));
        assertEquals("g", Main.backFront("g"));
    }

    @org.junit.jupiter.api.Test
    void twoAsOne() {
        assertTrue(Main.twoAsOne(4,2,2));
        assertTrue(Main.twoAsOne(-4,-11,44));
        assertFalse(Main.twoAsOne(4,6,12));
    }

    @org.junit.jupiter.api.Test
    void endUp() {
        assertEquals("HEllo", Main.endDown("HELLO"));
        assertEquals("FOR Sure", Main.endDown("FOR SURE"));
        assertEquals("gg", Main.endDown("GG"));
    }
}
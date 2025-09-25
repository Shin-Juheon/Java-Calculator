import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calc = new Calculator();
        calc.setNumbers(10, 20);
        assertEquals(30,calc.add());
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calc = new Calculator();
        calc.setNumbers(30, 10);
        assertEquals(20,calc.subtract());

    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calc = new Calculator();
        calc.setNumbers(40, 50);
        assertEquals(2000,calc.multiply());
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calc = new Calculator();
        calc.setNumbers(70, 10);
        assertEquals(7,calc.divide());
    }
}
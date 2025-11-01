import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScientificCalculatorTest {
    ScientificCalculator scientificCalc;

    @BeforeEach
    void setUp() {
        scientificCalc = new ScientificCalculator();
        scientificCalc.setNumbers(5, 3);
    }

    @Test
    void power() {
        assertEquals(125, scientificCalc.Power());
    }

    @Test
    void Modulo() {assertEquals(2, scientificCalc.Modulo());}
}
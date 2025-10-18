import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ScientificCalculatorTest {
    ScientificCalculator scientificCalc;

    @BeforeEach
    void setUp() {
        scientificCalc = new ScientificCalculator();
        scientificCalc.setNumbers(6, 3);
    }

    @Test
    void power() {
        assertEquals(1296, scientificCalc.Power());
    }
}
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorAcceptanceTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    public void validAdditionShouldReturnCorrectResult() {
        double result = calculator.add(10, 5);
        assertEquals(15.0, result, 0.001);
    }

    @Test
    public void validDivisionShouldReturnCorrectResult() {
        double result = calculator.divide(20, 4);
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void divisionByZeroShouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Division by zero", exception.getMessage());
    }

    @Test
    public void subtractionShouldBeAccurate() {
        double result = calculator.subtract(7, 3);
        assertEquals(4.0, result, 0.001);
    }
}
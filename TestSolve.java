
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class TestSolve {
    @Test
    @DisplayName("Debe resolver suma simple: 2+3 = 5")

    public void testSolveSimpleAddition() {
        String formula = "2+3";
        String result = Operations.Solve(formula);
        assertEquals("2+3=5", result);
    }

    @Test
    @DisplayName("Debe resolver resta simple: 7-4 = 3")

    public void testSolveSimpleSubtraction() {
        String formula = "7-4";
        String result = Operations.Solve(formula);
        assertEquals("7-4=3", result);
    }

    @Test
    @DisplayName("Debe resolver multiplicación simple: 6*3 = 18")

    public void testSolveSimpleMultiplication() {
        String formula = "6*3";
        String result = Operations.Solve(formula);
        assertEquals("6*3=18", result);
    }

    @Test
    @DisplayName("Debe resolver división simple: 12 / 4 = 3")

    public void testSolveSimpleDivision() {
        String formula = "12/4";
        String result = Operations.Solve(formula);
        assertEquals("12/4=3", result);
    }

    @Test
   @DisplayName("Debe respetar precedencia: 6 + 2 * 3 = 12")

    public void testSolveOperatorPrecedence() {
        String formula = "6+2*3";
        String result = Operations.Solve(formula);
        assertEquals("6+2*3=12", result); // Verifica que se resuelva la multiplicación primero
    }

    @Test
    @DisplayName("Debe respetar precedencia: 8 - 4 / 2 = 6")

    public void testSolveOperatorPrecedence2() {
        String formula = "8-4/2";
        String result = Operations.Solve(formula);
        assertEquals("8-4/2=6", result); // Verifica que se resuelva la división primero
    }

    @Test
    @DisplayName("Debe resolver correctamente con números grandes: 1000 + 2000 - 500 = 2500")
    public void testSolveLargeNumbers() {
        String formula = "1000+2000-500";
        String result = Operations.Solve(formula);
        assertEquals("1000+2000-500=2500", result);
    }

    @Test
    @DisplayName("Debe lanzar ArithmeticException al dividir por cero")
    public void testDivisionByZero() {
    String formula = "10/0";
    assertThrows(ArithmeticException.class, () -> Operations.Solve(formula));
}

}

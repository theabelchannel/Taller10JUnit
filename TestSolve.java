package com.mycompany.calculadorasmp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class TestSolve {
    @Test
    @DisplayName("Resolver suma simple: 2+3=5")
    public void testSolveSimpleAddition() {
        String formula = "2+3";
        String result = Operations.Solve(formula);
        assertEquals("2+3=5", result);
    }

    @Test
    @DisplayName("Resolver resta simple: 10-4 = 6")
    public void testSolveSimpleSubtraction() {
        String formula = "10-4";
        String result = Operations.Solve(formula);
        assertEquals("10-4=6", result);
    }

    @Test
    @DisplayName("Resolver multiplicación simple: 6*3 = 18")
    public void testSolveSimpleMultiplication() {
        String formula = "6*3";
        String result = Operations.Solve(formula);
        assertEquals("6*3=18", result);
    }

    @Test
    @DisplayName("Resolver división simple: 12 / 4 = 3")
    public void testSolveSimpleDivision() {
        String formula = "12/4";
        String result = Operations.Solve(formula);
        assertEquals("12/4=3", result);
    }

    
    @Test
    @DisplayName("Resolver con precedencia de operadores: 6 + 2 * 3 = 12")
    public void testSolveOperatorPrecedence() {
        String formula = "6+2*3";
        String result = Operations.Solve(formula);
        assertEquals("6+2*3=12", result); // Verifica que se resuelva la multiplicación primero
    }

    @Test
    public void testSolveOperatorPrecedence2() {
        String formula = "10-6/2";
        String result = Operations.Solve(formula);
        assertEquals("10-6/2=7", result); // Verifica que se resuelva la división primero
    }

    @DisplayName("Resolver números más grandes: 1000 + 2000 - 500 = 2500")
    @Test
    public void testSolveLargeNumbers() {
        String formula = "1000+2000-500";
        String result = Operations.Solve(formula);
        assertEquals("1000+2000-500=2500", result);
    }
    
}

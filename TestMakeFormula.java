package com.mycompany.calculadorasmp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class TestMakeFormula {

    @Test
    @DisplayName("Debe generar una fórmula no nula")
    public void testFormulaNotNull() {
        String formula = Operations.MakeFormula();
        assertNotNull(formula, "La fórmula no debería ser nula");
    }

    @Test
    @DisplayName("Debe generar una fórmula no vacía")
    public void testFormulaNotEmpty() {
        String formula = Operations.MakeFormula();
        assertFalse(formula.isEmpty(), "La fórmula no debería estar vacía");
    }

    @Test
    @DisplayName("La fórmula debe contener al menos un operador válido (+, -, *, /)")
    public void testFormulaContainsOperator() {
        String formula = Operations.MakeFormula();
        assertTrue(formula.matches(".*[+\\-*/].*"), "La fórmula debería contener al menos un operador");
    }

    @Test
    @DisplayName("La fórmula debe contener solo números y operadores válidos")
    public void testFormulaOnlyValidCharacters() {
        String formula = Operations.MakeFormula();
        assertTrue(formula.matches("[0-9+\\-*/]+"), "La fórmula contiene caracteres no válidos");
    }

    @Test
    @DisplayName("Imprimir la fórmula generada (propósito de depuración)")
    public void testPrintFormula() {
        String formula = Operations.MakeFormula();
        System.out.println("Fórmula generada: " + formula);
    }
}


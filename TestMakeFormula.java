/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculadorasmp;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;

public class TestMakeFormula {
    
   @Test
   @DisplayName("Debe generar una fórmula válida con números y operadores")

   
    public void testMakeFormula() {
        String formula = Operations.MakeFormula();
        
        // Verificar que la fórmula no sea nula o vacía
        assertNotNull(formula);
        assertFalse(formula.isEmpty());
        
        // Verificar que la fórmula contenga operadores válidos
        assertTrue(formula.matches(".*[+\\-*/].*"), "La fórmula debería contener al menos un operador");
        
        // Verificar que todos los caracteres sean números o operadores válidos
        assertTrue(formula.matches("[0-9+\\-*/]+"), "La fórmula contiene caracteres no válidos");
        
        System.out.println("Fórmula generada: " + formula);
    }

    
}

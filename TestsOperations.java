import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestsOperations {
    
   @Test
   @DisplayName("Haciendo pruebas de MakeFormula")
    public void testMakeFormula() {
        String formula = Operations.MakeFormula();
        @Test
        @DisplayName("Verificar que en la formula no este vacia o sea nula")
        assertNotNull(formula);
        assertFalse(formula.isEmpty());
        
        @Test
        @DisplayName("Se verifica que se esten usando los operadores permitidos")
        assertTrue(formula.matches(".*[+\\-*/].*"), "La fórmula debe contener al menos un signo de operador");
        
        @Test 
        @DisplayName("Se verifica que los caracteres ingresados sean validos")
        assertTrue(formula.matches("[0-9+\\-*/]+"), "La fórmula contiene caracteres invalidos");
        
        System.out.println("Formula generada: " + formula);
    }

    
}

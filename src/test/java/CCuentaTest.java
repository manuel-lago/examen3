/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import examen3refactorizado.CCuenta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author persona
 */
public class CCuentaTest {

    public CCuentaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    @Test
    public void testInferiorCero() {
        CCuenta cuenta = new CCuenta();
        assertEquals(1, cuenta.ingresar(-10)); //Lanza ese mensaje si no cuadra
    }
    
    @Test
    public void testCero() {
        CCuenta cuenta = new CCuenta();
        assertEquals(1, cuenta.ingresar(0)); //Lanza ese mensaje si no cuadra
    }
    
    @Test
    public void testSuperior3000() {
        CCuenta cuenta = new CCuenta();
        assertEquals(1, cuenta.ingresar(4000)); //Lanza ese mensaje si no cuadra
    }
    
    @Test
    public void test3000() {
        CCuenta cuenta = new CCuenta();
        assertEquals(0, cuenta.ingresar(3000)); //Lanza ese mensaje si no cuadra
    }

    @Test
    public void testValido() {
        CCuenta cuenta = new CCuenta();
        assertEquals(0, cuenta.ingresar(2900)); //Lanza ese mensaje si no cuadra
    }
    // @Test
    // public void hello() {}
}

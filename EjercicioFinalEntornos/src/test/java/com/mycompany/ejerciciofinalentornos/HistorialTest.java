/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejerciciofinalentornos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alejandro
 */
public class HistorialTest {
    
    public HistorialTest() {
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

    /**
     * Test of insertarResultado method, of class Historial.
     */
    @Test
    public void testInsertarResultado1() {
        System.out.println("insertarResultado");
        String ganador = "";
        int nivel = 0;
        boolean expResult = false;
        boolean result = Historial.insertarResultado(ganador, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        /**
     * Test of insertarResultado method, of class Historial.
     */
    @Test
    public void testInsertarResultado2() {
        System.out.println("insertarResultado");
        String ganador = "";
        int nivel = 1;
        boolean expResult = true;
        boolean result = Historial.insertarResultado(ganador, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
        
        /**
     * Test of insertarResultado method, of class Historial.
     */
    @Test
    public void testInsertarResultado3() {
        System.out.println("insertarResultado");
        String ganador = "";
        int nivel = 2;
        boolean expResult = true;
        boolean result = Historial.insertarResultado(ganador, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        
        /**
     * Test of insertarResultado method, of class Historial.
     */
    @Test
    public void testInsertarResultado4() {
        System.out.println("insertarResultado");
        String ganador = "";
        int nivel = 3;
        boolean expResult = true;
        boolean result = Historial.insertarResultado(ganador, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

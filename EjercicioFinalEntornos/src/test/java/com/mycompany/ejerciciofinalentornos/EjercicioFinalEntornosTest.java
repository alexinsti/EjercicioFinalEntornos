/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ejerciciofinalentornos;

import java.util.ArrayList;
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
public class EjercicioFinalEntornosTest {
    
    public EjercicioFinalEntornosTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    /*
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
*/
    /**
     * Test of main method, of class EjercicioFinalEntornos.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EjercicioFinalEntornos.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @org.junit.jupiter.api.Test
    public void testGeneraGanador() {
        System.out.println("generaGanador");
        String jugada = "";
        int nivel = 0;
        String expResult = "";
        String result = EjercicioFinalEntornos.generaGanador(jugada, nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generaResultados method, of class EjercicioFinalEntornos.
     */
    @org.junit.jupiter.api.Test
    public void testGeneraResultados() {
        System.out.println("generaResultados");
        int nivel = 0;
        ArrayList<String> expResult = null;
        ArrayList<String> result = EjercicioFinalEntornos.generaResultados(nivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generaTiradas method, of class EjercicioFinalEntornos.
     */
    @org.junit.jupiter.api.Test
    public void testGeneraTiradas() {
        System.out.println("generaTiradas");
        String expResult = "";
        String result = EjercicioFinalEntornos.generaTiradas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

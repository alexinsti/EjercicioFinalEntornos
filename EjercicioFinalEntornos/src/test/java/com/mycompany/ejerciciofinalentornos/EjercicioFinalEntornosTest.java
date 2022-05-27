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
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList1_1() {
        System.out.println("generaGanador");
        String jugada = "piedra";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("papel");
        resultados.add("piedra");
        resultados.add("tijeras");
        String expResult = "Has perdido";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList1_2() {
        System.out.println("generaGanador");
        String jugada = "piedra";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("tijeras");
        resultados.add("tijeras");
        resultados.add("tijeras");
        String expResult = "Has ganado";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
         /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList1_3() {
        System.out.println("generaGanador");
        String jugada = "piedra";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("tijeras");
        resultados.add("piedra");
        resultados.add("tijeras");
        String expResult = "Empate";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
      /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList2_1() {
        System.out.println("generaGanador");
        String jugada = "papel";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("papel");
        resultados.add("piedra");
        resultados.add("tijeras");
        String expResult = "Has perdido";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList2_2() {
        System.out.println("generaGanador");
        String jugada = "papel";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("piedra");
        resultados.add("piedra");
        resultados.add("piedra");
        String expResult = "Has ganado";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
         /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList2_3() {
        System.out.println("generaGanador");
        String jugada = "papel";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("papel");
        resultados.add("papel");
        resultados.add("papel");
        String expResult = "Empate";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     
      /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList3_1() {
        System.out.println("generaGanador");
        String jugada = "papel";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("papel");
        resultados.add("piedra");
        resultados.add("tijeras");
        String expResult = "Has perdido";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList3_2() {
        System.out.println("generaGanador");
        String jugada = "tijeras";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("papel");
        resultados.add("papel");
        resultados.add("papel");
        String expResult = "Has ganado";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
         /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList3_3() {
        System.out.println("generaGanador");
        String jugada = "tijeras";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("tijeras");
        resultados.add("tijeras");
        resultados.add("tijeras");
        String expResult = "Empate";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
        
               /**
     * Test of generaGanador method, of class EjercicioFinalEntornos.
     */
    @Test
    public void testGeneraGanador_String_ArrayList4_1() {
        System.out.println("generaGanador");
        String jugada = "motosierra";
        ArrayList<String> resultados = new ArrayList();
        resultados.add("tijeras");
        resultados.add("tijeras");
        resultados.add("tijeras");
        String expResult = "Tomatelo en serio";
        String result = EjercicioFinalEntornos.generaGanador(jugada, resultados);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

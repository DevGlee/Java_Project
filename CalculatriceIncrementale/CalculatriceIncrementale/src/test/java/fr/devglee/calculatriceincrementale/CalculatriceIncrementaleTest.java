/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.devglee.calculatriceincrementale;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author DevGlee
 */
public class CalculatriceIncrementaleTest {
    
    public CalculatriceIncrementaleTest() {
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
    
 
    /**
     * Test of ajouter method, of class CalculatriceIncrementale.
     */
    @org.junit.jupiter.api.Test
    public void testAjouter() {
        System.out.println("ajouter");
        int a = 5;
        int b = 5;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 10;
        int result = instance.ajouter(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of soustraire method, of class CalculatriceIncrementale.
     */
    @org.junit.jupiter.api.Test
    public void testSoustraire() {
        System.out.println("soustraire");
        int a = 5;
        int b = 5;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 0;
        int result = instance.soustraire(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of multiplier method, of class CalculatriceIncrementale.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplier() {
        System.out.println("multiplier");
        int a = 5;
        int b = 5;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 25;
        int result = instance.multiplier(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of diviser method, of class CalculatriceIncrementale.
     */
    @org.junit.jupiter.api.Test
    public void testDiviser() {
        System.out.println("diviser");
        int a = 5;
        int b = 5;
        CalculatriceIncrementale instance = new CalculatriceIncrementale();
        int expResult = 1;
        int result = instance.diviser(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author CES
 */
public class OperacionesTest {
    
    public OperacionesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumarPar method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarPar() {
        System.out.println("sumarPar");
        Operaciones instance = new Operaciones();
        int a = 2;
        int b = 2;
        
        int expResult = 4;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    @Ignore
    @Test
    public void testSumarImPar() {
        System.out.println("sumarPar");
        Operaciones instance = new Operaciones();
        int a = 1;
        int b = 2;
        
        int expResult = 4;
        int result = instance.sumarPar(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of mayor method, of class Operaciones.
     */
    
    @Test
    public void testMayor() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        int a = 2;
        int b = 1;
        
        int expResult = 2;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
      @Ignore
    @Test
    public void testMayorb() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        int a = 0;
        int b = 0;
        
        int expResult = 0;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }  @Ignore
    @Test
    public void testIgual() {
        System.out.println("mayor");
        Operaciones instance = new Operaciones();
        int a = 0;
        int b = 0;
        
        int expResult = 0;
        int result = instance.mayor(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of sumarVector method, of class Operaciones.
     */
    @Ignore
    @Test
    public void testSumarVector() {
        System.out.println("sumarVector");
        Operaciones instance = new Operaciones();
        int[] numeros = null;
        
        int expResult = 0;
        int result = instance.sumarVector(numeros);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesse_tests;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Selvyn
 */
public class InvertedEchoTest {
    
    public InvertedEchoTest() {
    }

    /**
     * Test of setOriginalText method, of class InvertedEcho.
     */
    @Test
    public void testSetOriginalText() {
        System.out.println("setOriginalText");
        String text = "";
        InvertedEcho instance = new InvertedEcho();
        instance.setOriginalText(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InvertedText method, of class InvertedEcho.
     */
    @Test
    public void testInvertedText() {
        System.out.println("InvertedText");
        InvertedEcho instance = new InvertedEcho();
        String expResult = "";
        String result = instance.InvertedText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

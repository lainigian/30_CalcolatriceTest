/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laini._calcolatricetest;

import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author User
 */
public class CalcolatriceTest 
{
    Calcolatrice c1;
    @Before
    public void inizializzazione()
    {
       c1=new Calcolatrice();;
    }
    /**
     * Test of somma method, of class Calcolatrice.
     */
    @Test
    public void testSomma()
    {
        //Calcolatrice c1= new Calcolatrice();
        int atteso,attuale;
        
        atteso=8;
        attuale=c1.somma(3, 5);
        
        assertEquals("Somma fra 3 e 5", atteso,attuale);
    }

    /**
     * Test of sottrai method, of class Calcolatrice.
     */
    @Test
    public void testSottrai()
    {
        //Calcolatrice c1= new Calcolatrice();
        int atteso,attuale;
        
        atteso=-2;
        attuale=c1.sottrai(3, 5);
        
        assertEquals("sottrazione fra 3 e 5", atteso,attuale);
    }

    /**
     * Test of dividi method, of class Calcolatrice.
     */
    @Test
    public void testDividi() 
    {
       // Calcolatrice c1= new Calcolatrice();
        String atteso,attuale;
        
        atteso="2";
        attuale=c1.dividi(10,5);
        assertEquals("Divisione fra 10 e 5",atteso, attuale);
    }
    
   
}

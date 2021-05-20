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
       c1=new Calcolatrice();
        System.out.println("Vedi");
    }
   
    /**
     * Test of somma method, of class Calcolatrice.
     */
    @Test
    public void testSomma()
    {
       // Calcolatrice c1= new Calcolatrice();
        int atteso,attuale;
        
        atteso=8;
        attuale=c1.somma(3, 5);
        
        //assertEquals("Somma fra 3 e 5", atteso,attuale);
        assertTrue("aomma fra 3 e 5 = 8", atteso==attuale);
    }

    /**
     * Test of sottrai method, of class Calcolatrice.
     */
    @Test
    public void testSottrai()
    {
      //  Calcolatrice c1= new Calcolatrice();
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
       int atteso,attuale;
       atteso=2;
       attuale=c1.dividi(10,5);
       assertEquals("Divisione fra 10 e 5",atteso, attuale);
    }
    
    @Test (expected = ArithmeticException.class)
    public void testDividiPerZero()
    {
     //  Calcolatrice c1= new Calcolatrice();
       int atteso,attuale;
        
       atteso=2;
       attuale=c1.dividi(10,0);    
    }
    
    
    @Test
    public void testFibonacci()
    {
    //    Calcolatrice c1= new Calcolatrice();
        //fibonacci(1)
        int[] atteso,attuale;
        atteso=new int[1];
        atteso[0]=1; 
        attuale=c1.fibonacci(1);
        assertArrayEquals("Fibonacci di 1",atteso,attuale);
        
        //Fibonacci di 2
        atteso=new int[2];
        atteso[0]=1; 
        atteso[1]=1;
        attuale=c1.fibonacci(2);
        assertArrayEquals("Fibonacci di 2",atteso,attuale);
        
        //Fibonacci di 7
        atteso=new int[7];
        atteso[0]=1; 
        atteso[1]=1;
        atteso[2]=2; 
        atteso[3]=3;
        atteso[4]=5; 
        atteso[5]=8;
        atteso[6]=13; 
        attuale=c1.fibonacci(7);
        assertArrayEquals("Fibonacci di 7",atteso,attuale);
        
    }
    
    
    
   
}

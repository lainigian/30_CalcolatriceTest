/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laini._calcolatricetest;

/**
 *
 * @author User
 */
public class Calcolatrice 
{
    
    public int somma(int x, int y)
    {
        return x+y;
    }
    
    public int sottrai (int x, int y)
    {
        return (x-y);
    }
    
    public int dividi(int x, int y)
    {
        return x/y;               
    }
    
    public int valoreAssoluto(int x)
    {
        if (x>=0)
            return x;
        else
            return -x;
    }
    
    public int[] fibonacci(int x) 
    {
        
        
        
        int[] successioneFibonacci=new int[x];
        
        if (x==1)
        {
           successioneFibonacci[0]=1;
        }
        else if (x==2)
        {
           successioneFibonacci[0]=1; 
           successioneFibonacci[1]=1; 
        }
        else
        {
           
            successioneFibonacci[0]=1;
            successioneFibonacci[1]=1;
            for (int i=2;i<x;i++)
            {
                successioneFibonacci[i]=successioneFibonacci[i-1]+successioneFibonacci[i-2];
            }
        }
        return successioneFibonacci;
        
    }

}

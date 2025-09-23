/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// sum of n natural number
package Recurssion;

/**
 * 
 * @author Administrator
 */
public class PWQ6
{
    static int nNaturalNum(int n)
    {
       if(n == 0)
       {
          return 0;
       }
       return n+nNaturalNum(n-1);
    }        
    public static void main(String[] args)
    {
        System.out.println(nNaturalNum(5));
    }        
}

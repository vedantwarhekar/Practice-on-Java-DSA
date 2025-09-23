/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q print fibonache series upto given number
 * @author Administrator
 */
public class Problem5 
{
    public static void printFabonache(int a,int b,int n)
    {
       if(n==0)
       {
         return;
       }
       int c = a+b;
       System.out.println(c);
       printFabonache(b,c,n-1);
       
    }        
    public static void main(String[] args)
    {
      int a = 0;
      int b = 1;
      int n = 15;
      printFabonache(a,b,n-1);
    }        
}

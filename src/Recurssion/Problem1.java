/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 *
 *  Q write a java program to print value 5 to 1
 */
public class Problem1
{
    public static void printval(int n)
    {
       if(n == 0)
       {
         return;
       }
       System.out.println(n);
       printval(n-1);
    }        
    public static void main(String[] args)
    {
        int n=5;
        printval(n);
    }        
}

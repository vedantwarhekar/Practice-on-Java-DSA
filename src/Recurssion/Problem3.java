/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 *
 * Q write a java p[rogram to print sum of n natural numbers
 */
public class Problem3 
{
  public static void printSum(int i,int n,int sum)
  {
        if(i==n)
        {
          sum += i;
          System.out.println(sum);
          return;
        }
        sum += i;
        printSum(i+1,n,sum);        
  }
  public static void main(String[] args)
  {
     printSum(1,5,0);
  }        
}

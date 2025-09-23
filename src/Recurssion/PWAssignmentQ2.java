/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q2 - Find m-th summation of first n natural numbers where m-th summation of
 * first n natural numbers is defined as following: If m > 1: SUM(n, m) =
 * SUM(SUM(n, m - 1), 1) Else :SUM(n, 1) = Sum of first n natural numbers.
 *
 * Input1: n = 3, m = 2 
 * Output1: SUM(3, 2) = 21 
 * Explanation : SUM(3, 2)
 * = SUM(SUM(3, 1), 1)
 * = SUM(6, 1) = 21 
 * Input2 : n = 4, m = 1 Output2 : SUM(4, 1)
 * = 1
 *
 * @author c068
 */
public class PWAssignmentQ2 
{
   static int Sum(int n,int m)
   {
      if(m == 1)
      {
        return (n *(n+1)/2);
      }
      int sum = Sum(n,m-1);
      return (sum * (sum+1)/2);
   }        
   public static void main(String[] args)
   {
     System.out.println(Sum(3,2));
   }        
}

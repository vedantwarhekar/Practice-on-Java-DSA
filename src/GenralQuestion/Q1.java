/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

import java.util.Scanner;

/**
 * Q print palindrome number upto n;
 * @author Administrator
 */
public class Q1 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Entre a number:- ");
     int num = sc.nextInt();
     
     int a =0;
     int b =1;
     for(int i=0;i<num;i++)
     { 
        System.out.println("the palindrome siries is :- "+a);
        int c = a + b;
        a = b;
        b = c ;
     }    
  }        
}

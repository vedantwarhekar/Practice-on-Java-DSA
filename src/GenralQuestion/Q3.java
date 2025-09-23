/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

import java.util.Scanner;

/**
 * Q count the digit in the number 
 * @author Administrator
 */
public class Q3
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.print("Entre a number :- ");
     int num = sc.nextInt();
     int count =0;
     while(num!=0)
     {
        num = num/10;
        count++;
     }    
     System.out.println("total number of digit in number is:- "+count);
  }        
}

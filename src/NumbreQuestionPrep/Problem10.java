/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

import java.util.Scanner;

/**
 * Q Octal to binary conversion using Java
 * 
 * @author Administrator
 */
public class Problem10
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre a octal numbre :- ");
      int octal = Integer.parseInt(sc.nextLine(),8);
      
      String binary = Integer.toBinaryString(octal);
      System.out.println("the binary numbre is " +  binary);
   }
}

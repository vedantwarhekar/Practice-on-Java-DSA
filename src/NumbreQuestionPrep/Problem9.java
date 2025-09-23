/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

import java.util.Scanner;

/**
 * Q binary to octal conversion
 * note that we can convert binary to octal by 2 ways
 * first is convert binary to decimal and than convert it into octal
 * otherwise use method like 
 * @author Administrator
 */
public class Problem9 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Entre a binary numbre");
     int num = Integer.parseInt(sc.nextLine(),2);
     
     String octal = Integer.toOctalString(num);
     System.out.println("the octal conversion is :- "+ octal);
  }        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;
import java.util.Scanner;
/**
 *  java Program for Replace All 0’s With 1 In A Given Integer
Replace All 0’s With 1 In A Given Integer using Python
Here we will discuss how to Replace All 0’s With 1 In A Given Integer using java.

The concept is simple, find the digits of the integer. Compare each digit with 0 if the 
* digit is equal to 0 then replace it with 
* 1. Construct the new integer with the replaced digits.
 * @author Administrator
 */
public class Problem14 
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre a numbre :- ");
      int num = sc.nextInt();
      
      String num2 = Integer.toString(num);
      int length = num2.length();
      String str = "";
      
      for(int i=0;i<length;i++)
      {
         if(num2.charAt(i) == '0')
         {
           str = str + '1';
         }
         else
         {
           str = str +num2.charAt(i);
         }    
      }    
      System.out.println("Converted numbre is :- "+str);
              
   }        
}

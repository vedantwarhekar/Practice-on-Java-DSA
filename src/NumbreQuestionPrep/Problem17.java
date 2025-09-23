/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;
import java.util.Scanner;
/**
 * Q Java Code to find number of digits in an integer
 * @author Administrator
 */
public class Problem17
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count = 0;
      while(num > 0)
      {
         num/=10;
         count++;
      }
      System.out.println("the numbre have "+count+" dight");
   }        
}

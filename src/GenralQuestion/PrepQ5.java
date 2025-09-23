/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 *  Q Find the Reverse of a Number in Java Language
 * @author Administrator
 */
public class PrepQ5
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int reverse = 0;
      while(number != 0)
      {
         int rem = number%10;
         reverse = reverse*10+rem;
         number /= 10; 
      }
      System.out.println("the reverse of a number is "+reverse);
   }        
  }        

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

/**
 *  Occurrence of a digit in a given number using Java
 * @author Administrator
 */
public class Problem20
{
   public static void main(String[] args)
   {
      int num = 565554655;
      int dight = 5;
      int count =0;
      
      while(num>0)
      {
        int num1 = num%10;
        if(num1==dight)
        {
         count++;
        }
        num/=10;
      }
      System.out.println("the occurance odf the numbre is " + count);
   }        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

/**
 * finding power of value itretaive method
 * @author Administrator
 */
public class Q11
{
   public static void main(String[] args)
   {
      int num =5;
      int pow = 5;
      int result =1;
      for(int i=pow;i>0;i--)
      {
        result *= num;
      }
      System.out.println(result);
   }        
}

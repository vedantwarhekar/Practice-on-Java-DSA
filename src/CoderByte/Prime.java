/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoderByte;

/**
 *
 * @author c068
 */
public class Prime {
    static boolean prime(int num)
    {
      if(num<=1)return false;
      for(int i=2;i<=num/2;i++)
      {
         if(num % i == 0)
             return false;
      }
      return true;
    }        
    public static void main(String[] args)
    {
      for(int i=100;i>=1;i--)
      {
         if(prime(i))
             System.out.println(i);
      }    
    }        
}

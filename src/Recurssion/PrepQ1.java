/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q Power of a Number using Recursion in Java
 * @author Administrator
 */
public class PrepQ1
{
  public static void main(String[] args)
  {
     int num = 3,pow = 5;
     System.out.println(pow(num,pow));
  }
  static int pow(int numbre,int pow)
  {
    if(pow==0)
    {
      return 1;
    }
    return numbre * pow(numbre,pow-1);
    
  }        
}

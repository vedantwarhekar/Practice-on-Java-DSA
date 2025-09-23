/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 * Q print x^n (stack height=n)
 * @author Administrator
 */
public class Problem6
{
  public static int calculatePower(int x,int n)
  {
      if(n==0)
      {
        return 1;
      }
      if(x==0)
      {
        return 0;
      }
      int xpownm1 = calculatePower(x,n-1);
      int xpown = x*xpownm1;
      return xpown;
  }        
  public static void main(String[] args)
  {
     int x=2,n=5;
     int ans = calculatePower(x,n);
     System.out.println(ans);
  }        
}

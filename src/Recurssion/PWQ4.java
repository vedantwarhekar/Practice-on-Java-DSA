/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;
// write a java program to find the power of a number
/**
 *
 * @author Administrator
 */
public class PWQ4 
{
    static int findPow(int n,int pow)
    {
       if(pow == 0)
       {
          return 1;
       }
       return n * findPow(n,pow-1);
    }        
    public static void main(String[] args)
    {
        System.out.println(findPow(8,2));
    }        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;
// given a numbers n print the sum of natural number till n but with
//   alternative signs
/**
 *
 * @author Administrator
 */
public class PWQ7 
{
    static int findNaturalSumAltarnatve(int n)
    {
       if(n==0)
       {
           return 1;
       }
       if(n%2==0)
       {
          return findNaturalSumAltarnatve(n-1)-n;
       }
       return findNaturalSumAltarnatve(n-1)+n;
    }        
    public static void main(String[] args)
    {
        int ans = findNaturalSumAltarnatve(10);
        System.out.println(ans);
    }        
}

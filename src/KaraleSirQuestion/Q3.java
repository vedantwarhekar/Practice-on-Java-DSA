/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaraleSirQuestion;

/**
 * 3. Check Whether or Not the Number is a Palindrome 
 * @author c068
 */
public class Q3 {
    public static void main(String[] args)
    {
       int num = 252;
       int temp = num;
       int reverse = 0;
       while(temp != 0)
       {
          int n = temp%10;
          reverse = reverse * 10 + n;
          temp/=10;
       } 
       if(num == reverse)
       {
         System.out.println("palindrome");
       }else
       {
         System.out.println(" not palindrome");
       }    
    }        
}

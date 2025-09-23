/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KaraleSirQuestion;

/**
 * 1 - Write a code to reverse a number
 * @author c068
 */
public class Q1 {
    public static void main(String[] args)
    {
      int num = 5654541;
      int sum = 0;
      int reverse = 0;
      while(num > 0)
      {
        int n = num%10;
        reverse = reverse * 10 +n;
        num/=10;
      }   
      System.out.println(reverse);
    }        
}

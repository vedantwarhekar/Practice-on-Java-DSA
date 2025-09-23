/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

import java.util.Scanner;

/**
 * Q print the given number is pyrhagores therom or not
 * @author Administrator
 */
public class Q10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       System.out.print("Entre number 1 :- ");
       int num1 = sc.nextInt();
       System.out.print("Entre number 2 :- ");
       int num2 = sc.nextInt();
       System.out.print("Entre number 3 :- ");
       int num3 = sc.nextInt();
       
       int max = num1;
       if(max<=num2)
       {
          max = num2;
       }
       else if(max <= num3)
       {
          max = num3;
       }
       // cases for finding the flag
       if(max==num1)
       {
         boolean flag = ((num2*num2+num3*num3)==(num1*num1));
         System.out.println(flag);
       }
       else if(max == num2)
       {
          boolean flag = ((num1*num1+num3*num3)==(num2*num2));
          System.out.println(flag);
       }
       else
       {
         boolean flag = ((num1*num1+num2*num2)==(num3*num3));
         System.out.println(flag);
       }
           
    }        
}

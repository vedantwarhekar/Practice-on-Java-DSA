/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

import java.util.Scanner;

/**
 * Q print number of dighits
 * @author Administrator
 */
public class Q5
{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Entre a number :- ");
       int n = sc.nextInt();
    
       int nod =0;
       int temp =n;
       while(temp!=0)
       {
         temp = temp/10;
         nod++;
       }
       int div =(int)Math.pow(10, nod-1);
       while(div !=0)
       {
         int q = n/div;
         System.out.println(q);
         
         n = n%div;
         div = div/10;
       }    
    }    
}
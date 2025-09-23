/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 * Q program for reverse a number
 * @author Administrator
 */
public class Q4
{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Entre a number :- ");
       int n = sc.nextInt();
   
       while(n>0)
       {
         int dig = n%10; 
         n = n/10;
         System.out.print(dig);
         
        }    
   }    
}

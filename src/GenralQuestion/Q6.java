/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Q6 
{
       public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Entre a number :- ");
       int n = sc.nextInt();

       int inv =0;
       int op = 1;
       while(n!=0)
       {
          int od = n%10;
          int id =op;
          int ip = od;
          
          // make changes to inv using ip and id
          inv = inv+id*(int)Math.pow(10,ip -1);
          
          n = n/10;
          op++;
       }  
       System.out.println(inv);
   } 
}

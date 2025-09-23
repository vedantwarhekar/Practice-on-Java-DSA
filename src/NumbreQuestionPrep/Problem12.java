/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

/**
 *Permutations in which n people can occupy r seats in a classroom in java
 * Problem Statement :
In a classroom some of the seats are already occupied by students and only a 
* few seats are available in the classroom. The available seats are assumed as r 
* and n number of students are looking for the seat. 
* We need to find in how many different permutations n number of students 
* can sit on r number of chairs.

Algorithm
Input number of students in n
Input number of seats in r
Use permutation formula { factorial(n) / factorial(n-r) }
Print Output
 * @author Administrator
 */
import java.util.Scanner;

public class Problem12 
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Entre the value of n");
     int n  = sc.nextInt();
     
     System.out.println("Entre the value of r");
     int r  = sc.nextInt();
     
     int fact1 = 1;
     for(int i=n;i>1;i--)
     {
        fact1*=i;
     }
     int numbre = n-r;
     int fact2 = 1;
     for(int i=numbre;i > 1;i--)
     {
        fact2*=i;
     } 
     int per = fact1/fact2;
     System.out.println("total possible arrengments are "+per);
     
   }        
}

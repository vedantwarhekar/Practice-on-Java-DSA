/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;
import java.util.Scanner;
/**
 * Add two fractions using java
 * Concept
 For understanding this in a better way lets suppose an example :

 Suppose, First fraction consist of 1 as numerator and 3 as denominator, and Second fraction consist of 3 as numerator and 9 as denominator.

 (1 / 3) + (3 / 9) = (6 / 9) = (2 / 3)

  Find LCM of 3 and 9 and the result will be 9.
  Multiply 3 in first fraction : (3 / 9) + (3 / 9)
  Add both fractions and then the result will be : (6 / 9)
  Now simplify it by finding the HCF of 6 and 9 and the result will be 3.
  So divide 6 and 9 by 3 and then the result will be : (2 / 3)
  This will be your simplified answer for the given problem.
 * @author Administrator
 */
public class Problem13
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Entre a value of X1:- ");
     int x1 = sc.nextInt();
     System.out.println("Entre a value of y1:- ");
     int y1 = sc.nextInt();
     System.out.println("Entre a value of X2:- ");
     int x2 = sc.nextInt();
     System.out.println("Entre a value of y2:- ");
     int y2 = sc.nextInt();
     
     int x3 = (x1*y2) + (x2*y1);
     int y3 = y1*y2;
     
     int div;
     if (x3 > y3)
         div = y3;
     else
         div = x3;
     
     for(int i = div;i > 0;i--)
     {
        if(x3%i == 0 && y3%i == 0)
        {
           x3 = x3/i;
           y3 = y3/i;
        }    
     }
     System.out.println("The fraction of this two numbre id :- ("+x3+"/"+y3+")");
   }        
}

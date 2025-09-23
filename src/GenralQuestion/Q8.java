/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;
import java.util.Scanner;
/**
 * Q find the gratest common divser(GCD) and lcm 
 * between two numbeg
 * @author Administrator
 */
public class Q8 
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Entre number 1 :- ");
       int num1 = sc.nextInt();
       System.out.print("Entre number 2 :- ");
       int num2 = sc.nextInt();
       int onum1 = num1;
       int onum2 = num2;
       
       while(num1%num2 !=0)
       {
           int rem = num1%num2;
           num1 =num2;
           num2 =rem;
        }
       int gcd = num2;
       int lcm = (onum1*onum2)/gcd;
       
       System.out.println("The Gcd between two number is:- "+gcd);
       System.out.println("The Lcm betwen two number is:- "+lcm);
    }        
}

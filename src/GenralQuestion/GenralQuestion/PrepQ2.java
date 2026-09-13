/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenralQuestion;

// Q identify the nubre is prime or not
import java.util.Scanner;

/**
 * Q numbre is prime or not
 * @author Administrator
 */
public class PrepQ2 
{
     public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Entre a number : -");
       boolean flag = true;
       int num = sc.nextInt();
       
       if(num < 2)
       {
           flag = false;
       }
       else
       {
       
          for(int i=2;i<num;i++)
          {
             if(num%i==0)
             {
                flag=false;
                break;
             }    
          }  
       }
       String result = flag ? "nuber is prime" :"number is not prime";
       System.out.println(result);
  }      
}

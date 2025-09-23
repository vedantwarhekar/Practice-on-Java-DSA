/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NumbreQuestionPrep;

/**
 *Counting number of days in a given month of a year
 * @author Administrator
 */
public class Problem18
{
   public static void main(String[] args)
   {
     java.util.Scanner sc = new java.util.Scanner(System.in);
     int year = sc.nextInt();
     int month = sc.nextInt();
     
     // if year is leap year
     if(month==2 && year%4==0 || year%100!=0 && year % 400 ==0)
     {
        System.out.println("Numbre of days is 29");
     }
     else if(month == 2)
     {
        System.out.println("Numbre of days is 28");
     }
     else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
     {
         System.out.println("Numbre of days is 31");
     }
     else
     {
         System.out.println("Numbre of days is 30");
     }    
   }         
}

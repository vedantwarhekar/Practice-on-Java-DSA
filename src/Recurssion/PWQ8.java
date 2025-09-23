package Recurssion;

/**
 * // write a java program to calculate gcd of two number
 * // method -1 first you can start divide from small number to divide less number 
 *    up to 1 until you get the greatest divisor
 * // method 2 - long division method which is good that method 1
 * // method 3 - using very important concept called as euklerun  distance
 * @author Administrator
 */
import java.util.Scanner;
public class PWQ8 
{
     static int m2gcd(int x,int y)
     {
        while(x%y != 0)
        {
            int rem = x%y;
            x = y;
            y = rem;
        }  
        return y;
     } 
     // prefered & most importan way which i learned from 
     // pw java course lecture - 30                                      
     static int m3gcd(int x,int y)
     {
        if(y == 0)
        {
          return x;                        
        } 
        return m3gcd(y,x%y);
     }        
     public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(m3gcd(x,y));
     }        
}

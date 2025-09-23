/*
 Conditions for Leap Year
For any year to be a leap year the following two conditions must be checked. If the year satisfies either of the conditions, it's considered a leap year. Following are the conditions
1. The year must be divisible by 400.
2. The year must be divisible by 4 but not 100 

*/
package GenralQuestion;
import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class PrepQ1
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entre a year :- ");
      int year = sc.nextInt();
      
      if(year %400==0)
          System.out.println("Year is leap year");
      else if(year%4 == 0 && year%100 != 0)
         System.out.println("year is leap year");
      else 
          System.out.println("Year is not leap year");
    }        
}

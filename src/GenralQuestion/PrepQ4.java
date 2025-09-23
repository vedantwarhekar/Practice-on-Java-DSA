package GenralQuestion;
import java.util.Scanner;
/**
 * Q Find the Sum of the Digits of a Number in Java Language
 * @author Administrator
 */
public class PrepQ4
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     int sum = 0;
     
     while(number!=0)
     {
        sum += number%10;
        System.out.println(sum);
        number = number/10;
     }   
     System.out.println("sum of all the dight of number is "+sum);
   }        
}

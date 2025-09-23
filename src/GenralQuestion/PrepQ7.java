
package GenralQuestion;
import java.util.Scanner;
/**
 *Check Whether or Not the Number is an Armstrong Number
   Given an integer input, the objective is to check whether or 
   not the number input is an Armstrong number or not.

   However, Armstrong number is any number following the given rule –

     abcd… = an + bn + cn + dn + …
    Where n is the order(length/digits in number)
 * @author Administrator
 */
public class PrepQ7 
{
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int len = order(num);
      
      if(isAmstrong(num,len))
          System.out.println("the given number is amstrong number");
      else
          System.out.println("the given nuber is not amstrong number");
   }
   public static int order(int num)
   {
     int len = 0;
     while(num !=0)
     {
       len++;
       num/=10;
     }
     return len;
   } 
   public static boolean isAmstrong(int num,int len)
   {
      int temp = num;
      int sum = 0;
      int dight = 0;
      while(temp != 0)
      {
        dight = temp %10;
        sum = sum +(int)Math.pow(dight, len);
        temp/=10;
      }
      return sum == num;
   }        
}

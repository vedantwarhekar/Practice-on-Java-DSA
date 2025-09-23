/*
  Harshad number or not using Java : 
  Harshad number is a number or an integer in base 10 which 
  is completely divisible by sum of  its digits.

  For better understanding let us consider an example.

Example :

Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its 
digits or not.
Below are first few Harshad Numbers represented in base 10 :

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………

In this article, we will create a java program to check whether the number 
entered by the user is Harshad number or not.

*/
import java.util.Scanner;
class PrepQ16
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in); 
       int num = sc.nextInt();

       int result = 0;
       int temp = num;
       while(temp!=0)
       {
          int pick_last = temp%10;
          result+= pick_last;
          temp/=10;
       }

       if(num % result == 0)
       {
          System.out.println("the given numbre is Harshad number");
       }
       else
	System.out.println("the given numbre is not Harshad number");
    }
}
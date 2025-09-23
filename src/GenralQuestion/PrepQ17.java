/*
Abundant Numbers
A Number that is smaller than the sum of all it's factors except the number itself 
is known as an Abundant number.
Let's try and understand the concept better using an example

Example
Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. 
We don't want to include the number itself.

Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.
We'll discuss on how to check for an Abundant Number in the upcoming sections.
*/
import java.util.Scanner;
class PrepQ17
{
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int sum =0;
       for(int i=1;i<num;i++)
       {
            if(num%i == 0)
            {
               sum+=i;
            }
       }
      if (sum > num)
       {
     	System.out.println (num + " is an Abundant Number");
     	System.out.println ("The Abundance is: " + (sum - num));
       }
     else
       System.out.println (num + " is not an Abundant Number");
   }
}
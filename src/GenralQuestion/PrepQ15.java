/*
Automorphic Number
A Number that when squared ends with the number itself is known as the Automorphic Number. Let's try and understand the concept of Automorphic Number,
Example
Input : 5
Output : 25
Explanation : Number = 5
when squared you get 25
as 25 ends with 5
From the above example, we prove that the number 5 is an Automorphic Number.

*/
import java.util.Scanner;
class PrepQ15
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     if(isAutomorphic(num))
	System.out.println("the given numbre is Automorphic Number");
     else
	System.out.println("the given numbre is not Automorphic Number");
   }

   static boolean isAutomorphic(int n)
   {
     int sqrt = n*n;
     
       if(n%10 == sqrt%10)
       {
         return true;
       }
     return false;
   }
}
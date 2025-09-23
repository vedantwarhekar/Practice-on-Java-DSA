/*
Program for Finding out the Prime Factors of a number in Java
Prime Factors of a number in Java
 

Here, in this page we will discuss the program to print all the prime factors of a number in java. Prime factorization is a way of expressing a number as a product of its prime factors. A prime number is a number that has exactly two factors, 1 and the number itself.

Example :

Input : 12
Output : 2 2 3

*/
import java.util.Scanner;
class PrepQ11
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    
      for(int div =2;div*div <= n;div++)
      {
          while(n%div==0)
          {
             n = n/div;
             System.out.println(div);
          }
      }
      if(n!=1)
      {
        System.out.println(n);
      }
  }

}

/*
Now, let's consider the case where n is 12. The program will follow these steps:

n = 12
The for loop starts with div = 2.
In the first iteration of the loop, div * div = 4, which is
less than or equal to 12, so it enters the loop.

The while loop checks if n is divisible by div, which it is (12 % 2 == 0). 
It then performs the division: n = 12 / 2, so n becomes 6, and it prints out 2.

The while loop runs again, because n is still divisible by div = 2. 
It performs the division: n = 6 / 2, so n becomes 3, and it prints out 2 again.

The while loop ends because n is no longer divisible by div = 2.

Since n is now 3 and not equal to 1, it prints out 3.

*/
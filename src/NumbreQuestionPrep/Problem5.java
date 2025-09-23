// Octal to decimal conversion using java

import java.util.Scanner;

class Problem5
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("entre a octal numbre :- ");
      int octal = sc.nextInt();

      int decimal = 0;

      int n = 0;

      while(octal != 0)
      {
         int temp = octal%10;
         decimal+= temp*Math.pow(8,n);
         n++;
         octal/=10;
      }
    System.out.println("the octal conversions are "+ decimal);
  }

}
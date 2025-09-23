//Q convert decimal numbre into octal

import java.util.Scanner;

class Problem7
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Entra a decimal numbre :- ");
      int decimal = sc.nextInt();

      int i = 0;

      int[] octal = new int[20];

      while(decimal > 0)
      {
          int r = decimal%8;
          octal[i++] = r;
          decimal/=8;        
      }
      for(int j = i-1;j>=0;j--)
      {
         System.out.print(octal[j]);
      }
   }
}
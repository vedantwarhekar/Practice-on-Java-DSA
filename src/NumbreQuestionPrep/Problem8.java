//Q convert deciaml to hexadecimal

import java.util.Scanner;

class Problem8
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Entra a decimal numbre :- ");
      int decimal = sc.nextInt();

      int i = 0;

      char[] hexadecimal = new char[100];

      while(decimal > 0)
      {
          int r = decimal%16;
          if(r < 10)
          {
            hexadecimal[i++] = (char)(r + 48);
          }else{
              hexadecimal[i++] = (char)(r +55); 
          }  
          decimal/=16;
      }
      
      for(int j = i-1;j>=0;j--)
      {
         System.out.print(hexadecimal[j]);
      }
      System.out.println();
   }
}
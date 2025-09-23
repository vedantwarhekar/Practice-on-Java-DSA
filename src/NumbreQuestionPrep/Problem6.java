// Q decimal to binary conversion

import java.util.Scanner;

class Problem6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entre a decimal numbre");
    int decimal = sc.nextInt();

    // declare a empty array
    int[] binary = new int[20];

    int i = 0;

    while(decimal > 0)
    {
      int r = decimal%2;
      binary[i++] = r;
      decimal/=2;
    }
    for(int j = i-1;j>=0;j--)
    {
         System.out.print(binary[j]);
    }     
  }
}
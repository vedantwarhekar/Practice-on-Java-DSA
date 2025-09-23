//Q2 binary to deciaml conversion;

import java.util.Scanner;

class Q2
{
  public static void main(String[] args)
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("Entre a binary numbre ");
     int num = sc.nextInt();
     String binary = Integer.toString(num);
     int decimal = Integer.parseInt(binary,2);

     System.out.println("the decimal value is " + decimal);
 
  }
}
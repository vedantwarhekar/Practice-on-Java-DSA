//Q3 octal to deciaml conversion;

import java.util.Scanner;

class Q3
{
  public static void main(String[] args)
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("Entre a octal numbre ");
     int num = sc.nextInt();
     String octal = Integer.toString(num);
     int decimal = Integer.parseInt(octal,8);

     System.out.println("the octal value is " + decimal);
 
  }
}
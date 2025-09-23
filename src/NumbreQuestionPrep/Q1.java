//Q1 hexadeciaml to deciaml conversion;
package NumbreQuestionPrep;
import java.util.Scanner;

class Q1
{
  public static void main(String[] args)
  {
     Scanner sc= new Scanner(System.in);
     System.out.println("Entre a hexadecimal value");
     String hex = sc.nextLine();
     
     int decimal = Integer.parseInt(hex,16);

     System.out.println("the decimal value is " + decimal);
 
  }
}
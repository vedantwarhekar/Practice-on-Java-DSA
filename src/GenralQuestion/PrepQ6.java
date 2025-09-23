package GenralQuestion;
import java.util.Scanner;
/**
 * Q Check Whether or Not the Number is a Palindrome in Java Language
 *  palindrome numbre is a numbre which always same if we are reerwse them then also
 * @author Administrator
 */
public class PrepQ6
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int reverse = 0;
    int temp = number;
    while(temp != 0)
    {
      int rem = temp%10;
      reverse = reverse*10 + rem;
      temp /= 10;
    }
    if(number == reverse)
        System.out.println("number is palindrome number");
    else
        System.out.println("number is not a palindrome number");
  }        
}

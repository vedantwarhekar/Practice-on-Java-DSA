// Q for finding perfect square
import java.util.Scanner;
class PrepQ14
{
   public static void main(String[] args)
   {
     Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     if(scannerOfPerfectSquare(num))
	System.out.println("the given numbre is prefect square");
     else
	System.out.println("the given numbre is not a perfect square");
   }
   static boolean scannerOfPerfectSquare(int num)
   {
    if(num>=0)
    {
      int sqrt =(int)Math.sqrt(num);
        
      return sqrt*sqrt == num;  
    }
    return false;
   }
}
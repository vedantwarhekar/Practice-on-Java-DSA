import java.util.Scanner;

//Java program to print armstrong numbers between two intervals

class PrepQ8
{
   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int low = sc.nextInt();
      int high = sc.nextInt();

      System.out.println("Armstrong numbers between "+ low + " and " + high + " are : ");
 
      // loop for finding the amstrong number
      for(int i = low;i<high;i++)
      {
         int sum =0,temp,dight,len;
         len = getorder(i);
         temp = i;
         while(temp!=0)
         {
            dight = temp%10;
            sum += Math.pow(dight,len);
            temp /=10;
         }
         if(sum==i)
         {
            System.out.print("  "+i);
         }
      } 
   }
   private static int getorder(int num)
   {
      int len =0;
      while(num != 0)
      {
         len++;
         num/=10 ; 
      }
      return len;
   }
}
// Factors of a number using Java

class PrepQ10
{
   public static void main(String[] args)
   {
     int num = 24;
     for(int i =1;i<=num;i++)
     {
        if(num % i == 0)
        {
            System.out.println(i);
        }
     }
   }

}
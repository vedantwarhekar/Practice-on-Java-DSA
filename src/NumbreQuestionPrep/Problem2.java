//LCM of Two Numbers
/*
Algorithm
For a input num1 and num2. This method uses two following observations –

LCM of two numbers will at least be equal or greater than max(num1, num2)
Largest possibility of LCM will be num1 * num2
When iterating in (i) We can linearly find an (i) that is divisible by both num1 & num2
*/

class Problem2
{
  public static void main(String[] args)
  {
    int num1 = 12,num2 = 48;
    int lcm = 0;
    
    int max = (num1>num2) ? num1 : num2;

   for(int i =max;i<=num1*num2;i++)
   {
      if(i%num1 ==0 && i%num2 ==0)
      {
          lcm = i;
          break;
      }
    
   }
   System.out.println("the lcm of two numbre is " + lcm);
  }
}
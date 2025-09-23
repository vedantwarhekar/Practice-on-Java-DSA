/*
Strong Number
A Number that can be represented as the sum of the factorial of it's individual 
digits is known as a Strong Number.
Let's try and understand the concept better using an example

Example
Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.
As the number could be represented as the sum of the factorials of it's digits, 
it's a Strong Number.
*/
class PrepQ12
{
  public static void main(String[] args)
  {
     int num = 145;
     
     if(detectStrong(num))
	System.out.println("the given numbre is a strong number");
     else
	System.out.println("the given numbre is not a strong numbre");
  }
  
  static int fact(int num)
  {
    int fact = 1;
    for(int i=1;i<=num;i++)
    {
       fact = fact*i;
    }
   return fact;    	
  }
  static boolean detectStrong(int num)
  {
    int dight;
    int sum = 0;
    int temp = num;

    while(temp != 0)
    {
      dight = temp%10;
  
      sum = sum +fact(dight);
      temp/=10;
    }

    if(sum == num)
    {
      return true;
    }
    else
    {
     return false;
    }
 
  }
  
}
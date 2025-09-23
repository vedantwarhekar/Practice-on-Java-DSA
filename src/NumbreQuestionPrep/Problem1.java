// HCF of two numbers in Java
class Problem1
{
  public static void main(String[] args)
  {
     int num1 = 18,num2 =24,num3 =30;
     int hcf =0;
     for(int i=1;i<=num1||i<=num2||i<=num3;i++)
     {
       if(num1%i==0 && num2%i==0 && num1%i==0)
       {
         hcf =i;
       }
     }
    System.out.println("the hcm of given numbre is "+hcf); 
  }
}
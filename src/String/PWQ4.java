package String;

/**
 * identify the given string is palindrome or not
 * @author Administrator
 */
public class PWQ4 
{
    static boolean palindrome(String str)
    {
        int i =0;
        int j = str.length()-1;
        boolean flag = true;
        while(i<j)
        {
           if(str.charAt(i) != str.charAt(j))
           {
               flag = false;
               break;
           }
           i++;
           j--;
        }
        return flag;
    }        
    static void palindrome2(String str)
    {
       StringBuilder str1 = new StringBuilder(str);
       str1.reverse();
       // we cannot convert directly stringbuilder into string thats why we add "" empty
       String s = str1+"";
       if(str.equals(s))
       {
          System.out.println("palindrome");
       }else
       {
          System.out.println("Not palindrome");
       }    
    }        
    public static void main(String[] args)
    {
       String str = "aba";
       String str1 = "Madhav";
       System.out.println(palindrome(str));
       palindrome2(str1);
    }        
}

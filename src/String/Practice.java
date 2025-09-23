/*
find
 */

package String;
class Practice
{  
    public static void main(String[] args)
    {
       String str = "aaaabbbccd";
       String ans = ""+str.charAt(0);
       int count = 1;
       for(int i=1;i<str.length();i++)
       {
          char cur = str.charAt(i);
          char prev = str.charAt(i-1);
          if(cur == prev)
          {
            count++;
          }else{
            if(count > 1)ans+=count;
            ans += cur;
            count = 1;
          }    
       }
       if(count > 1)ans+=count;
       System.out.println(ans);
    }        
}

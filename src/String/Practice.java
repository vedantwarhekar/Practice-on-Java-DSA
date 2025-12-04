/*
find
 */

package String;
class Practice
{
    public static void main(String[] args)
    {
        String str = "aaabbbccdddeeeerrrn";
       String ans = str.charAt(0)+"";
       int count = 1;
       for(int i = 1; i < str.length(); i++)
       {
           if(str.charAt(i) == str.charAt(i-1))
           {
               count++;
           }else {
               if(count > 1)ans+=count;
               count = 1;
               ans+=str.charAt(i);
           }
       }
        if(count > 1) ans+=count;
        System.out.println(ans);
    }        
}

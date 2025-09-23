package Recurssion;

/**
 * Q print all the subsequance of the string
 * "abc"
 * @author Administrator
 */
public class Problem13
{
       public static void subSequance(String str,int idx,String new_string)
       {
          if(idx == str.length())
          {
            System.out.println(new_string);
            return;
          }    
          char currentchar = str.charAt(idx);
          
          // to be
          subSequance(str,idx+1,new_string+currentchar);
          
          // not be
          subSequance(str,idx+1,new_string);
       } 
       public static void main(String[] args)
       {
         String str="abc";
         String new_string="";
          subSequance(str,0 ,new_string);
       }        
}

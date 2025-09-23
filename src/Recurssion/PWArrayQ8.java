/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recurssion;

/**
 *Try this Given a string containing digits from 2-9 inclusive, return all
 * possible letter combinations that the number could represent. Return the
 * answer in any order. Input: digits = "23" Output:
 * ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 *
 * @author c068
 */
public class PWArrayQ8 
{
    static void combination(String dig,String[] kp,String res)
    {
      if(dig.length() == 0)
      {
       System.out.print(res+" ");
       return;
      } 
      int currNum = dig.charAt(0);
      String currChoices = kp[currNum];
      
      for(int i=0;i < currChoices.length();i++)
      {
        combination(dig.substring(1),kp,res+currChoices.charAt(i));
      }    
    }        
    public static void main(String[] args)
    {
       String dig = "23";
       String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       combination(dig,arr,"");
    }        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 * java program to reverse each word in the String Input -> I am vedant outpue
 * -> I ma tnadev
 *
 * @author Administrator
 */
public class PWQ6 {

    public static void main(String[] args) {
        String str = "olleh tnadev";
        StringBuilder str1 = new StringBuilder("");
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                str1.append(ch);
            } else {
                str1.reverse();
                ans = ans + str1;
                ans += " ";
                str1 = new StringBuilder("");
            }
        }
        str1.reverse();
        ans = ans + str1;
        System.out.println(ans);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoderByte;

/**
 * Have the function ABCheck(str) take the str parameter being passed and return
 * the string true if the characters a and b are separated by exactly 3 places
 * anywhere in the string at least once (ie. "lane borrowed" would result in
 * true because there is exactly three characters between a and b). Otherwise
 * return the string false.
 *
 * @author Nick Livens
 */
class AbCheck {

    public static boolean abCheck(String str) {
        for (int i = 0; i < str.length() - 4; i++) {
            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "Laura sabus";
        boolean result = abCheck(str);
        System.out.println(result); // true
    }
}

package CoderByte;

/**
 * Have the function LetterChanges(str) take the str parameter being passed and
 * modify it using the following algorithm. Replace every letter in the string
 * with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally
 * return this modified string.
 *
 * @author Nick Livens
 */
import java.util.*; 
//import java.io.*;

class Function {

    String LetterChanges(String input) {
        String output = "";
        char letter;
        for (int i = 0; i < input.length(); i++) {
            letter = input.charAt(i);
            if (letter >= 'a' && letter < 'z') {
                letter++;
            }
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                letter = Character.toUpperCase(letter);
            }
            output = output + letter;
        }
        return output;
 //       character
//       Character
//       Character
//       Character
//       Character
//       CHaracter
//       Character
//       Character
//       Character
    }

    public static void main(String[] args) {
        // keep this function call here     
        Scanner s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.LetterChanges(s.nextLine()));
    }
}

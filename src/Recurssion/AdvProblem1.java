package Recurssion;
// Q print all permutatyion of given string 
// string ="abc";

class AdvProblem1 {
    public static void printPermutation(String str, String permutation) {
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        } 
        for (int i = 0; i < str.length(); i++) {
            char current_char = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newString, permutation + current_char);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        printPermutation(str, "");
    }
}

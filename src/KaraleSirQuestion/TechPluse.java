package KaraleSirQuestion;

// check whether a number is palindrome or not
public class TechPluse {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reverse = 0;

        while (num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Method two
        String str = String.valueOf(num);
        String sb = new StringBuilder(str).reverse().toString();
        if(str.equals(sb)){
            System.out.println("Palindrome");
        }
    }
}

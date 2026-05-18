package NumbreQuestionPrep;

// Reverse each number number could be negative as well
public class Problem0 {
    public static void main(String[] args){
        int num = 123456;
        if(num == 0){
            System.out.println(num);
        }
        int reverse = 0;
        int sign = num < 0 ? -1 : 1;
        num = Math.abs(num);

        while (num != 0){
            int digit = num %10;
            reverse = reverse * 10 + digit;
            num/=10;
        }
        
        System.out.println(reverse * sign);
    }
}

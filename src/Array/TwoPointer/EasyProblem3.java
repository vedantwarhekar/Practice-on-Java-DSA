package Array.TwoPointer;

import java.util.Arrays;

// Reverse a String
public class EasyProblem3 {
    public static void main(String[] args) {
        String str= "Vedant";
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for (char num : arr) {
            sb.append(num);
        }
        str = sb.toString();

        System.out.println(str);
    }
}

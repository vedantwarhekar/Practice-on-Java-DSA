package Array;

// calculate the maximum user.
public class SlidingWindowQ3 {
    public static void main(String[] args) {
        int users[] = {100,46,78,89,46,102,107};
        int windowSum = 0, max = 0, k = 3;
        for(int i = 0; i < k; i++){
            windowSum = windowSum + users[i];
        }
        max = windowSum;
        for(int i = 1; i <= users.length- k; i++){
            windowSum = windowSum - users[i-1] + users[i+k-1];
            if(windowSum > max){
                max = windowSum;
            }
        }
        System.out.println("Max Visitor:- "+max);
    }
}

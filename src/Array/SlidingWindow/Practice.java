package Array.SlidingWindow;

public class Practice {
    public static void main(String[] args) {
        int users[] = {2,3,4,5,6,7};
        int days = 3;
        int windowSum = 0;

        for(int i =0; i < days; i++){
            windowSum+=users[i];
        }
        System.out.println("Total number of user visited:- "+ windowSum);
        for(int i =1; i <= users.length-days; i++){
           windowSum = windowSum-users[i-1]+users[i+days-1];
            System.out.println("Total number of user visited:- "+ windowSum);
        }
    }
}

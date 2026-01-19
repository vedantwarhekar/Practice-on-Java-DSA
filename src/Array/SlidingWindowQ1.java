package Array;

// calculate the visitor of website in the seqeance of three days
public class SlidingWindowQ1 {
    public static void main(String[] args) {
        int users[] = {100,46,78,89,46,102,107};
        int days = 3;
        int windowSum = 0;

        // Two loop Solution Which is also ok
        for(int i = 0; i < days; i++){
            windowSum = windowSum + users[i];
        }
        System.out.println("Total number of user visited:- "+ windowSum);
        for(int i = 1; i <= users.length-days; i++){
            windowSum = windowSum - users[i-1]+ users[i+days-1];
            System.out.println("Total number of user visited:- "+ windowSum);
        }

        //One-loop version (combined logic)
        int windowSum2 = 0;
        for(int i = 0; i < users.length; i++){
         windowSum2 += users[i];
         if(i >= days - 1){
             System.out.println(windowSum2);
             windowSum2 -= users[i-(days-1)];
         }
        }
    }
}

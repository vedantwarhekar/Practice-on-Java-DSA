package Array;

// average visitor of website of three days
public class SlidingWindowQ2 {
    public static void main(String[] args) {
        int users[] = {100,46,78,89,46,102,107};
        int days = 3;
        int windowSum = 0, average = 0;
        for(int i =0; i < days; i++){
            windowSum = windowSum + users[i];
        }
        average = windowSum/days;
        System.out.println("Total number of visitor (average):- "+average);
        for(int i = 1; i <= users.length-days; i++){
            windowSum = windowSum - users[i-1]+users[i+days-1];
            average = windowSum/days;
            System.out.println("Total number of visitor (average):- "+average);
        }

        // One-loop version (combined logic)
        System.out.println("By Second approach");
        int windowSum2 = 0;
        for(int i = 0; i < users.length; i++){
            windowSum2 += users[i];
            if(i >= days-1){
                average = windowSum2/days;
                System.out.println("Total number of visitor (average):- "+average);
                windowSum2 -= users[i-(days-1)];
            }
        }
    }
}

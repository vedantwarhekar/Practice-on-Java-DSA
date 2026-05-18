package Array;

// find the prime number from array
public class PWProblem25 {
    static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,5,6,7,2,5,78,2,4,6,2,1};
        for(int i =0; i < arr.length; i++){
            if(isPrime(arr[i])){
                System.out.print(arr[i] +" ");
            }
        }
    }
}

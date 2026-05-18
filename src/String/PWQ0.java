package String;

// reverse a string
public class PWQ0 {
    static String reverse(String str){
        char[] arr = str.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while (i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = reverse("tnadev");
        System.out.println(str);
    }
}

package String;

// First non-repeated character in a string
public class PWQ8 {
    public static void main(String[] args) {
        String str = "ssbabssdjkb";
        for(int i =0; i < str.length();i++){
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                System.out.println("The char found: - "+str.charAt(i));
                return;
            }
        }
    }
}

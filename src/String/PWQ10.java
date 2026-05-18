package String;

// remove duplicate from string
public class PWQ10 {

    public static void main(String[] args){
        String str = "mdddhavvv";
        String and = "";
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if(and.indexOf(ch) == -1){
                and = and + ch;
            }
        }
        System.out.println(and);
    }
}

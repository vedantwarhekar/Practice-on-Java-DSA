package HashSet;

import java.util.HashSet;

public class HashSetPrac {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(4);
        hs.add(9);
        hs.add(3);
        System.out.println(hs);
        System.out.println(hs.contains(9));
        System.out.println(hs.size());
        hs.remove(3);
        System.out.println(hs);
        System.out.println("Mark");
        for(int s : hs){
            System.out.println(s);
        }
    }
}

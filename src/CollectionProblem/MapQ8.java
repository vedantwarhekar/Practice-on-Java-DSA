package CollectionProblem;

import java.util.LinkedHashMap;

// str = "calypso java calypso trade"
// calypso = 2; java = 1, trade = 1
public class MapQ8 {
    public  static void main(String[] args){
        String str = "calypso java calypso trade";
        String[] array_of_word = str.split(" ");
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < array_of_word.length; i++){
            map.put(array_of_word[i], map.getOrDefault(array_of_word[i],0)+1);
        }
        System.out.println(map);
    }
}

package string_Problem_Solving;

import java.util.HashMap;

public class WordCountUsingHashMap {
    public static void main(String[] args) {
        String str = "aayega to modi hi aayega to modi hi";
        String[] split = str.split(" ");
        HashMap<String,Integer>map = new HashMap<String,Integer>();
        for (int i=0; i<split.length-1; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count+1);
            }
            else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map);
    }
}

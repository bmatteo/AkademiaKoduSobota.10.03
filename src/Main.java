import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Mateusz");
        strings.add("Jan");
        strings.add("Kasia");
        strings.add("Jan");
        strings.add("Mateusz");
        strings.add("Jan");

        count(strings);
    }

    public static void count(ArrayList<String> list) {
        HashMap<String, Integer> counters = new HashMap<>();

        for(int i = 0; i < list.size(); i++) {
            String word_key = list.get(i);
            if(counters.containsKey(word_key)) {
                Integer currentValue = counters.get(word_key);
                counters.put(word_key, currentValue + 1);
            } else {
                counters.put(list.get(i), 1);
            }
        }

        for ( String key : counters.keySet() ) {
            System.out.println("Key : " + key + " count: " + counters.get(key));
        }
    }
}
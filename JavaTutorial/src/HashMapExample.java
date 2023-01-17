import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        HashMap<String , Integer> numberMap = new HashMap<>();
        numberMap.put("One" , 1);
        numberMap.put("Two" , 2);
        numberMap.put("Three" , 3);
        numberMap.put("Four" , 4);
        numberMap.put("One" , 5);  // trying duplicate value previous value replace by new value
        numberMap.putIfAbsent("Two" , 6); // if the key is not present than only be inserted



        System.out.println("Iterating Hash map");

        for(Map.Entry map : numberMap.entrySet()){
            System.out.println(map.getKey() + "->" + map.getValue());
        }

        HashMap<String , Integer> newNumberMap = new HashMap<>();
        newNumberMap.put("Five" , 5);
        newNumberMap.putAll(numberMap);

        System.out.println("Iterating new hash map");
        for(Map.Entry newMap : newNumberMap.entrySet()){
            System.out.println(newMap.getKey() + "->" + newMap.getValue());
        }

        System.out.println(newNumberMap);
        // replacing value
        newNumberMap.replace("One" , 1);
        System.out.println(newNumberMap);

        // remove element in hashMap
        newNumberMap.remove("Five");
        System.out.println("newNumberMap -> " + newNumberMap);

        newNumberMap.remove("One");
        System.out.println("newNumberMap -> " + newNumberMap);

        // count the frequency using Hashmap
        HashMap<Integer , Integer> countFreq = new HashMap<>();
        int[] numbers = {5 , 6 , 7 , 5 , 4 , 7 , 3 , 4};

        for(int number : numbers){
            if(countFreq.containsKey(number)){
                countFreq.put(number , countFreq.get(number) + 1);
            }
            else{
                countFreq.put(number , 1);
            }
        }
        System.out.println("frequency - " + countFreq);
    }
}

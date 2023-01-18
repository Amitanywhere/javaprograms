import java.util.*;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        LinkedHashMap<String , Integer> studentsAgeMap = new LinkedHashMap<>();
        studentsAgeMap.put("Sahil" , 23);
        studentsAgeMap.put("gopal" , 18);
        studentsAgeMap.put("Nilu" , 24);
        studentsAgeMap.put("Monu" , 30);

        for(Map.Entry map : studentsAgeMap.entrySet()){
            System.out.println(map.getKey() + " -> " + map.getValue());
        }

        // fetching keys from the map
        Set<String> mapKeys = studentsAgeMap.keySet();
        System.out.println(mapKeys);

        // fetching value from the map
        Collection<Integer> mapValues = studentsAgeMap.values();
        System.out.println(mapValues);

        // map entry set
        Set<Map.Entry<String, Integer>> mapEntrySet = studentsAgeMap.entrySet();
        System.out.println(mapEntrySet);
    }
}

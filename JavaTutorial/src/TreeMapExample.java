import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer , String> studentsMap = new TreeMap<>();
        studentsMap.put(100,"Amit");
        studentsMap.put(102,"Ravi");
        studentsMap.put(101,"Vijay");
        studentsMap.put(103,"Rahul");

        for(Map.Entry m:studentsMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        // descending map
        System.out.println("descending map - " + studentsMap.descendingMap());

        // return whose key less than the specified key
        System.out.println(studentsMap.headMap(102 , true));

        // return whose key greater than or equal to specified key
        System.out.println(studentsMap.headMap(101 , true));

        // return key value pair between the specified key
        System.out.println(studentsMap.subMap(101 , true , 104 , false));

    }
}

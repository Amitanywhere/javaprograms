import java.util.*;

public class List {

    public static void main(String[] args) {
        // ArrayList in java
        // creating a String type list using ArrayList
        ArrayList<String> namesList = new ArrayList<String>();

        // adding element inside list
        namesList.add("Akash");
        namesList.add("Sahil");
        namesList.add("Bumba");
        namesList.add("Chuni");

        // element inside list
        System.out.println("Element inside list-");
        for( String name : namesList){
            System.out.println(name);
        }

        // List to Array
        String[] names = namesList.toArray(new String[namesList.size()]);
        System.out.println("Names Array - " + Arrays.toString(names));

        // Array to List
        int [] ages = {34 , 22 , 15 , 43};
        System.out.println("ages array - " + Arrays.toString(ages));

        ArrayList<Integer> agesList = new ArrayList<Integer>();

        for(int age : ages){
            agesList.add(age);
        }

        // add element to specific index
        agesList.add(4 , 31);
        System.out.println("ages array List - " + agesList);

        // get and set methods in a list
        System.out.println("ageList 1st element -" + agesList.get(0));

        // set method set the value of particular index
        agesList.set(2 , 55);
        System.out.println("ageList -" + agesList);

        // isEmpty method return true if list is empty
        System.out.println("isEmpty List - " + agesList.isEmpty());

        // sorting the ageList
        Collections.sort(agesList);

        System.out.println("ageList after sorting - " + agesList);

        // remove element from array list
        int removeAge = agesList.remove(4);
        System.out.println("Remove age - " + removeAge);

        // ListIterator
        ListIterator<Integer> ageListItr = agesList.listIterator();
        System.out.println("Traversing element in forward direction -");
        while(ageListItr.hasNext()){
            System.out.println("index - " + ageListItr.nextIndex() + " age - " + ageListItr.next());
        }

        System.out.println("Traversing element in backward direction -");
        while(ageListItr.hasPrevious()){
            System.out.println("index- " + ageListItr.previousIndex() + " age - " + ageListItr.previous());
        }
    }
}

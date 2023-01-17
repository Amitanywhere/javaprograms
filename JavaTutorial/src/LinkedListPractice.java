import java.util.*;

public class LinkedListPractice {

    public static void main(String[] args) {
        LinkedList<String> Students = new LinkedList<>();
        // adding element
        Students.add("Ashoke");
        Students.add("Sourav");
        Students.add("Sahil");
        Students.add("Prakash");
        System.out.println("Students Linked list - " + Students);

        // adding element in the the first
        Students.addFirst("Badal");
        //adding element in specific position
        Students.add(3 , "Arijit");
        System.out.println("Students linked list - " + Students);

        // removing specific element from linked list
        Students.remove("Sahil");
        System.out.println("Students Linked list - " + Students);
        // removing element using index
        Students.remove(2);
        System.out.println("Students Linked list - " + Students);
        // removing element from first
        Students.removeFirst();
        System.out.println("Students Linked list - " + Students);
        // removing element from last
        Students.removeLast();
        System.out.println("Students Linked list - " + Students);

        // traversing a list in reverse order
        Iterator studentsIterate = Students.descendingIterator();
        while (studentsIterate.hasNext()){
            System.out.println(studentsIterate.next());
        }

    }
}

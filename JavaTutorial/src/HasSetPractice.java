import java.util.HashSet;

public class HasSetPractice {

    public static void main(String[] args) {
        // in hashSet element inserted based on hashCode
        HashSet<String> stringSet = new HashSet<>();

        stringSet.add("One");
        stringSet.add("Two");
        stringSet.add("Three");
        stringSet.add("Four");
        stringSet.add("Five");
        stringSet.add("Two");

        System.out.println(stringSet);
    }
}

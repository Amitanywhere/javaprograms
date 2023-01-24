import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        // stream creation

        // stream from existing array
        Integer[] numbers = {34 , 12 , 65 , 27 , 45};
        Stream<Integer> numberStream = Stream.of(numbers);

        // stream from list
        List<Integer> numbersList = Arrays.asList(numbers);
        Stream<Integer> listStream = numbersList.stream();
        // create stream using individual object
        Stream<Integer> numStream = Stream.of(numbers[2] , numbers[4]);

        // using stream builder
        Stream.Builder<String> nameStrmBuilder = Stream.builder();
        nameStrmBuilder.accept("Rana");
        nameStrmBuilder.accept("Zaheer");
        nameStrmBuilder.accept("Kanu");
        nameStrmBuilder.accept("Banti");
        Stream<String> nameStream = nameStrmBuilder.build();

        // forEach method
        numStream.forEach(number -> System.out.println(number));
//        nameStream.forEach(name -> System.out.println(name));

        // map and collect get the elements out of the stream
//        List<String> lowerName = nameStream.map(name -> name.toLowerCase()).collect(Collectors.toList());
//        System.out.println(lowerName);

        // filter
        List<Integer> filteredEvenNumber = numberStream.filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println(filteredEvenNumber);

        // findFirst()
        String nameStart = "A";
        String nameStartWithR = nameStream.filter(name -> name.startsWith(nameStart)).findFirst().orElse("No Name Starting With " + nameStart);
        System.out.println(nameStartWithR);

        // array from stream
        Integer[] streamToArr = listStream.toArray(Integer[]::new);
        System.out.println(streamToArr[0]);

        Integer[] ages = {23 , 20 , 18 , 32 , 40};
        // sort operation
        Integer[] sortedArray =Arrays.asList(ages).stream().sorted().toArray(Integer[]::new);
        System.out.println("Sorted Array");
        for(Integer number : sortedArray){
            System.out.println(number);
        }

        // partition a stream into two
        List<Integer> intList = Arrays.asList(34 , 12 , 21 , 76 , 45 , 52 , 69);
        Map<Boolean , List<Integer>> isOdd = intList.stream().sorted().collect(Collectors.partitioningBy(num -> num %2 != 0));
        System.out.println(isOdd.get(true));
        System.out.println(isOdd.get(false));

        // grouping by

        List<String> nameList = Arrays.asList("Akash" , "Baku" , "Chandril" , "Sajit");
        Map<Character , List<String>> nameMap = nameList.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(nameMap.get('A'));
        System.out.println(nameMap.get('S'));


    }
}

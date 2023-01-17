import java.util.*;

public class TreeSetClass {

    public static void main(String[] args) {
        TreeSet<Integer> numbersSet = new TreeSet<>();
        numbersSet.add(50);
        numbersSet.add(23);
        numbersSet.add(34);
        numbersSet.add(23);
        numbersSet.add(40);
        System.out.println("numbersSet - " + numbersSet);

        // remove lowest and highest value
        System.out.println("Lowest value - " + numbersSet.pollFirst());
        System.out.println("Highest value - " + numbersSet.pollLast());
        System.out.println(numbersSet);

        numbersSet.add(56);
        numbersSet.add(6);
        numbersSet.add(17);

        System.out.println("numbersSet" + numbersSet);

        System.out.println("reverse numbersSet - " + numbersSet.descendingSet() );

        System.out.println("Head Set : " + numbersSet.headSet(40 , true));

        System.out.println("Sub Set - " + numbersSet.subSet(17 , true , 40 , true));

        System.out.println("Tail Set - " + numbersSet.tailSet(40 , true));

        TreeSet<Book> bookSet = new TreeSet<>();

        Book book1 = new Book(100 , 45 , "xyz");
        Book book2 = new Book(78 , 60 , "gitobitan");
        Book book3 = new Book(104 , 30 , "Raktomukhi neela");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);

        for(Book book : bookSet){
            System.out.println("Book Id : " + book.bookId  + " Book Quantity : " + book.bookQuantity + " Book Name : " + book.bookName);
        }
    }
}

class Book implements Comparable<Book>{
    int bookId , bookQuantity;
    String bookName;

    Book(int id , int quantity , String name){
        bookId = id;
        bookQuantity = quantity;
        bookName = name;
    }

    @Override
    public int compareTo(Book b) {
        if(bookId > b.bookId){
            return 1;
        }
        else if(bookId < b.bookId){
            return -1;
        }
        else{
            return 0;
        }
    }
}

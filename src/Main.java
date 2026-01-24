import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Aboba","Ishak",119));
        books.add(new Book("Tom","Bub",1990));
        books.add(new Book("James","Bob",1984));
        books.add(new Book("Jack","Bob2",1999));
        books.sort((a,b)->a.getName().compareTo(b.getName()));
        for (Book book : books) {
            book.print();
        }

        System.out.println("Books sorted in ascending order");
        for (Book book : books) {
            book.print();
        }
    }
}

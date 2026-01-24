public class Book {

    String name;
    String author;
    int pages;

    public Book(String name, String author , int pages) {

        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    public void print() {
        System.out.println(name+" "+author+" "+pages);

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

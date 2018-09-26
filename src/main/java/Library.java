
import java.util.ArrayList;

public class Library {


    private String name;
    private int capacity;
    private ArrayList<Book> books;


    public Library(String name){
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }



    public int getBookCount() {
        return this.books.size();
    }

   public void addBook(Book book){
        this.books.add(book);
   }

    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public boolean hasCapacity(){
        return books.size() >= this.capacity;
    }
}

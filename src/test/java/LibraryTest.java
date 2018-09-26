import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

     Book book;
     Library library;

    @Before
    public void before() {
        library = new Library("My Library");
        book = new Book("harry potter", "jk rowling", "kids", 400);
    }

    @Test
    public void canEmptyLibrary() {
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBook() {
        library.addBook(book);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void canRemoveBook() {
        library.addBook(book);
        assertEquals(1, library.getBookCount());
        library.removeBook(book);
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void hasCapacity() {
        for (int i = 0; i < 10; i++){
            library.addBook(book);
        }
        assertEquals(10, library.getBookCount());
    }
}



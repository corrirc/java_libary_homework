import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("harry potter", "jk rowling", "kids", 400);
    }

    @Test
    public void hasName(){
        assertEquals("harry potter", book.getName());
    }

    @Test
    public void hasAuthor(){
        assertEquals("jk rowling", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("kids", book.getGenre());
    }

    @Test
    public void hasPages() {
        assertEquals(400, book.getNumberOfPages());
    }
}

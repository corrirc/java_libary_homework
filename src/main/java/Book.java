public class Book {

    private String name;
    private String author;
    private String genre;
    private int pages;

    public Book(String name, String author, String genre, int pages){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pages = pages;
    }


    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getGenre(){
        return this.genre;
    }

    public int getNumberOfPages() {
        return this.pages;
    }
}



public class java4 {
    public static void main(String[] args) {
        String authorName = args[0];
        
        BookPublication bookPublication = new BookPublication(authorName, "Java Programming");
        PaperPublication paperPublication = new PaperPublication(authorName, "Dynamic Polymorphism in Java");
        
        Book publication;
        publication = bookPublication;
        publication.displayPublication();
        
        publication = paperPublication;
        publication.displayPublication();
    }
}
class Book {
    private String authorName;
    
    public Book(String authorName) {
        this.authorName = authorName;
    }
    
    public void displayPublication() {
        System.out.println("Author Name: " + authorName);
    }
    public String getAuthorName() {
        return authorName;
    }
}

class BookPublication extends Book {
    private String title;
    
    public BookPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }
    
    public void displayPublication() {
        System.out.println("Author Name: " + super.getAuthorName());
        System.out.println("Book Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;
    
    public PaperPublication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }
    
    public void displayPublication() {
        System.out.println("Author Name: " + super.getAuthorName());
        System.out.println("Paper Title: " + title);
    }
}

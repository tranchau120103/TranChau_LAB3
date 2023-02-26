package TranChauLAB3;

public class Book {
    public String boCode;
    public String Title;
    public String boAuthor;
    public Book(){}

    public Book(String boCode, String Title, String boAuthor)
    {
        this.boCode = boCode;
        this.Title = Title;
        this.boAuthor = boAuthor;
    }

    public String getBoCode() {
        return boCode;
    }

    public String getTitle() {
        return Title;
    }

    public String getBoAuthor() {
        return boAuthor;
    }
    
    
}
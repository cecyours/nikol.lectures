public class CH06_P03_BookClass {
    public static void main(String[] args) {
        
        Book b = new Book(101, "By World", 12);

        System.out.println("  book name : "+b.getBookName());
        System.out.println("    book Id : "+b.getBookId());
        System.out.println("book authur : "+b.getAuthurId());

        System.out.println("============================");
        // update book name
        b.setBookName("you world");
        System.out.println("  book name : "+b.getBookName());
        System.out.println("    book Id : "+b.getBookId());
        System.out.println("book authur : "+b.getAuthurId());

        


    }
}

// Book[4] , Author[5]

// Book = bookId + getBookId()
class Book{

    // data members
    private int bookId;
    private String bookName;
    private int authorId;

    public Book()
    {
        System.out.println("Default c...");
    }

    public Book(int bookId,String bookName,int authorId)
    {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorId = authorId;
    }
    
    // method
    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }

    public void setAuthurId(int authorId)
    {
        this.authorId = authorId;
    }

    public int getBookId()
    {
        return this.bookId;
    }

    public String getBookName()
    {
        return this.bookName;
    }

    public int getAuthurId()
    {
        return this.authorId;
    }
}

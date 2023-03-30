public class Book {
    private String bookName;
    private String AuthorName;
    private int yearPublication;

    public Book(String bookName, String AuthorName, int yearPublication) {
        this.bookName = bookName;
        this.AuthorName = AuthorName;
        this.yearPublication = yearPublication;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthorName() {
        return this.AuthorName;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}

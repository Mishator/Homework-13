public class Book {
    String bookName;
    String AuthorName;
    int yearPublication;

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
}

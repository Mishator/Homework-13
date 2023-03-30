public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", "Л.Н. Толстой", 1867);
        System.out.println("warAndPeace.bookName = " + warAndPeace.bookName);
        System.out.println("warAndPeace.Author = " + warAndPeace.AuthorName);
        System.out.println("warAndPeace.yearPublication = " + warAndPeace.yearPublication);
        System.out.println();

        Author authorNameTolstoy = new Author("Лев Николаевич", "Толстой");
        System.out.println("authorNameTolstoy.authorName = " + authorNameTolstoy.authorName);
        System.out.println("authorNameTolstoy.authorLastName = " + authorNameTolstoy.authorLastName);
    }
}
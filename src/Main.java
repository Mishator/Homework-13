public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", "Л.Н. Толстой", 1867);
        System.out.println("warAndPeace.bookName = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.Author = " + warAndPeace.getAuthorName());
        System.out.println("warAndPeace.yearPublication = " + warAndPeace.getYearPublication());
        warAndPeace.setYearPublication(1868);
        System.out.println("warAndPeace.getYearPublication() = " + warAndPeace.getYearPublication());
        System.out.println();

        Author authorNameTolstoy = new Author("Лев Николаевич", "Толстой");
        System.out.println("authorNameTolstoy.authorName = " + authorNameTolstoy.getAuthorName());
        System.out.println("authorNameTolstoy.authorLastName = " + authorNameTolstoy.getAuthorLastName());
        System.out.println();

        Book idiot = new Book("Идиот", "Ф.М. Достоевский", 1869);
        System.out.println("idiot.getBookName() = " + idiot.getBookName());
        System.out.println("idiot.getAuthorName() = " + idiot.getAuthorName());
        System.out.println("idiot.getYearPublication() = " + idiot.getYearPublication());
        System.out.println();

        Author authorNameDostoevsky = new Author("Фёдор Михайлович", "Достоевский");
        System.out.println("authorNameDostoevsky.getAuthorName() = " + authorNameDostoevsky.getAuthorName());
        System.out.println("authorNameDostoevsky.getAuthorLastName() = " + authorNameDostoevsky.getAuthorLastName());
        System.out.println();
    }
}
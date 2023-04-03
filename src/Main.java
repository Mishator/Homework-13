public class Main {

    public static void main(String[] args) {
        Book warAndPeace = new Book("Война и мир", new Author("Лев Николаевич", "Толстой"), 1867);
        System.out.println("Название книги: " + warAndPeace.getBookName());
        System.out.println("Название автора: " + warAndPeace.getAuthor());
        System.out.println("Год издания книги: " + warAndPeace.getYearPublication());
        warAndPeace.setYearPublication(1868);
        System.out.println("Год издания книги: " + warAndPeace.getYearPublication());
        System.out.println();

        Author authorNameTolstoy = new Author("Лев Николаевич", "Толстой");
        System.out.println("Имя отчество автора: " + authorNameTolstoy.getAuthorName());
        System.out.println("Фамилия автора: " + authorNameTolstoy.getAuthorLastName());
        System.out.println();

        Book idiot = new Book("Идиот",new Author("Фёдор Михайлович", "Достоевский"), 1869);
        System.out.println("Название книги: " + idiot.getBookName());
        System.out.println("Название автора: " + idiot.getAuthor());
        System.out.println("Год издания книги: " + idiot.getYearPublication());
        idiot.setYearPublication(1868);
        System.out.println("Год издания книги: " + idiot.getYearPublication());
        System.out.println();

        Author authorNameDostoevsky = new Author("Фёдор Михайлович", "Достоевский");
        System.out.println("Имя отчество автора: " + authorNameDostoevsky.getAuthorName());
        System.out.println("Фамилия автора: " + authorNameDostoevsky.getAuthorLastName());
        System.out.println();
    }
}
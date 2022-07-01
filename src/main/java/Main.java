import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        boolean loop = true;
        System.out.println("Welcome to the Library!");
        Scanner scanner = new Scanner(System.in);

        do {
            Book newBook = createBook(scanner);
            library.addBook(newBook);

            System.out.println("\nWould you like to add another book? 1-yes 2-no");
            int yn = scanner.nextInt();
            if (yn == 2) {
                loop = false;
            }
            scanner.nextLine();
        } while (loop);

        for (Book book : library.getBooks()) {
            System.out.println(
                    "\nTitle: " + book.title + "\nGenre: " + book.genre + "\nPages: " + book.numberOfPages);
        }

        scanner.close();
    }

    static Book createBook(Scanner scanner) {
        String title, genre;
        int pages;
        System.out.println("Add Book information");
        System.out.println("what's the title?");
        title = scanner.nextLine();
        System.out.println("what's the Genre?");
        genre = scanner.nextLine();
        System.out.println("How many pages?");
        pages = scanner.nextInt();
        // scanner.nextLine();
        return new Book(title, genre, pages);
    }
}

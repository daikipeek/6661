import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите название библиотеки:");
        String libraryName = scanner.nextLine();
        System.out.println("Введите адрес библиотеки:");
        String libraryAddress = scanner.nextLine();

        Library library = new Library(libraryName, libraryAddress);


        System.out.println("\nВведите название первой книги:");
        String book1Title = scanner.nextLine();
        System.out.println("Введите автора первой книги:");
        String book1Author = scanner.nextLine();
        System.out.println("Введите год издания первой книги:");
        int book1Year = scanner.nextInt();
        scanner.nextLine();

        Book book1 = new Book(book1Title, book1Author, book1Year);


        System.out.println("\nВведите название второй книги:");
        String book2Title = scanner.nextLine();
        System.out.println("Введите автора второй книги:");
        String book2Author = scanner.nextLine();
        System.out.println("Введите год издания второй книги:");
        int book2Year = scanner.nextInt();
        scanner.nextLine();

        Book book2 = new Book(book2Title, book2Author, book2Year);


        System.out.println("\nВведите имя первого пользователя:");
        String user1Name = scanner.nextLine();
        System.out.println("Введите ID первого пользователя:");
        int user1Id = scanner.nextInt();
        scanner.nextLine();

        LibraryUser user1 = new LibraryUser(user1Name, user1Id);

        System.out.println("\nВведите имя второго пользователя:");
        String user2Name = scanner.nextLine();
        System.out.println("Введите ID второго пользователя:");
        int user2Id = scanner.nextInt();

        LibraryUser user2 = new LibraryUser(user2Name, user2Id);


        System.out.println("\n--- Информация о библиотеке ---");
        library.displayLibrary();

        System.out.println("\n--- Книги ---");
        book1.displayBook();
        book2.displayBook();

        System.out.println("\n--- Пользователи библиотеки ---");
        user1.displayUser();
        user2.displayUser();

       
        System.out.println("\nКниги одинаковые? " + book1.getTitle().equals(book2.getTitle()));

        scanner.close();
    }
}

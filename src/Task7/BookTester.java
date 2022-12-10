package Task7;
import java.util.Scanner;

public class BookTester {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Book's name:");
        String name = scan.nextLine();
        System.out.println("Author's name:");
        String author = scan.nextLine();
        System.out.println("Enter year of publication:");
        int year = scan.nextInt();
        Book test = new Book(name, author, year);
        System.out.println(test);
    }
}

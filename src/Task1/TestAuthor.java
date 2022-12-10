package Task1;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name, email, gender:");
        String name = scan.nextLine();
        String email = scan.nextLine();
        char gender = scan.next().charAt(0);
        Author test = new Author(name, email, gender);
        System.out.println(test);
    }
}

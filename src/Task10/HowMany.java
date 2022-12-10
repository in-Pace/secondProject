package Task10;

import java.util.Scanner;
public class HowMany {

    int userWords = 0;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HowMany wordCounter = new HowMany();
        String word = " ";
        System.out.println("Enter words: ");
        while (true){
            word = scanner.nextLine();
            wordCounter.userWords++;
            if (word.equals("")){
                break;
            }
        }
        System.out.println("Quantity of words: " + (wordCounter.userWords - 1));

    }

}

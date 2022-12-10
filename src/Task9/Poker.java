package Task9;
import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    static int AMOUNT_OF_CARDS_IN_HAND = 5;
    static String[] suits = {"пики", "бубиz", "черви", "треф"};
    static String[] ranks  = {"Двойка", "Тройка", "Четверка", "Пятерка", "Шестерка", "Семерка", "Восьмерка", "Девятка", "Десятка",
            "Валет", "Дама", "Король", "Туз"};
    static ArrayList<String> deck = new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Poker table = new Poker();
        table.deckInit();
        System.out.println("Введите кол-во игроков (не более десяти): ");
        int amountOfPlayers = scanner.nextInt();
        System.out.println("Карты розданы!\n");
        for (int i = 1; i <= amountOfPlayers; i++){
            System.out.println("Рука игрока №" + i);
            printPlayersHand();

        }

    }
    public void deckInit(){
        for (String suit: suits){
            for (String rank: ranks){
                deck.add(rank +" " + suit);
            }

        }
    }
    public static void printPlayersHand(){
        for (int i = 0; i < AMOUNT_OF_CARDS_IN_HAND; i++){
            int randomCard = (int)( Math.random() * deck.size());
            System.out.println(deck.get(randomCard));
            deck.remove(randomCard);
        }
        System.out.println();
    }
}
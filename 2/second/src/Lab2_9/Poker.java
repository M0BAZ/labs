package Lab2_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Poker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int numPlayers = scanner.nextInt();

        if (numPlayers < 1 || numPlayers > 10) {
            System.out.println("Количество игроков должно быть от 1 до 10.");
            return;
        }

        List<String> deck = createDeck();
        shuffleDeck(deck);

        int cardsPerPlayer = 5;

        for (int i = 0; i < numPlayers; i++) {
            List<String> hand = dealHand(deck, cardsPerPlayer);
            System.out.println("Игрок " + (i + 1) + ":");
            printHand(hand);
            System.out.println();
        }

        scanner.close();
    }

    public static List<String> createDeck() {
        List<String> deck = new ArrayList<>();
        String[] suits = {"Черви", "Бубны", "Трефы", "Пики"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Дама", "Король", "Туз"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " " + suit);
            }
        }

        return deck;
    }

    public static void shuffleDeck(List<String> deck) {
        Collections.shuffle(deck);
    }

    public static List<String> dealHand(List<String> deck, int cardsPerPlayer) {
        List<String> hand = new ArrayList<>();

        for (int i = 0; i < cardsPerPlayer; i++) {
            hand.add(deck.remove(0));
        }

        return hand;
    }

    public static void printHand(List<String> hand) {
        for (String card : hand) {
            System.out.println(card);
        }
    }
}

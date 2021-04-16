/*
Паттерн Memento.
Реализовать алгоритм игры судоку/крестики нолики.
Реализовать возможность "взять ход назад"
*/

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Game settings:");
        System.out.print("  Field size: ");
        int size = scanner.nextInt();
        if (size < 3) size = 3;
        System.out.print("  Length of line to win: ");
        int winnerLength = scanner.nextInt();
        if (winnerLength > size) winnerLength = size;
        if (winnerLength < 3) winnerLength = 3;

        Field field = new Field(size, winnerLength);
        SaveManager saveManager = new SaveManager(field.createMemento());
        int winner = 0; int turnsAmount = 0; int numberOfCells = size*size;
        while (winner == 0) {
            for (int player = 1; player <= 2 && winner == 0; player++) {
                boolean confirm = false;
                while (!confirm) {
                    confirm = true;
                    System.out.println(field);
                    System.out.println(player + " player's turn");
                    play(field, player);
                    winner = field.checkWinner();
                    if (winner > 0) break;
                    turnsAmount++;
                    System.out.println(field);
                    System.out.printf("Confirm(yes=1, no=0)? ");
                    int option = scanner.next().charAt(0);
                    if (option == 0) {
                        field.setMemento(saveManager.getMemento());
                        turnsAmount--;
                        confirm = false;
                    }
                    if (turnsAmount == numberOfCells) break;
                }
            }
        }
        if (winner == 1) {
            System.out.println("Player 1 won");
        }
        else if (winner == 2) {
            System.out.println("Player 2 won");
        }
        else {
            System.out.println("Draw");
        }
    }

    public static void play(Field field, int value) {
        int[] coord = askLocation();
        field.changeField(coord, value);
    }

    public static int[] askLocation() {
        System.out.print("x, y = ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new int[]{--x, --y};
    }
}
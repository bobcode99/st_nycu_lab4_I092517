import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        System.out.println("Welcome to rock paper scissors game!!!");
        Scanner input = new Scanner(System.in);
        System.out.println("Please input player 1 gesture (rock, paper, scissors)");
        String player1_hand = input.nextLine();
        Game.checkName(player1_hand);
        System.out.println("Please input player 2 gesture (rock, paper, scissors)");
        String player2_hand = input.nextLine();
        Game.checkName(player2_hand);
        //Game game = new Game(player1_hand, player2_hand);
        String result = Game.checkWin_or_Lose(player1_hand, player2_hand);
        System.out.println(result);

    }
}

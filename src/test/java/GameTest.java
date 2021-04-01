import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game = new Game();
    @Test
    void badInputCae(){
        String[] digimon = {"Agumon", "Wargreymon", "Patamon", "Gabumon"};

//        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
//            throw new IllegalArgumentException("a message");
//        });
//        assertEquals("a message", exception.getMessage());
        Exception exception = assertThrows(IllegalArgumentException.class, ()->{
            game.checkName(digimon[0]);
        });
        System.out.println(exception);
        assertEquals(digimon[0], exception.getMessage());
        //assertAll(()->assertThrows(IllegalArgumentException.class, Game.checkName(digimon[0]));
    }

    @Test
    void drawCase(){
        String[] arr = {"rock", "paper", "scissors"};
        String drw = "Draw!";
        assertAll(
                () -> assertEquals(drw, game.checkWin_or_Lose(arr[0], arr[0])),
                () -> assertEquals(drw, game.checkWin_or_Lose(arr[1], arr[1])),
                () -> assertEquals(drw, game.checkWin_or_Lose(arr[2], arr[2]))
        );

    }

    @Test
    void allWinCase(){
        String[] player1 = {"rock", "paper", "scissors"};
        String[] player2 = {"rock", "paper", "scissors"};
        String pl_win = "Player 1 wins!";
        String p2_win = "Player 2 wins!";
        assertAll(
                () -> assertEquals(pl_win, game.checkWin_or_Lose(player1[0], player2[2])), // rock vs scissors
                () -> assertEquals(pl_win, game.checkWin_or_Lose(player1[1], player2[0])), // paper vs rock
                () -> assertEquals(pl_win, game.checkWin_or_Lose(player1[2], player2[1])), // scissors vs paper
                () -> assertEquals(p2_win, game.checkWin_or_Lose(player1[2], player2[0])), // rock vs scissors
                () -> assertEquals(p2_win, game.checkWin_or_Lose(player1[0], player2[1])), /// paper vs rock
                () -> assertEquals(p2_win, game.checkWin_or_Lose(player1[1], player2[2])) // scissors vs paper
        );

    }

    @Test
    void allLoseCase(){ //other win means i lost.
        String[] player1 = {"rock", "paper", "scissors"};
        String[] player2 = {"rock", "paper", "scissors"};
        String pl_win = "Player 1 wins!";
        String p2_win = "Player 2 wins!";
        assertAll(
                () -> assertEquals(pl_win, game.checkWin_or_Lose(player1[0], player2[2])), // rock vs scissors
                () -> assertEquals(pl_win, game.checkWin_or_Lose(player1[1], player2[0])), // paper vs rock
                () -> assertEquals(pl_win, game.checkWin_or_Lose(player1[2], player2[1])), // scissors vs paper
                () -> assertEquals(p2_win, game.checkWin_or_Lose(player1[2], player2[0])), // rock vs scissors
                () -> assertEquals(p2_win, game.checkWin_or_Lose(player1[0], player2[1])), /// paper vs rock
                () -> assertEquals(p2_win, game.checkWin_or_Lose(player1[1], player2[2])) // scissors vs paper
        );

    }


}
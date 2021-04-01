public class Game {
    //a. all win cases b. all lose cases c.all draw cases d.valid/invalid input cases
    public static void checkName(String tmp_gesture){
        String[] arr1 = {"rock", "paper", "scissors"};
        if(tmp_gesture.equals(arr1[0])|| tmp_gesture.equals(arr1[1]) || tmp_gesture.equals(arr1[2])){
            //System.out.println("yeah");
        }
        else {
            throw new IllegalArgumentException(tmp_gesture);
        }
    }

    public static String checkWin_or_Lose(String tmp_ply1, String tmp_ply2) {
        if(tmp_ply1.equals(tmp_ply2)) {
            //System.out.println("Draw");
            return "Draw!";
        }
        else if(tmp_ply1.equals("rock") && tmp_ply2.equals("scissors")){
            return "Player 1 wins!";
        }
        else if(tmp_ply1.equals("rock") && tmp_ply2.equals("paper")){
            return "Player 2 wins!";
        }
        else if(tmp_ply1.equals("paper") && tmp_ply2.equals("rock")){
            return "Player 1 wins!";
        }
        else if(tmp_ply1.equals("paper") && tmp_ply2.equals("scissors")){
            return "Player 2 wins!";
        }
        else if(tmp_ply1.equals("scissors") && tmp_ply2.equals("paper")){
            return "Player 1 wins!";
        }
        else if(tmp_ply1.equals("scissors") && tmp_ply2.equals("rock")){
            return "Player 2 wins!";
        }
        else {
            //System.out.println("x win");
            return "Wtf case!";
        }
    }

    public Game(){ //String tmp_ply1_g, String tmp_ply2_g
        System.out.println("in game function");
//        checkName(tmp_ply1_g);
//        checkName(tmp_ply2_g);
//        System.out.println(tmp_ply1_g);
//        System.out.println(tmp_ply2_g);
    }


}

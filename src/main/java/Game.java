import static spark.Spark.*;

public class Game {
  public Boolean checkWinner(String player1, String player2) {
    if (player1.equals("rock") && player2.equals("scissors")){
      return true;
    } else if (player1.equals("rock") && player2.equals("paper")){
      return false;

    } else if (player1.equals("paper") && player2.equals("rock")){
      return true;
    } else if (player1.equals("paper") && player2.equals("scissors")){
      return false;

    } else if (player1.equals("scissors") && player2.equals("paper")){
      return true;
    } else if (player1.equals("scissors") && player2.equals("rock")){
      return false;
    }
    return null;
  }
}
  // public String checkTie(String player1, String player2) {
  //   if (player1.equals("rock") && player2.equals("rock")){
  //     return "tie";
  //   } else if (player1.equals("paper") && player2.equals("paper")){
  //     return "tie";
  //   } else if (player1.equals("scissors") && player2.equals("scissors")){
  //     return "tie";
  //   }
  //   return "null";
  // }

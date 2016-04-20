import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Game {
  public String checkWinner(String player1, String player2) {
    if (player1.equals("rock") && player2.equals("scissors")){
      return "rock win";
    } else if (player1.equals("rock") && player2.equals("paper")){
      return "rock lose";
    }
    return null;
  }
}

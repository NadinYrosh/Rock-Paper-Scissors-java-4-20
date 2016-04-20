import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

public class GameTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
    Game testGame = new Game();
    String expected = "rock win";
    assertEquals(expected, testGame.checkWinner("rock", "scissors"));
  }
  @Test
  public void checkWinner_paperBeatsRock_true() {
    Game testGame = new Game();
    String expected = "rock lose";
    assertEquals(expected, testGame.checkWinner("rock", "paper"));
  }
  @Test
  public void checkWinner_rockTie_true() {
    Game testGame = new Game();
    String expected = "tie";
    assertEquals(expected, testGame.checkWinner("rock", "rock"));
  }
}

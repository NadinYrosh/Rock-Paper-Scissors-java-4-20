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
}

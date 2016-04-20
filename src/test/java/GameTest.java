import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;

public class GameTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
    Game testGame = new Game();
    assertEquals(true, testGame.checkWinner("rock", "scissors"));
  }
  @Test
  public void checkWinner_rockBeatsPaper_false() {
    Game testGame = new Game();
    assertEquals(false, testGame.checkWinner("rock", "paper"));
  }
  @Test
  public void checkWinner_scissorsBeatPaper_true() {
    Game testGame = new Game();
    assertEquals(true, testGame.checkWinner("scissors", "paper"));
  }
  @Test
  public void checkWinner_rockTie_true() {
    Game testGame = new Game();
    assertEquals(true, testGame.checkWinner("rock", "rock"));
  }
  @Test
  public void checkWinner_paperTie_true() {
    Game testGame = new Game();
    assertEquals(true, testGame.checkWinner("paper", "paper"));
  }
  @Test
  public void checkWinner_scissorsTie_true() {
    Game testGame = new Game();
    assertEquals(true, testGame.checkWinner("scissors", "scissors"));
  }
}

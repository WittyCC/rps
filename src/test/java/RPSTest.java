import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {

  @Test
  public void computerChooses_shouldBeAString_true() {
    String comp = "scissors";
    String user = "rock";
    RPS testGame = new RPS(user);
    String computerChoice =  testGame.computerChooses(1);
    assertEquals(true, computerChoice instanceof String);
  }

  @Test
  public void computerChooses_shouldBeScissors_true() {
    String comp = "scissors";
    String user = "rock";
    String expected = "Scissors";
    RPS testGame = new RPS(user);
    // String computerChoice =  testGame.computerChooses();
    assertEquals(expected, testGame.computerChooses(1));
  }

  @Test
  public void computerChooses_shouldBePaper_true() {
    String comp = "scissors";
    String user = "rock";
    String expected = "Paper";
    RPS testGame = new RPS(user);
    assertEquals(expected, testGame.computerChooses(2));
  }

  @Test
  public void computerChooses_shouldBeRock_true() {
    String comp = "scissors";
    String user = "rock";
    String expected = "Rock";
    RPS testGame = new RPS(user);
    assertEquals(expected, testGame.computerChooses(0));
  }
}

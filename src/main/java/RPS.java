import java.util.Random;

public class RPS {

  private String mComputerChoice;
  private String mPlayerChoice;

  RPS(String playerChoice) {
    mComputerChoice = "";
    mPlayerChoice = playerChoice;
  }

  public int randomizeCompChoice() {
    Random computerChoice = new Random();
    int computerIntChoice = computerChoice.nextInt(3);
    return computerIntChoice;
  }

  public String computerChooses(int computerChoseThis){
    // String computerStringChoice = "";
    if (computerChoseThis == 1) {
      mComputerChoice = "Scissors";
    } else if (computerChoseThis == 2) {
      mComputerChoice = "Paper";
    } else if (computerChoseThis == 0) {
      mComputerChoice = "Rock";
    }
      return mComputerChoice;
  }

  public String compareChoice(String user, String comp) {
    String getResult = "";
    if (user.equals(comp)) {
      getResult = "It's a DRAW";
    } else if (user.equals("Scissors") && comp.equals("Paper")) {
      getResult = "You WIN";
    } else if (user.equals("Scissors") && comp.equals("Rock")) {
      getResult = "You LOSE";
    } else if (user.equals("Paper") && comp.equals("Rock")) {
      getResult = "You WIN";
    } else if (user.equals("Paper") && comp.equals("Scissors")) {
      getResult = "You LOSE";
    } else if (user.equals("Rock") && comp.equals("Scissors")) {
      getResult = "You WIN";
    } else if (user.equals("Rock") && comp.equals("Paper")) {
      getResult = "You LOSE";
    } else {
      getResult = "Wrong input";
    }
    return getResult;
  }
}

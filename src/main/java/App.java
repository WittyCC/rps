import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    String userChoice = myConsole.readLine();
    RPS newGame = new RPS(userChoice);
    int newCompChoice = newGame.randomizeCompChoice();
    String compChoice = newGame.computerChooses(newCompChoice);
    System.out.println("Let's play rock-paper-scissors!\nPick an option:\nScissors\nPaper\nRock");


    String getResult = newGame.compareChoice(userChoice, compChoice);
    System.out.println("You chose " + userChoice + " and computer chose " + compChoice + "." + getResult);

  }
}

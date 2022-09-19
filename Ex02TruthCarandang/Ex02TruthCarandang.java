package Ex02TruthCarandang;
import java.util.Scanner;

public class Ex02TruthCarandang{
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int lowerBound = 0, upperBound = 10, guesses = 3;
    String menuChoice, settingChoice;
    boolean gameState = false, settingsState = false, correct = false;
    do{
      System.out.printf("%nWelcome to Higher or Lower! What do you want to do?%n> Start Game%n> Change Settings%n> End Application%n");
      menuChoice = sc.nextLine();
      if(menuChoice.equalsIgnoreCase("Start game")){
        char replayGame;
        int numberGuess;
        gameState = true;
        do{
          int random = (int) Math.floor(Math.random()*upperBound) + lowerBound;
          for(int i = guesses; i > 0; i--){
            System.out.printf("You have %d guess/es left. Guess a number from %d to %d. ", i, lowerBound, upperBound);
            numberGuess = sc.nextInt();
            if(numberGuess > random){
              System.out.printf("Incorrect! Your guess was higher than the correct answer. Try again.%n");
            }
            else if(numberGuess < random){
              System.out.printf("Incorrect! Your guess was lower than the correct answer. Try again.%n");
            }
            else {
              System.out.printf("Good job! You guessed the number. ");
              correct = true;
              break;
            }
          }
          if(!correct){
            System.out.printf("You lost... How unfortunate. ");
          }
          System.out.printf("Play again?%n");
          replayGame = sc.next().charAt(0);
          if(replayGame == 'n' || replayGame == 'N'){
            gameState = false;
          }
        }while(gameState);
      }
      else if(menuChoice.equalsIgnoreCase("Change settings")){
        settingsState = true;
        do{
          System.out.printf("== Settings ==%n%nLower Bound: %d%nUpper Bound: %d%nGuesses: %d%n%nWhat would you like to do?%n> Change Range%n> Change Guess Count%n> Exit Settings%n", lowerBound, upperBound, guesses);
          settingChoice = sc.nextLine();
          if(settingChoice.equalsIgnoreCase("Change range")){
            System.out.println("Enter new lower bound: ");
            lowerBound = sc.nextInt();
            System.out.println("Enter new upper bound: ");
            upperBound = sc.nextInt();
          }
          else if(settingChoice.equalsIgnoreCase("Change guess count")){
            System.out.println("Enter new guess count: ");
            guesses = sc.nextInt();
          }
          else if(settingChoice.equalsIgnoreCase("Exit settings")){
            settingsState = false;
          }
        }while(settingsState);
      }
      sc.nextLine();
    }while(!menuChoice.equalsIgnoreCase("End application"));
    System.out.printf("Thank you for playing! :D%n");
  }
}
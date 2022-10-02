package hangmanpackage;

import java.util.Scanner;

public class PlayerInteraction {

    private Game game;

    public PlayerInteraction() {
        this.game = new Game();
    }

    private String input = "";

    public void startGame(Words word){
        System.out.println("initialising hangman game...");
        System.out.println(word.getHiddenWord());
    }

    public void acceptInput(Scanner scanner){
        input = String.valueOf(scanner.next().toLowerCase().charAt(0));
        System.out.println("you have chosen " + input);
    }

    public void processInput(Words word , User user){
        System.out.println(game.handleResultMessage(input, word.getRandomWord(), user));
        System.out.println(game.handleLetterReveal(word, input));
    }

    public Boolean playAgain(Scanner scanner){
        System.out.println("Do you want to play again? enter y or n");
        while (true) {
            input = String.valueOf(scanner.next().toLowerCase().charAt(0));
            if (input.equals("y")) {
                return true;
            } else if (input.equals("n")) {
                return false;
            } else {
                System.out.println("Please enter either y or n");
            }
        }
    }




}

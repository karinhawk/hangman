package hangmanpackage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        PlayerInteraction playerInteraction = new PlayerInteraction();
        Scanner scanner = new Scanner(System.in);
        do {
            User user = new User();
            Words word = new Words();
            playerInteraction.startGame(word);
            while (user.getLives() != 0 && word.getHiddenWord().contains("_")){
                playerInteraction.acceptInput(scanner);
                playerInteraction.processInput(word, user);
            }
            if (!word.getHiddenWord().contains("_")){
                System.out.println("You won!");
            }
            if (user.getLives() == 0){
                System.out.println("You ran out of guesses :(");
            }
        } while (playerInteraction.playAgain(scanner));


    }
}
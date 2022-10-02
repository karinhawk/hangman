package hangmanpackage;

import java.util.ArrayList;

public class User {

    private int lives = 10;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public User() {
    }

    private ArrayList<String> usedCharacters = new ArrayList<String>();

    public void addCharacterToUsed(String input){
        usedCharacters.add(input);
    }


    public int handleLives(int lives){
        return lives -= 1;
    }
}

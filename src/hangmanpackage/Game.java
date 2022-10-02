package hangmanpackage;
public class Game {

    public Game() {
    }

    public String handleResultMessage(String input, String randomWord, User user){
        if (randomWord.contains(input)){
            return "Well done! The mystery word contains the letter " + input;
        } else {
            user.setLives(user.getLives() -1);
            return "The mystery word does not contain the letter " + input + ". You have lost one life. You now have " + user.getLives() + " lives left.";
        }
    }
    public String handleLetterReveal(Words word, String input) {
        String outputWord = "";
        if(word.getRandomWord().contains(input)) {

            for (int letter = 0; letter < word.getRandomWord().length(); letter++) {
                if (input.charAt(0) == word.getRandomWord().charAt(letter)) {
                    outputWord += word.getRandomWord().charAt(letter);
                } else {
                    outputWord += word.getHiddenWord().charAt(letter);
                }
            }
            word.setHiddenWord(outputWord);
            return word.getHiddenWord();
        } else {
            return word.getHiddenWord();
        }

    }
}

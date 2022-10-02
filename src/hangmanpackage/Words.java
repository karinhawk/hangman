package hangmanpackage;
import java.util.ArrayList;
import java.util.Random;

public class Words {

    private final ArrayList<String> words = new ArrayList<>();

    public Words() {
        words.add("fountain");
        words.add("bubble");
        words.add("hieroglyph");
        words.add("velcro");
        words.add("pumpkin");

        this.randomWord = generateWord();
        this.hiddenWord = hideLetters(randomWord);
    }

    private String randomWord = "";
    private String hiddenWord = "";

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    private final Random RANDOM = new Random();

    public String generateWord() {
        String randomWord = words.get(RANDOM.nextInt(words.size()));
        return randomWord;
    }

    public String hideLetters(String randomWord){
        String hiddenWord = "";
        for (int i = 0; i < randomWord.length(); i++)
            hiddenWord += "_";
        return hiddenWord;
    }
}

package Wisielec;

import java.util.Random;

public class WordsDatabase {
    private Random random = new Random();

    private final String[] words ={
            "Java",
            "Valeo",
            "Programowanie",
            "Ubezpieczenie",
            "poniedziałek"
    };

    public String getRandomWord(){
        int randIndex = random.nextInt(words.length);
        return words[randIndex];
    }
}

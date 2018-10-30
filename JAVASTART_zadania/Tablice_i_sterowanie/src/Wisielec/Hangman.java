package Wisielec;

import java.util.Scanner;

public class Hangman {
    private static final int NEXT_GAME = 1;
    private static final int END_GAME = 2;

    private WordsDatabase db = new WordsDatabase();
    private Scanner scanner = new Scanner(System.in);

    public Hangman(String randomWord) {

    }

    public void mainLoop(){
        int option = NEXT_GAME;

        while (option!=END_GAME){
            play();
            showOptions();
            option = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Dziękuję za grę.");
    }

    private void showOptions(){
        System.out.println(NEXT_GAME+" - kolejna gra.");
        System.out.println(END_GAME+" - koniec gry.");
    }

    private void play(){
        Hangman hangman = new Hangman(db.getRandomWord());
    }
}

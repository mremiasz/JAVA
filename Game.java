import java.util.Random;
import java.util.Scanner;

public class Game {
    public static String hashEqualizer(String word){
        StringBuilder sb = new StringBuilder();
        while (sb.length()< word.length()){
            sb.append('*');
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        String[] words = {"aa", "bbb"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int fails = 0;
        int points = 0;

        String response;
        while (fails < 3){
            String word = words[random.nextInt(words.length)];
            String hashWord = word;

            for (int i = 0; i < points; i+=1) {
                char randomChar = hashWord.charAt(random.nextInt(hashWord.length()));
                if (randomChar == '*') {
                    i--;
                    continue;
                }
                hashWord = hashWord.replaceFirst(String.valueOf(randomChar), "*");
            }

            if (hashWord.equals(hashEqualizer(hashWord))) {
                fails = 3;
            } else {
                System.out.println("Twoje wylosowane słowo: " + hashWord);
                System.out.print("Podaj słowo: ");
                response = scanner.nextLine();

                if (word.equalsIgnoreCase(response)) {
                    points++;
                    System.out.println("Gratulacje!! \nTwoje punkty: " + points +"\n");
                } else {
                    System.out.println("Podałeś złe słowo.\n");
                    fails++;
                    points--;
                }
            }
        }
        System.out.println("Koniec gry. Twoje punkty: " + (points));
    }
}

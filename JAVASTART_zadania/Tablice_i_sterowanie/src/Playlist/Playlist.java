package Playlist;

import java.time.Duration;

public class Playlist {

    public static double playlistLength(Song... songs){
        double totalDuration = 0;
        for (Song s: songs){
            totalDuration+=s.getDuration();
        }
        return totalDuration;
    }

    static String formattedTime(long totalDuration){
        Duration duration = Duration.ofSeconds(totalDuration);
        long hours = duration.toHours();
        long minutes = duration.minusHours(hours).toMinutes();
        long seconds = duration.minusHours(hours).minusMinutes(minutes).getSeconds();

        String hourPart = String.valueOf(hours);
        String minutePart = String.valueOf(minutes);
        String secondPart = String.valueOf(seconds);

        return hourPart + ":" + minutePart + ":" + secondPart;
    }

    public static void main(String[] args) {
        Song s1 = new Song("blabla", 300.);
        Song s2 = new Song("Encore", 309.0);

        System.out.println(playlistLength(s1,s2));
        System.out.println(formattedTime((long) playlistLength(s1,s2)));
    }
}

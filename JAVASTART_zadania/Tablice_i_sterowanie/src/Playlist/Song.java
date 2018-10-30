package Playlist;

public class Song {
    private String name;
    private Double duration;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Song(String name, Double duration) {

        this.name = name;
        this.duration = duration;
    }
}

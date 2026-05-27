package Part_I.Module_05.Ex_12_Song;

public class Song {
    private String name;
    private String author;
    private int durationInSeconds;

    public Song(String name, String author, int durationInSeconds) {
        this.name = name;
        this.author = author;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals(Object compared){
        if (this == compared){
            return true;
        }
        if (!(compared instanceof Song)) {
            return false;
        }
        Song comparedConvert = (Song) compared;

        if (this.name == comparedConvert.name && this.author == comparedConvert.author && this.durationInSeconds == comparedConvert.durationInSeconds){
            return true;
        }

        return false;
    }
}

public class Song {

    String name;

    public Song(String name) {
        this.name = name;
    }

    void play() {
        System.out.println("Song is played: " + name );
    }
}

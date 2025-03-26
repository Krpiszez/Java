import java.util.*;

public class Solution {

    /*
        List<Songs> should be played in random order for each play.
     */

    public static void main(String[] args) {
        Song fSong = new Song("First");
        Song sSong = new Song("Second");
        Song tSong = new Song("Third");
        Song foSong = new Song("Forth");
        Song fiSong = new Song("Fifth");

        List<Song> songList = new ArrayList<>();
        songList.add(fSong);
        songList.add(sSong);
        songList.add(tSong);
        songList.add(foSong);
        songList.add(fiSong);
        Collections.shuffle(songList);
        songList.forEach(Song::play);
    }

}

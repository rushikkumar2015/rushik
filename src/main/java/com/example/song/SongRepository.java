import java.util.*;
package com.example.song;
import com.example.song.Song;

public interface Songrepository {
    ArrayList<Song> getSongs();

    public Song getSongById(int songId);

    public Song addSong(Song song);

    public Song updateSong(int songId, Song song);

    public void deleteSong(int songId);

}

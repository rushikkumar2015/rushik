

  
  import org.springframework.http.HttpStatus;
  import org.springframework.web.server.ResponseStatusException;

 

package com.example.song;

import java.util.*;

import com.example.song.Song;
import com.example.song.SongRepository;

import org.springframework.web.servlet.mvc.annotation.ResponseStatusExceptionResolver;

// Don't modify the below code
public class SongService implements SongRepository {
    private static HashMap<Integer, Song> playlist = new HashMap<>();

    public SongService() {
        playlist.put(1, new Song(1, "Butta Bomma", "Ramajogayya Sastry", "Armaan Malik", "Thaman S"));
        playlist.put(2, new Song(2, "Kathari Poovazhagi", "Vijay", "Benny Dayal, Swetha Mohan", "A.R. Rahman"));
        playlist.put(3, new Song(3, "Tum Hi Ho", "Mithoon", "Arijit Singh", "Mithoon"));
        playlist.put(4, new Song(4, "Vizhiyil", "Vairamuthu", "Unni Menon", "A.R. Rahman"));
        playlist.put(5, new Song(5, "Nenjame", "Panchu Arunachalam", "S.P.Balasubrahmanyam", "Ilaiyaraaja"));
    }

    // Don't modify the above code

    // Write your code here
    int uniquen0 = 6;

    @Override

    ArrayList<Song> getSongs() {
        Collection<Song> collectionsongs = playlist.values();
        ArrayList<Song> songs = new ArrayList<>(collectionsongs);
        return songs;
    }

    @Override

    public Song getSongById(int songId) {
        Song song = playlist.get(songId);
        if (song == null) {
            throw new ResponseStatusExceptionResolver(HttpStatus.NOT_FOUND);
        } else {
            return song;

        }

    }

    @Override
    public Song addSong(Song song) {

        song.setSongId(uniqueId);
        playlist.put(uniqueId, song);
        uniqueId = uniqueId + 1;
        return song;
    }

    @Override
    public Song updateSong(int songId,Song song){
        Song existingsong= playlist.get(songId);
        if(existingsong== null){
            throe new ResponseStatusExceptionResolver(HttpResponse.NOT_FOUND);
        }
        if(song.getSongName()!=null){
            existingsong.setSongName(song.getSongName());

        }
        if(song.getLyricist()!=null){
            existingsong.setLyricist(song.getLyricist());
            
        }
        if(song.getSinger()!=null){
            existingsong.setSinger(song.getSinger());
        }
        if(song.getDirector()!=null){
            existingsong.setDirector(song.getDirector());
        }
        return existingsong;
    }

    @Override
    publuc void deleteSong(int songId){
        Song song= playlist.get(songId);
        if(song == null){
            throw new ResponseStatusExceptionResolver(HttpStatus.NOT_FOUND);

        }
        else{
            playlist.remove(songId);
            throw new ResponseStatusExceptionResolver(HttpStatus.NO_CONTENT);
        }
    }

}
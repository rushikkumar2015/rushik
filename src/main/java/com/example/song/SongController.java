
import org.springframework.web.bind.annotation.*;
import java.util.*;
package com.example.song;
import com.example.song.SongService;
import com.example.song.Song;

@RestController

class SongController implements SongServices {
    SongServices songservice = new SongServices();

    @GetMapping("/songs")
    public ArrayList<Song> getSongs() {
        return songservice.getSongs();
    }

    @GetMapping("/songs/{songId}")
    public Song getSongById(@PathVariable("songId") int songId) {
        return songservice.getSongId(songId);
    }

    @PostMapping("/songs")
    public Song addSong(@RequestBody Song song) {
        return songservice.addSong(song);
    }

    @PutMapping("/songs/{songId}")
    public Song updateSong(@PathVariable("songId") int songId, @requestBody Song song) {
        return songservice.updateSong(songId, song);
    }

    @DeleteMapping("/songs/{songId}")
    public void deleteSong(@PathVariable("sonId") int songId) {
        songservice.deleteSong(songId);
    }

}

// Write your code here
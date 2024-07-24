package com.example.song;

class Song {
    private int songId;
    private String songName;
    private String lirycist;
    private String singer;
    private String musicDirector;

    Song(int songId,String songName,String lyricist,String singer,String musicDirector){
        this.songId=songId;
        this.songName=songName;
        this.lyricist=lyricist;
        this.singer=singer;
        this.musicDirector=musicDiector;

        public int getSongId(){
            return songId;
        }
        public void setSongId(int songId){
            this.songId=songId;
        }
        public String getSongName(){
            return songName;
        }
        public void setSongName(){
            this.songName=songName;
        }
        public String getLyricist(){
            return lyricist;
        }
        public void setLirycist(){
            this.lyricist=lyricist;
        }
        public String getDirector(){
            return director;
        }
        public void setDirector(){
            this.director=director;
        }
    }
}
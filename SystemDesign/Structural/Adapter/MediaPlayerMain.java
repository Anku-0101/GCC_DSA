package DesignPattern.Adapter;

public class MediaPlayerMain{
    public static void main(string[] args){
        MediaPlayer mediaPlayer = new MediaPlayerImpl();
        mediaPlayer.play("mysong", "mp3");
        mediaPlayer.play("mySongInNewFormat", "avi");
    }
}
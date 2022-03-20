package DesignPattern.Adapter;

public class MediaPlayerImpl implements MediaPlayer{
    MediaPlayerAdapter mediaPlayerAdapter;
    MediaPlayer mediaPlayer;

    @Override
    public void play(string filName, string filFormat)
    {
        if(filFormat.equals("MP3"))
        {
            mediaPlayer = new DefaultMediaPlayer();
            mediaPlayer.play(fileToPlay, formatToPlay);
        }
        else
        {
            AdvanceFormat advanceFormat = new AdvanceFormat();
            advanceFormat.SetResolutionToPlay("720p");
            mediaPlayerAdapter = new mediaPlayerAdapter(advanceFormat);
            mediaPlayerAdapter.play(fileToPlay, formatToPlay);
        }
    }
}
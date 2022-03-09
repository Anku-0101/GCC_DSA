package DesignPattern.Adapter;

public class MediaPlayerAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;
    AdvanceFormat advanceFormat;

    public MediaPlayerAdapter(AdvanceFormat advanceFormat_){
        advanceMediaPlayer = new AVIMediaPlayer();
        this.advanceFormat = advanceFormat_;
    }

    @Override
    public void Play(string FileToPlay, string FormatToPlay){
        advanceFormat.SetFileToPlay(FileToPlay);
        advanceFormat.SetFormatToPlay(FormatToPlay);

        advanceMediaPlayer.playAdvanceFormat(advanceFormat);

    }
}
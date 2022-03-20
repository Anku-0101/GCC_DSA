package DesignPattern.Adapter;

public class DefaultMediaPlayer implements MediaPlayer{

    @Override
    public void play(String fileName, String fileFormat){
        System.out.println("Playing " + fileName + "."+fileFormat);
    }
}
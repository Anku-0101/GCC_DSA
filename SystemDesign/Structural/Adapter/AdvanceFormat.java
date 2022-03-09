package DesignPattern.Adapter;

public class AdvanceFormat{
    private String fileToPlay;
    private String formatToPlay;
    private String resolution;

    public String GetFileToPlay()
    {
        return fileToPlay;
    }

    public void SetFileToPlay(string FileToPlay)
    {
        this.fileToPlay = FileToPlay;
    }

    public String GetFormatToPlay()
    {
        return formatToPlay;
    }

    public void SetFormatToPlay(string FormatToPlay)
    {
        this.formatToPlay = FormatToPlay;
    }

    public String GetResolutionToPlay()
    {
        return resolution;
    }

    public void SetResolutionToPlay(string Resolution)
    {
        this.resolution = Resolution;
    }



}
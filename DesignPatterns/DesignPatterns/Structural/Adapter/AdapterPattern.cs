using System;
namespace DesignPatterns.DesignPatterns.Structural.Adapter
{
    public class AdapterPattern
    {
        public AdapterPattern()
        {
        }
    }

    public interface IMediaPlayer
    {
        void Play(string audioType, string fileName);
    }

    public interface IAdvancedMedaiaPlayer
    {
        void PlayAdvance(string fileName);
    }

    public class VLCPlayer : IAdvancedMedaiaPlayer
    {
        public void PlayAdvance(string fileName)
        {
            Console.WriteLine("Playing vlc file. Name : " + fileName);
        }
    }

    public class MP4Player : IAdvancedMedaiaPlayer
    {
        public void PlayAdvance(string fileName)
        {
            Console.WriteLine("Playing mp4 file. Name : " + fileName);
        }
    }

    /// <summary>
    /// Create adapter class implementing the MediaPlayer interface.
    /// </summary>
    public class MediaAdapter : IMediaPlayer
    {
        IAdvancedMedaiaPlayer advancedMedaiaPlayer;

        public MediaAdapter(string audioType)
        {
            if (audioType.ToLower() == "vlc")
                advancedMedaiaPlayer = new VLCPlayer();
            else if (audioType.ToLower() == "mp4")
                advancedMedaiaPlayer = new MP4Player();
        }

        public void Play(string audioType, string fileName)
        {
            if (audioType.ToLower() == "vlc")
                advancedMedaiaPlayer.PlayAdvance(fileName);
            else if (audioType.ToLower() == "mp4")
                advancedMedaiaPlayer.PlayAdvance(fileName);
            
        }
    }

    /// <summary>
    /// Create concrete class implementing the MediaPlayer interface.
    /// </summary>
    public class AudioPlayer : IMediaPlayer
    {
        MediaAdapter mediaAdapter; // This makes old audioPlayer capable of handling new file types

        public void Play(string audioType, string fileName)
        {
            // inbuilt support to play mp3 music files
            if(audioType.ToLower() == "mp3")
                Console.WriteLine("Playing mp3 file. Name: " + fileName);

            else if(audioType.ToLower() == "vlc" || audioType.ToLower() == "mp4")
            {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.Play(audioType, fileName);
            }
            else
            {
                Console.WriteLine("Invalid media. " + audioType + " format not supported");
            }
        }

        
    }
}


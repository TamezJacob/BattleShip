import javax.sound.sampled.*;
import java.util.Scanner;
import java.io.*;

public class SoundPlayer {
    
    Scanner scanner;
    File mainMenuMusicFile;
    AudioInputStream mainMenuAudioStream;
    Clip mainMenuClip;

    SoundPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        scanner = new Scanner(System.in);

        mainMenuMusicFile = new File("Battleship Documents/sound/main menu.wav");;
        mainMenuAudioStream = AudioSystem.getAudioInputStream(mainMenuMusicFile);
        mainMenuClip = AudioSystem.getClip();
        mainMenuClip.open(mainMenuAudioStream);
    }

    public void playMainMenuMusic(){
        mainMenuClip.start();
    }

    public void stopMainMenuMusic(){
        mainMenuClip.stop();
    }
}

import javax.sound.sampled.*;
import java.util.Scanner;
import java.io.*;

public class SoundPlayer {
    
    Scanner scanner;
    File mainMenuMusicFile, battleMusicFile;
    AudioInputStream mainMenuAudioStream, battleAudioStream;
    Clip mainMenuClip, battleClip;

    SoundPlayer() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        scanner = new Scanner(System.in);

        mainMenuMusicFile = new File("Battleship Documents/sound/main menu.wav");
        mainMenuAudioStream = AudioSystem.getAudioInputStream(mainMenuMusicFile);
        mainMenuClip = AudioSystem.getClip();
        mainMenuClip.open(mainMenuAudioStream);

        battleMusicFile = new File("Battleship Documents/sound/battle.wav");
        battleAudioStream = AudioSystem.getAudioInputStream(battleMusicFile);
        battleClip = AudioSystem.getClip();
        battleClip.open(battleAudioStream);
    }

    public void playMainMenuMusic(){
        mainMenuClip.start();
    }

    public void stopMainMenuMusic(){
        mainMenuClip.stop();
    }

    public void playBattleMusic(){
        battleClip.start();
    }

    public void stopBattleuMusic(){
        battleClip.stop();
    }

}

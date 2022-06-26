import javax.sound.sampled.*;
import java.util.Scanner;
import java.io.*;

public class SoundPlayer {
    
    Scanner scanner;
    File mainMenuMusicFile, battleMusicFile, missSoundEffectFile, hitSoundEffectFile, victorySoundEffectFile;
    AudioInputStream mainMenuAudioStream, battleAudioStream, missAudioStream, hitAudioStream, victoryAudioStream;
    Clip mainMenuClip, battleClip, missClip, hitClip, victoryClip;

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

        missSoundEffectFile = new File("Battleship Documents/sound/miss.wav");
        missAudioStream = AudioSystem.getAudioInputStream(missSoundEffectFile);
        missClip = AudioSystem.getClip();
        missClip.open(missAudioStream);

        hitSoundEffectFile = new File("Battleship Documents/sound/hit.wav");
        hitAudioStream = AudioSystem.getAudioInputStream(hitSoundEffectFile);
        hitClip = AudioSystem.getClip();
        hitClip.open(hitAudioStream);

        /*victorySoundEffectFile = new File("Battleship Documents/sound/victory.wav");
        victoryAudioStream = AudioSystem.getAudioInputStream(victorySoundEffectFile);
        victoryClip = AudioSystem.getClip();
        victoryClip.open(victoryAudioStream);*/
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

    public void playMissSoundEffect() {
        missClip.start();
    }

    public void playHitSoundEffect() {
        hitClip.start();
    }

    public void playVictorySoundEffect() {
        battleClip.stop();
        victoryClip.start();
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.*;
import javax.swing.event.*;

import java.util.Scanner;
import java.io.*;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * @author Minh Phan minh.phan@sjsu.edu
 * CS 151 HW4 Fall 2017
 */

public class BattleShip implements GameState {
    private GameState beginningOfTheGame; //begin of the game AttackGrid is OFF and SelfGrid is ON
    private GameState middleOfTheGame; //middle of the game AttackGrid is ON and SelfGrid is OFF
    private GameState endOfTheGame; // end the game when one of the player win
    private GameState state;
    private boolean takeTurnAttack; // make sure each player can only attack ONCE

    private PlayerData player1Data;
    private PlayerData player2Data;
    public PlayerScreen player1 ;
    private PlayerScreen player2;
    private MainMenu menu;
    private int shipSize;
    private int shipNum;

    SoundPlayer soundPlayer;
    
    private BattleShip() throws UnsupportedAudioFileException, IOException, LineUnavailableException {

        this.shipNum = 5;
        soundPlayer = new SoundPlayer();
		soundPlayer.playMainMenuMusic();

        menu = new MainMenu();
        player1 = new PlayerScreen("Player1", false,this, soundPlayer);
        player2 = new PlayerScreen("Player2", false,this, soundPlayer);
        player1Data = new PlayerData(player1, shipSize);
        player2Data = new PlayerData(player2, shipSize);
        beginningOfTheGame = new BeginningOfTheGame(this, player1,player2);
        middleOfTheGame = new MiddleOfTheGame(this, player1,player2);
        endOfTheGame = new EndOFTheGame(this, player1,player2);
        this.state = beginningOfTheGame;
        
        menu.start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1.setVisible(true);
                menu.frame.setVisible(false);
                soundPlayer.stopMainMenuMusic();
                soundPlayer.playBattleMusic();
                }
            }
        );

        menu.music.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(soundPlayer.mainMenuClip.isActive())
                    soundPlayer.stopMainMenuMusic();
                else
                    soundPlayer.playMainMenuMusic();
                }
            }
        );

        menu.ssSlider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				shipSize = menu.ssSlider.getValue();
                menu.ssLabel.setText(shipSize + " Units Long");
                player1Data.setShipSize(shipSize);
                player2Data.setShipSize(shipSize);
			}
		});

        menu.ssNum.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				shipNum = menu.ssNum.getValue();
                menu.ssNumLabel.setText(shipNum + " Ships");
                player1Data.setShipNum(shipNum);
                player2Data.setShipNum(shipNum);
			}
		});

        player1.musicBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player1.musicBox.isSelected() == true) {
                    soundPlayer.playBattleMusic();
                    player2.musicBox.setSelected(true);
                }else{
                    soundPlayer.stopBattleuMusic();
                    player2.musicBox.setSelected(false);
                }
            }
        });

        player2.musicBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(player2.musicBox.isSelected() == true) {
                    soundPlayer.playBattleMusic();
                    player1.musicBox.setSelected(true);
                }else{
                    soundPlayer.stopBattleuMusic();
                    player1.musicBox.setSelected(false);
                }    
            }
        });
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        BattleShip game = new BattleShip();

        game.player1Turn();
        game.player2turn();
    }



    public void player1Turn() {
        state.player1Turn();

    }

    public void player2turn() {
        state.player2turn();
    }

    // method to transfer the game from beginning to middle of the game
    public GameState getMiddleOfTheGame() {
        return middleOfTheGame;
    }

    // method to transfer the game from middle to the end of the game
    public GameState getEndOfTheGame() {
        return endOfTheGame;
    }

    // method to set the state of the game to the desired state
    public void setState(GameState state) {
        this.state = state;
    }

    public void setTakeTurnAttack(boolean isPlayerTurn){
        this.takeTurnAttack = isPlayerTurn;
    }

    public boolean getTakeTurnAttack() {
        return takeTurnAttack;
    }

    public PlayerData getPlayer2Data() {
        return player2Data;
    }

    public PlayerData getPlayer1Data() {
        return player1Data;
    }

    public PlayerScreen getPlayer1() {
        return player1;
    }

    public PlayerScreen getPlayer2() {
        return player2;
    }

    public void playHitSoundEffect() {
        soundPlayer.playHitSoundEffect();
    }

    public void playExplosionSoundEffect() {
        soundPlayer.playExplosionSoundEffect();
    }

    public void playMissSoundEffect() throws LineUnavailableException, IOException {
        soundPlayer.playMissSoundEffect();
    }
    
    public int getShipSize(){
        return shipSize;
    }

    public int getShipNum(){
        return shipNum;
    }

    public void setShipNum(int sN){
        this.shipNum = sN;
    }
}
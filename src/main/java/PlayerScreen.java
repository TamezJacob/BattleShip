import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static sun.jvm.hotspot.ui.AnnotatedMemoryPanel.colors;

/**
 * @author Danil Kolesnikov danil.kolesnikov@sjsu.edu
 * @author Minh Phan minh.phan@sjsu.edu
 * CS 151 HW4 Fall 2017
 */

public class PlayerScreen extends JFrame {
    int size;
    boolean isbeginningOfTheGameOfPlayer1 = true;
    boolean isbeginningOfTheGameOfPlayer2 = true;
    BattleShip battleShip;
    JLabel ownShipSunk;
    JLabel shipBeginning;
    JLabel enemyShipSunk;
    JComboBox playerColorBox;
    String[] playerColorChoices = {"Cyan", "Red", "Blue", "Yellow", "Green"};

    public PlayerScreen(String name, boolean show,BattleShip battleShip) {
        super(name);
        this.battleShip = battleShip;
        this.setLayout(new BorderLayout());
        this.add(new SelfGrid(name, battleShip), BorderLayout.EAST);
        this.add(new AttackGrid(name, battleShip, this), BorderLayout.WEST);
        this.add(new JLabel(name), BorderLayout.NORTH);

        JButton next = new JButton("next");

        // Define JComboBox for playerColorBox - the box for selecting ship colors
        playerColorBox = new JComboBox(playerColorChoices);

        // Create an action listener for getting the new color
        playerColorBox.addActionListener(new ActionListener() {
                                             public void actionPerformed(ActionEvent e) {

                                                 if (e.getSource() == playerColorBox) {
                                                     System.out.println(playerColorBox.getSelectedItem());
                                                     if (name.equals("Player1")) {
                                                         battleShip.getPlayer1Data().setShipColor((playerColorBox.getSelectedItem().toString()));                // Only works in beginning game state
                                                     } else {
                                                         battleShip.getPlayer2Data().setShipColor((playerColorBox.getSelectedItem().toString()));                // Only works in beginning game state
                                                     }
                                                 }

                                             }
                                         }
        );


        JComboBox ColorListBox = new JComboBox(playerColorChoices);
        ColorListBox.addActionListener(new ActionListener() {
                                        public void actionPerformed(ActionEvent e) {
                                            if (e.getSource() == ColorListBox) {
                                                System.out.println(ColorListBox.getSelectedItem());
                                                if (name.equals("Player1")) {
                                                    battleShip.getPlayer1Data().setBoardColor((ColorListBox.getSelectedItem().toString()));                
                                                } else {
                                                    battleShip.getPlayer2Data().setBoardColor((ColorListBox.getSelectedItem().toString()));               
                                                }
                                            }

                                        }
                                    }
        );


        Box verticalBox = Box.createVerticalBox();

        Box horizontalBox0 = Box.createHorizontalBox();
        horizontalBox0.add(new JLabel("Status for: " + name));
        verticalBox.add(horizontalBox0, BorderLayout.WEST);


        JPanel panel = new JPanel();

        Box horizontalBox1 = Box.createHorizontalBox();
        horizontalBox1.add(new JLabel("Own ships: "));
        shipBeginning = new JLabel("" + Integer.toString(size));
        horizontalBox1.add(shipBeginning);
        verticalBox.add(horizontalBox1, BorderLayout.SOUTH);


        Box horizontalBox2 = Box.createHorizontalBox();
        horizontalBox2.add(new JLabel("Own ships sunk: "));
        ownShipSunk = new JLabel("" + Integer.toString(size));
        horizontalBox2.add(ownShipSunk);
        verticalBox.add(horizontalBox2, BorderLayout.EAST);

        Box horizontalBox3 = Box.createHorizontalBox();
        horizontalBox3.add(new JLabel("Enemy's ships sunk: "));
        enemyShipSunk = new JLabel("" + Integer.toString(size));
        horizontalBox3.add(enemyShipSunk);
        verticalBox.add(horizontalBox3);

        // Create new horizontal box for adding the playerColorBox
        Box horizontalBox4 = Box.createHorizontalBox();
        horizontalBox4.add(new JLabel("                            " +                        // Spacing for layout
                "                        Ship Color: "));
        horizontalBox4.add(playerColorBox);
        JLabel blankLabel = new JLabel("                            " +                       // Spacing for layour
                "                            ");
        horizontalBox4.add(blankLabel);
        verticalBox.add(horizontalBox4);

        Box horizontalBox5 = Box.createHorizontalBox();

        horizontalBox5.add(new JLabel("                            " +
                "                        Board Color: "));
        horizontalBox5.add(ColorListBox);
        JLabel boardColorLabelBlank = new JLabel("                            " +
                "                            ");
        horizontalBox5.add(boardColorLabelBlank);
        verticalBox.add(horizontalBox5);


        next.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (name.equals("Player1")) {
                    size = battleShip.getPlayer1Data().getFleet().size();
                    if (isbeginningOfTheGameOfPlayer1) {
                        shipBeginning.setText(Integer.toString(size));
                        isbeginningOfTheGameOfPlayer1 = false;
                    }
                    if (!isbeginningOfTheGameOfPlayer1) {
                        battleShip.player1Turn();
                    }
                    hideScreen();
                    battleShip.getPlayer2().showScreen();
                }
                if (name.equals("Player2")) {
                    size = battleShip.getPlayer2Data().getFleet().size();
                    if (isbeginningOfTheGameOfPlayer2) {
                        shipBeginning.setText(Integer.toString(size));
                        isbeginningOfTheGameOfPlayer2 = false;
                    }
                    if (!isbeginningOfTheGameOfPlayer2) {
                        battleShip.player2turn();
                    }
                    hideScreen();
                    battleShip.getPlayer1().showScreen();
                }
            }
        });
        this.add(next, BorderLayout.CENTER);
        this.add(verticalBox, BorderLayout.SOUTH);
        this.pack();
        this.setVisible(show);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void showScreen(){
        this.setVisible(true);
    }

    public void hideScreen() {

        this.setVisible(false);
    }

    public SelfGrid getSelfGrid(){

        for(Component child : this.getContentPane().getComponents()){

            if(child instanceof SelfGrid ){
                return (SelfGrid)child;
            }
        }
        return null;
    }

    public AttackGrid getAttackGrid(){
        for(Component child : this.getContentPane().getComponents()){
            if(child instanceof AttackGrid ){
                return (AttackGrid) child;
            }

        }
        return null;
    }
    public JButton getNextButton(){
        for(Component child : this.getContentPane().getComponents()){
            if(child instanceof JButton ){
                return (JButton) child;
            }

        }
        return null;
    }
    public boolean getIsbeginningOfTheGameOfPlayer2() {
        return isbeginningOfTheGameOfPlayer2;
    }
}
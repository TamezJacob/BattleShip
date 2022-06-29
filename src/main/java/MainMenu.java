import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class MainMenu extends JFrame implements ActionListener, ChangeListener {
    public JFrame frame;
	private JPanel mainMenu;
	private JPanel Play;
	private JPanel Instructions;
	private JPanel Instructions1;
	private JPanel Instructions2;
	private JPanel Instructions3;
	private JPanel Instructions4;
	private JLabel welcome;
	private JLabel Instructions1Label;
	private JLabel Instructions2Label;
	private JLabel Instructions3Label;
	private JLabel Instructions4Label;
	private JLabel Instructions5Label;
	private JLabel firstInstr;
	private JLabel secondInstr;
	private JLabel thirdInstr;
	private JLabel fourthInstr;
	private JLabel fifthInstr;
	private JLabel readyForB; 
	private JButton play;
	private JButton play1;
	private JButton instructions;
	private JButton instructions1;
	private JButton instructions2;
	private JButton instructions3;
	private JButton instructions4;
	private JButton instructions5;
	private JButton next1;
	private JButton next2;
	private JButton next3;
	private JButton next4;
	private JFrame ssFrame;
	public JSlider ssSlider;
	public JLabel ssLabel;
	private JPanel ssPanel;
	public JButton ssButton;
	private JButton ssMenuButton;
	public int ssSize;
	public JButton start;
	public JButton music;
	public JFrame gridSizeSelect;
	public  JComboBox <String> combo;
	public JLabel boardSize;
	BattleShip game;


	public MainMenu() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		frame = new JFrame();
		mainMenu = new JPanel();
		Play = new JPanel();
		Instructions = new JPanel();
		Instructions1 = new JPanel();
		Instructions2 = new JPanel();
		Instructions3 = new JPanel();
		Instructions4 = new JPanel();
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		welcome = new JLabel("Welcome to Battle Space Ship!");
		welcome.setOpaque(true);
		welcome.setBackground(Color.black);
		welcome.setForeground(Color.green);
		welcome.setFont(new Font("MV Boli", Font.PLAIN, 14));
		welcome.setBorder(new LineBorder(Color.green, 1));
		
		Instructions1Label = new JLabel("Instructions", SwingConstants.CENTER);
		Instructions1Label.setOpaque(true);
		Instructions1Label.setBackground(Color.black);
		Instructions1Label.setForeground(Color.green);
		Instructions1Label.setFont(new Font("MV Boli", Font.PLAIN, 14));
		Instructions1Label.setBorder(new LineBorder(Color.green, 1));
		
		Instructions2Label = new JLabel("Instructions", SwingConstants.CENTER);
		Instructions2Label.setOpaque(true);
		Instructions2Label.setBackground(Color.black);
		Instructions2Label.setForeground(Color.green);
		Instructions2Label.setFont(new Font("MV Boli", Font.PLAIN, 14));
		Instructions2Label.setBorder(new LineBorder(Color.green, 1));
		
		Instructions3Label = new JLabel("Instructions", SwingConstants.CENTER);
		Instructions3Label.setOpaque(true);
		Instructions3Label.setBackground(Color.black);
		Instructions3Label.setForeground(Color.green);
		Instructions3Label.setFont(new Font("MV Boli", Font.PLAIN, 14));
		Instructions3Label.setBorder(new LineBorder(Color.green, 1));
		
		Instructions4Label = new JLabel("Instructions", SwingConstants.CENTER);
		Instructions4Label.setOpaque(true);
		Instructions4Label.setBackground(Color.black);
		Instructions4Label.setForeground(Color.green);
		Instructions4Label.setFont(new Font("MV Boli", Font.PLAIN, 14));
		Instructions4Label.setBorder(new LineBorder(Color.green, 1));
		
		Instructions5Label = new JLabel("Instructions", SwingConstants.CENTER);
		Instructions5Label.setOpaque(true);
		Instructions5Label.setBackground(Color.black);
		Instructions5Label.setForeground(Color.green);
		Instructions5Label.setFont(new Font("MV Boli", Font.PLAIN, 14));
		Instructions5Label.setBorder(new LineBorder(Color.green, 1));
		
		firstInstr = new JLabel("1. Select number of spaceships");
		firstInstr.setOpaque(true);
		firstInstr.setFont(new Font("MV Boli", Font.PLAIN, 14));
		firstInstr.setForeground(Color.green);
		firstInstr.setBackground(Color.black);
		
		secondInstr = new JLabel("<html>2. Player 1, place your ships<br/>(Player 2, please look away)</html>");
		secondInstr.setOpaque(true);
		secondInstr.setFont(new Font("MV Boli", Font.PLAIN, 14));
		secondInstr.setForeground(Color.green);
		secondInstr.setBackground(Color.black);
		
		thirdInstr = new JLabel("<html>3. Player 2, place your ships<br/>(Player 1, please look away)</html>");
		thirdInstr.setOpaque(true);
		thirdInstr.setFont(new Font("MV Boli", Font.PLAIN, 14));
		thirdInstr.setForeground(Color.green);
		thirdInstr.setBackground(Color.black);
		
		fourthInstr = new JLabel("<html>4. Players take turns shooting<br/>at each others ships</html>");
		fourthInstr.setOpaque(true);
		fourthInstr.setFont(new Font("MV Boli", Font.PLAIN, 14));
		fourthInstr.setForeground(Color.green);
		fourthInstr.setBackground(Color.black);
		
		fifthInstr = new JLabel("<html>5. Player who sinks all of opponents<br/>ships first wins the game</html>");
		fifthInstr.setOpaque(true);
		fifthInstr.setFont(new Font("MV Boli", Font.PLAIN, 14));
		fifthInstr.setForeground(Color.green);
		fifthInstr.setBackground(Color.black);
		
		play = new JButton("Play");
		play.addActionListener(this);
		play.setFocusable(false);
		play.setBorder(new LineBorder(Color.green, 1));
		play.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		play1 = new JButton("Return to Main Menu");
		play1.addActionListener(this);
		play1.setFocusable(false);
		play1.setBorder(new LineBorder(Color.green, 1));
		play1.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		instructions = new JButton("Instructions");
		instructions.addActionListener(this);
		instructions.setFocusable(false);
		instructions.setBorder(new LineBorder(Color.green, 1));
		instructions.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		instructions1 = new JButton("Return to Main Menu");
		instructions1.addActionListener(this);
		instructions1.setFocusable(false);
		instructions1.setBorder(new LineBorder(Color.green, 1));
		instructions1.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		instructions2 = new JButton("Return to Main Menu");
		instructions2.addActionListener(this);
		instructions2.setFocusable(false);
		instructions2.setBorder(new LineBorder(Color.green, 1));
		instructions2.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		instructions3 = new JButton("Return to Main Menu");
		instructions3.addActionListener(this);
		instructions3.setFocusable(false);
		instructions3.setBorder(new LineBorder(Color.green, 1));
		instructions3.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		instructions4 = new JButton("Return to Main Menu");
		instructions4.addActionListener(this);
		instructions4.setFocusable(false);
		instructions4.setBorder(new LineBorder(Color.green, 1));
		instructions4.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		instructions5 = new JButton("Return to Main Menu");
		instructions5.addActionListener(this);
		instructions5.setFocusable(false);
		instructions5.setBorder(new LineBorder(Color.green, 1));
		instructions5.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		next1 = new JButton("Next");
		next1.addActionListener(this);
		next1.setFocusable(false);
		next1.setBorder(new LineBorder(Color.green, 1));
		next1.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		next2 = new JButton("Next");
		next2.addActionListener(this);
		next2.setFocusable(false);
		next2.setBorder(new LineBorder(Color.green, 1));
		next2.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		next3 = new JButton("Next");
		next3.addActionListener(this);
		next3.setFocusable(false);
		next3.setBorder(new LineBorder(Color.green, 1));
		next3.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		next4 = new JButton("Next");
		next4.addActionListener(this);
		next4.setFocusable(false);
		next4.setBorder(new LineBorder(Color.green, 1));
		next4.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		start = new JButton("Start Game");
		start.setFocusable(false);
		start.setBorder(new LineBorder(Color.green, 1));
		start.setFont(new Font("MV Boli", Font.BOLD, 14));

		music = new JButton("Menu Music On/Off");
		music.setVisible(true);
		music.setFocusable(false);
		music.setBorder(new LineBorder(Color.green, 1));
		music.setFont(new Font("MV Boli", Font.BOLD, 14));

		mainMenu.add(welcome);
		mainMenu.add(play);
		mainMenu.add(instructions);
		mainMenu.add(music);
		mainMenu.setBounds(0, 0, 300, 300);
	    mainMenu.setBackground(Color.black);
	    mainMenu.setLayout(new GridLayout(0, 1, 20, 20));

		ssMenuButton = new JButton("Ship Size");
		ssMenuButton.addActionListener(this);
		ssMenuButton.setFocusable(false);
		ssMenuButton.setBorder(new LineBorder(Color.green, 1));
		ssMenuButton.setFont(new Font("MV Boli", Font.BOLD, 14));
	    
		JComboBox combo = new JComboBox <String>();
        combo.addItem("10x10");
        combo.addItem("15x15");
        combo.addItem("20x20");

		boardSize = new JLabel("Please select size:");
		boardSize.setOpaque(true);
		boardSize.setFont(new Font("MV Boli", Font.PLAIN, 14));
		boardSize.setForeground(Color.green);
		boardSize.setBackground(Color.black);

		
		Border border2 = BorderFactory.createLineBorder(Color.green, 3); 
		readyForB = new JLabel("Ready for Battle!!!"); 
		readyForB.setOpaque(true); 
		readyForB.setBackground(Color.black); 
		readyForB.setForeground(Color.green); 
		readyForB.setFont(new Font("MV Boli", Font.PLAIN, 24)); 
		readyForB.setBorder(new LineBorder(Color.green, 1)); 

		Play.add(start);
		//Play.add(ssMenuButton);
	    Play.add(play1);
		Play.add(combo);
		Play.add(readyForB);
		Play.setBounds(0, 0, 300,500);
	    Play.setBackground(Color.black);
	    Play.setLayout(new GridLayout(0, 1, 20, 10));
	    Play.setVisible(false);
	    
	    
	    Instructions.add(Instructions1Label);
	    Instructions.add(firstInstr);
	    Instructions.add(next1);
	    Instructions.add(instructions1);
		Instructions.setBounds(0, 0, 100,500);
	    Instructions.setBackground(Color.black);
	    Instructions.setLayout(new GridLayout(0, 1, 20, 20));
	    Instructions.setVisible(false);
	    
	    Instructions1.add(Instructions2Label);
	    Instructions1.add(secondInstr);
	    Instructions1.add(next2);
	    Instructions1.add(instructions2);
		Instructions1.setBounds(0, 0, 100,500);
	    Instructions1.setBackground(Color.black);
	    Instructions1.setLayout(new GridLayout(0, 1, 20, 20));
	    Instructions1.setVisible(false);
	    
	    Instructions2.add(Instructions3Label);
	    Instructions2.add(thirdInstr);
	    Instructions2.add(next3);
	    Instructions2.add(instructions3);
		Instructions2.setBounds(0, 0, 100,500);
	    Instructions2.setBackground(Color.black);
	    Instructions2.setLayout(new GridLayout(0, 1, 20, 20));
	    Instructions2.setVisible(false);
	    
	    Instructions3.add(Instructions4Label);
	    Instructions3.add(fourthInstr);
	    Instructions3.add(next4);
	    Instructions3.add(instructions4);
		Instructions3.setBounds(0, 0, 100,500);
	    Instructions3.setBackground(Color.black);
	    Instructions3.setLayout(new GridLayout(0, 1, 20, 20));
	    Instructions3.setVisible(false);
	    
	    Instructions4.add(Instructions5Label);
	    Instructions4.add(fifthInstr);
	    Instructions4.add(instructions5);
		Instructions4.setBounds(0, 0, 100,500);
	    Instructions4.setBackground(Color.black);
	    Instructions4.setLayout(new GridLayout(0, 1, 20, 20));
	    Instructions4.setVisible(false);	

        ssFrame = new JFrame();
        ssLabel = new JLabel();
        ssButton = new JButton();
        ssPanel=new JPanel();  

		ssFrame.setBackground(Color.black);

        ssSlider = new JSlider(JSlider.HORIZONTAL, 1, 3, 3);  
        ssSlider.setMinorTickSpacing(1);  
        ssSlider.setMajorTickSpacing(2);  
        ssSlider.setPaintTicks(true);  
        ssSlider.setPaintLabels(true);
		ssSlider.setFocusable(false);
		ssSlider.setBackground(Color.black);
		ssSlider.setForeground(Color.green);
		ssSlider.setBorder(new LineBorder(Color.green, 1));
		ssSlider.setFont(new Font("MV Boli", Font.BOLD, 14));
        
        ssLabel.setText(ssSlider.getValue() + " Units Long");
		ssLabel.setOpaque(true);
		ssLabel.setBackground(Color.black);
		ssLabel.setForeground(Color.green);
		ssLabel.setFont(new Font("MV Boli", Font.PLAIN, 14));
		ssLabel.setBorder(new LineBorder(Color.green, 1));

        //ssSlider.addChangeListener(this);
        
        ssButton.setBounds(65, 100, 100, 25);
        ssFrame.add(ssButton);

        ssButton.addActionListener(e-> setValue(ssSlider.getValue()));
        ssButton.setText("SET");
        ssButton.setFocusable(false);
		ssButton.addActionListener(this);
		ssButton.setFocusable(false);
		ssButton.setBorder(new LineBorder(Color.green, 1));
		ssButton.setFont(new Font("MV Boli", Font.BOLD, 14));

        
        ssPanel.add(ssSlider);  
        ssPanel.add(ssLabel);
		ssPanel.setFocusable(false);
		ssPanel.setOpaque(true);
		ssPanel.setBackground(Color.black);
		ssPanel.setForeground(Color.green);
		ssPanel.setBorder(new LineBorder(Color.green, 1));
		ssPanel.setFont(new Font("MV Boli", Font.BOLD, 14));
        ssFrame.add(ssPanel);

        ssFrame.setSize(240,250);
		
        ssFrame.setVisible(false);
		ssFrame.setFocusable(false);
		ssFrame.setBackground(Color.black);
		ssFrame.setForeground(Color.green);
		ssFrame.setFont(new Font("MV Boli", Font.BOLD, 14));
        ssFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		frame.setTitle("Battle Space Ship");
		frame.getContentPane().setBackground( Color.decode("#000000") );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.getRootPane().setBorder(border);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(300,250);
		frame.add(mainMenu);
		frame.add(Play);
		frame.add(Instructions);
		frame.add(Instructions1);
		frame.add(Instructions2);
		frame.add(Instructions3);
		frame.add(Instructions4);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==instructions) {
			mainMenu.setVisible(false);
			Instructions.setVisible(true);
			frame.setSize(300,250);
		}
		else if(e.getSource()==instructions1) {
			mainMenu.setVisible(true);
			Instructions.setVisible(false);
			frame.setSize(300, 250);
		}
		else if(e.getSource()==play) {
			mainMenu.setVisible(false);
			Play.setVisible(true);
			frame.setSize(350,300);
		}
		else if(e.getSource()==play1) {
			mainMenu.setVisible(true);
			Play.setVisible(false);
			frame.setSize(300, 250);
		}
		else if(e.getSource()==ssMenuButton) {
			ssFrame.setVisible(true);
			ssPanel.setVisible(true);
			mainMenu.setVisible(false);
			Play.setVisible(false);

			// make sure to correct
			frame.setVisible(false);
		}
		else if(e.getSource() == ssButton){
			ssFrame.setVisible(false);
			ssPanel.setVisible(false);
			frame.setVisible(true);
			Play.setVisible(true);
			frame.setSize(350,300);

		}
		else if(e.getSource()==next1) {
			Instructions1.setVisible(true);
			Instructions.setVisible(false);
			frame.setSize(300,300);
		}
		else if(e.getSource()==instructions2) {
			mainMenu.setVisible(true);
			Instructions1.setVisible(false);
			frame.setSize(300, 250);
		}
		else if(e.getSource()==next2) {
			Instructions2.setVisible(true);
			Instructions1.setVisible(false);
			frame.setSize(300,300);
		}
		else if(e.getSource()==instructions3) {
			mainMenu.setVisible(true);
			Instructions2.setVisible(false);
			frame.setSize(300, 250);
		}
		else if(e.getSource()==next3) {
			Instructions3.setVisible(true);
			Instructions2.setVisible(false);
			frame.setSize(300,300);
		}
		else if(e.getSource()==instructions4) {
			mainMenu.setVisible(true);
			Instructions3.setVisible(false);
			frame.setSize(300, 250);
		}
		else if(e.getSource()==next4) {
			Instructions4.setVisible(true);
			Instructions3.setVisible(false);
			frame.setSize(300,250);
		}
		else if(e.getSource()==instructions5) {
			mainMenu.setVisible(true);
			Instructions4.setVisible(false);
			frame.setSize(300, 250);
		}
	}

	
    @Override
    public void stateChanged(ChangeEvent e){
        ssLabel.setText(ssSlider.getValue() + " Units Long");
        setValue(ssSlider.getValue());
    }

    private void setValue(int x){
        this.ssSize = x;
    }

    public int getValue(){
        return this.ssSize;
    }
}

//The pull request I created for this file in Jira disappeared for some reason, so I am making a new one with this test comment
//here is the original pull request: https://bitbucket.org/cs-3398-su22-gorns/battlespaceship/pull-requests/16

package main;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class main extends JFrame implements ActionListener {

	private JFrame frame;
	private JPanel mainMenu;
	private JPanel Play;
	private JPanel Instructions;
	private JPanel Instructions1;
	private JPanel Instructions2;
	private JPanel Instructions3;
	private JPanel Instructions4;
	private JPanel Stats;
	private JPanel Settings;
	private JLabel welcome;
	private JLabel sprint1;
	private JLabel sprint2;
	private JLabel sprint3;
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
	private JButton play;
	private JButton play1;
	private JButton instructions;
	private JButton instructions1;
	private JButton instructions2;
	private JButton instructions3;
	private JButton instructions4;
	private JButton instructions5;
	private JButton stats;
	private JButton stats1;
	private JButton settings;
	private JButton settings1;
	private JButton next1;
	private JButton next2;
	private JButton next3;
	private JButton next4;

	public main() {
		frame = new JFrame();
		mainMenu = new JPanel();
		Play = new JPanel();
		Instructions = new JPanel();
		Instructions1 = new JPanel();
		Instructions2 = new JPanel();
		Instructions3 = new JPanel();
		Instructions4 = new JPanel();
		Stats = new JPanel();
		Settings = new JPanel();
		
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
		
		sprint1 = new JLabel("Feature will be implemented in Sprint 2");
		sprint1.setOpaque(true);
		sprint1.setFont(new Font("MV Boli", Font.PLAIN, 14));
		sprint1.setForeground(Color.green);
		sprint1.setBackground(Color.black);
		
		sprint2 = new JLabel("Feature will be implemented in Sprint 2");
		sprint2.setOpaque(true);
		sprint2.setFont(new Font("MV Boli", Font.PLAIN, 14));
		sprint2.setForeground(Color.green);
		sprint2.setBackground(Color.black);
		
		sprint3 = new JLabel("Feature will be implemented in Sprint 2");
		sprint3.setOpaque(true);
		sprint3.setFont(new Font("MV Boli", Font.PLAIN, 14));
		sprint3.setForeground(Color.green);
		sprint3.setBackground(Color.black);
		
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
		
		stats = new JButton("Statistics");
		stats.addActionListener(this);
		stats.setFocusable(false);
		stats.setBorder(new LineBorder(Color.green, 1));
		stats.setFont(new Font("MV Boli", Font.BOLD, 14));
	
		stats1 = new JButton("Return to Main Menu");
		stats1.addActionListener(this);
		stats1.setFocusable(false);
		stats1.setBorder(new LineBorder(Color.green, 1));
		stats1.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		settings = new JButton("Settings");
		settings.addActionListener(this);
		settings.setFocusable(false);
		settings.setBorder(new LineBorder(Color.green, 1));
		settings.setFont(new Font("MV Boli", Font.BOLD, 14));
		
		settings1 = new JButton("Return to Main Menu");
		settings1.addActionListener(this);
		settings1.setFocusable(false);
		settings1.setBorder(new LineBorder(Color.green, 1));
		settings1.setFont(new Font("MV Boli", Font.BOLD, 14));
		
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
		
		
		mainMenu.add(welcome);
		mainMenu.add(play);
		mainMenu.add(instructions);
		mainMenu.add(stats);
		mainMenu.add(settings);
		mainMenu.setBounds(0, 0, 300, 300);
	    mainMenu.setBackground(Color.black);
	    mainMenu.setLayout(new GridLayout(0, 1, 20, 20));
	    
	    Play.add(sprint1);
	    Play.add(play1);
		Play.setBounds(0, 0, 300,500);
	    Play.setBackground(Color.black);
	    Play.setLayout(new GridLayout(0, 1, 20, 20));
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
	    
	    Stats.add(sprint2);
	    Stats.add(stats1);
		Stats.setBounds(0, 0, 300,500);
	    Stats.setBackground(Color.black);
	    Stats.setLayout(new GridLayout(0, 1, 20, 20));
	    Stats.setVisible(false);
	    
	    Settings.add(sprint3);
	    Settings.add(settings1);
		Settings.setBounds(0, 0, 300,500);
	    Settings.setBackground(Color.black);
	    Settings.setLayout(new GridLayout(0,1, 20, 20));
	    Settings.setVisible(false);
	    
		
		frame.setTitle("Battle Space Ship");
		frame.getContentPane().setBackground( Color.decode("#000000") );
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.getRootPane().setBorder(border);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(300,300);
		frame.add(mainMenu);
		frame.add(Play);
		frame.add(Instructions);
		frame.add(Stats);
		frame.add(Settings);
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
			frame.setSize(300, 300);
		}
		else if(e.getSource()==play) {
			mainMenu.setVisible(false);
			Play.setVisible(true);
			frame.setSize(350,150);
		}
		else if(e.getSource()==play1) {
			mainMenu.setVisible(true);
			Play.setVisible(false);
			frame.setSize(300, 300);
		}
		else if(e.getSource()==stats) {
			mainMenu.setVisible(false);
			Play.setVisible(true);
			frame.setSize(350,150);
		}
		else if(e.getSource()==stats1) {
			mainMenu.setVisible(true);
			Play.setVisible(false);
			frame.setSize(300, 300);
		}
		else if(e.getSource()==settings) {
			mainMenu.setVisible(false);
			Play.setVisible(true);
			frame.setSize(350,150);
		}
		else if(e.getSource()==settings1) {
			mainMenu.setVisible(true);
			Play.setVisible(false);
			frame.setSize(300, 300);
		}
		else if(e.getSource()==next1) {
			Instructions1.setVisible(true);
			Instructions.setVisible(false);
			frame.setSize(300,300);
		}
		else if(e.getSource()==instructions2) {
			mainMenu.setVisible(true);
			Instructions1.setVisible(false);
			frame.setSize(300, 300);
		}
		else if(e.getSource()==next2) {
			Instructions2.setVisible(true);
			Instructions1.setVisible(false);
			frame.setSize(300,300);
		}
		else if(e.getSource()==instructions3) {
			mainMenu.setVisible(true);
			Instructions2.setVisible(false);
			frame.setSize(300, 300);
		}
		else if(e.getSource()==next3) {
			Instructions3.setVisible(true);
			Instructions2.setVisible(false);
			frame.setSize(300,300);
		}
		else if(e.getSource()==instructions4) {
			mainMenu.setVisible(true);
			Instructions3.setVisible(false);
			frame.setSize(300, 300);
		}
		else if(e.getSource()==next4) {
			Instructions4.setVisible(true);
			Instructions3.setVisible(false);
			frame.setSize(300,250);
		}
		else if(e.getSource()==instructions5) {
			mainMenu.setVisible(true);
			Instructions4.setVisible(false);
			frame.setSize(300, 300);
		}
	}
	
	public static void main(String args[]) throws Exception
	{
		new main();
	}

}


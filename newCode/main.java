package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class main extends JFrame implements ActionListener {

	private JFrame frame;
	private JPanel mainMenu;
	private JPanel Play;
	private JPanel Instructions;
	private JPanel Stats;
	private JPanel Settings;
	private JLabel welcome;
	private JLabel tomorrow;
	private JLabel sprint1;
	private JLabel sprint2;
	private JLabel sprint3;
	private JButton play;
	private JButton play1;
	private JButton instructions;
	private JButton instructions1;
	private JButton stats;
	private JButton stats1;
	private JButton settings;
	private JButton settings1;

	public main() {
		frame = new JFrame();
		mainMenu = new JPanel();
		Play = new JPanel();
		Instructions = new JPanel();
		Stats = new JPanel();
		Settings = new JPanel();
		
		Border border = BorderFactory.createLineBorder(Color.green, 3);
		welcome = new JLabel("Welcome to Battle Space Ship!");
		welcome.setOpaque(true);
		welcome.setBackground(Color.black);
		welcome.setForeground(Color.green);
		welcome.setFont(new Font("MV Boli", Font.PLAIN, 14));
		welcome.setBorder(new LineBorder(Color.green, 1));
		tomorrow = new JLabel("Instructions will be implemented tomorrow, stay tuned.");
		tomorrow.setOpaque(true);
		tomorrow.setFont(new Font("MV Boli", Font.PLAIN, 14));
		tomorrow.setForeground(Color.green);
		tomorrow.setBackground(Color.black);
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
	    
	    
	    Instructions.add(tomorrow);
	    Instructions.add(instructions1);
		Instructions.setBounds(0, 0, 100,500);
	    Instructions.setBackground(Color.black);
	    Instructions.setLayout(new GridLayout(0, 1, 20, 20));
	    Instructions.setVisible(false);
	    
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
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==instructions) {
			mainMenu.setVisible(false);
			Instructions.setVisible(true);
			frame.setSize(450,150);

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
	}
	
	public static void main(String args[]) throws Exception
	{
		new main();
	}

}


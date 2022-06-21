import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FilenameFilter;
import java.swing.JTextField;


public class GridSizeSelect 
{
	public static void main(String[] args) 
	{
        JFrame gridSizeSelect = new JFrame();
        gridSizeSelect.setTitle("Select Grid Size");

        JButton option1 = new JButton("10x10");
        option1.addActionListener(new
            ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    gridSizeSelect.setVisible(false);
                    int gridSizeSelected=10;//This will set the graph size to 10
                    //Add connection to BattleGrid.java
                }
            });
            option1.setBounds(180, 30, 140, 80);

        JButton option2 = new JButton("15x15");
        option2.addActionListener(new
            ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    gridSizeSelect.setVisible(false);
                    int gridSizeSelected=15;//This will set the graph size to 15
                    //Add connection to BattleGrid.java
                }
            });
            option2.setBounds(180, 120, 140, 80);

        JButton option3 = new JButton("20x20");
        option3.addActionListener(new
            ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    gridSizeSelect.setVisible(false);
                    int gridSizeSelected=20;//This will set the graph size to 20
                    //Add connection to BattleGrid.java
                }
            });
            option3.setBounds(180, 210, 140, 80);

        gridSizeSelect.add(option1);
        gridSizeSelect.add(option2);
        gridSizeSelect.add(option3);

        
        gridSizeSelect.getContentPane().setBackground(Color.GREEN);
        gridSizeSelect.setLayout(null);
        gridSizeSelect.setVisible(true);
        gridSizeSelect.setSize(500,350); 
        gridSizeSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridSizeSelect.setResizable(true);
    }
}

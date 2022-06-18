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
                }
            });
            option1.setBounds(180, 30, 140, 80);

        JButton option2 = new JButton("8x8");
        option2.addActionListener(new
            ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    gridSizeSelect.setVisible(false);
                }
            });
            option2.setBounds(180, 120, 140, 80);

        JButton option3 = new JButton("5x5");
        option3.addActionListener(new
            ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    gridSizeSelect.setVisible(false);
                }
            });
            option3.setBounds(180, 210, 140, 80);

        gridSizeSelect.add(option1);
        gridSizeSelect.add(option2);
        gridSizeSelect.add(option3);

        gridSizeSelect.setLayout(null);
        gridSizeSelect.setVisible(true);
        gridSizeSelect.setSize(500,350); 
        gridSizeSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gridSizeSelect.setResizable(true);
    }
}

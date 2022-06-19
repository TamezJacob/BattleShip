import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ShipSlider implements ChangeListener{ 

    int value;
    JFrame frame;
    JSlider slider;
    JLabel label;
    JPanel panel;
    JButton button;

    ShipSlider() { 
        frame = new JFrame();
        label = new JLabel();
        button = new JButton();

        slider = new JSlider(JSlider.HORIZONTAL, 1, 10, 3);  
        slider.setMinorTickSpacing(1);  
        slider.setMajorTickSpacing(2);  
        slider.setPaintTicks(true);  
        slider.setPaintLabels(true);
        
        label.setText(slider.getValue() + " Units Long");

        slider.addChangeListener(this);
        
        button.setBounds(65, 72, 100, 25);
        frame.add(button);

        button.addActionListener(e-> setValue(slider.getValue()));
        button.setText("SET");
        button.setFocusable(false);

        panel=new JPanel();  
        panel.add(slider);  
        panel.add(label);
        frame.add(panel);
        frame.setSize(240,150);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e){
        label.setText(slider.getValue() + " Units Long");
        setValue(slider.getValue());
    }

    private void setValue(int x){
        this.value = x;
    }

    public int getValue(){
        return this.value;
    }

}  
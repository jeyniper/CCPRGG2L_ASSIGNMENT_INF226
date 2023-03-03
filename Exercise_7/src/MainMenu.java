import java.awt.Color;
import java.awt.Font;
import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JFrame{
    
    MainMenu(){

        JLabel imageLabel = new JLabel();
        ImageIcon snakeImage = new ImageIcon("snakegamegif.gif");
        imageLabel.setIcon(snakeImage);
        this.add(imageLabel);

        JButton button = new JButton();
        button.setText("Start Game");
        button.setFont(new Font("Arial", Font.BOLD, 20));

        EventHandler handler = new EventHandler();
        button.addActionListener((ActionListener) handler);
        this.add(button);
        
        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1200,850);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.MAGENTA);
        this.setResizable(false);
    }

private class EventHandler implements ActionListener{

    public void actionPerformed(ActionEvent event) {

        //goes to game frame
        new ColorMenu();

        dispose();
    
}
}
}


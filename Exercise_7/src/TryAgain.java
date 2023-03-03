import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TryAgain extends JFrame{
    TryAgain() {

        JLabel imageLabel = new JLabel();
        ImageIcon kweenImage = new ImageIcon("kween.jpg");
        imageLabel.setIcon(kweenImage);
        this.add(imageLabel);

        JLabel label = new JLabel();
        label.setText("GAME OVER"); 
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);


        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        

        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler); 
        this.add(tryAgainButton);
    
        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler1 handler1= new EventHandler1();
        exitButton.addActionListener(handler1);
    
        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(250,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        this.getContentPane().setBackground(Color.MAGENTA);
        this.setResizable(false);

    
    }
    private class EventHandler implements ActionListener {
        
        public void actionPerformed(ActionEvent event) {
             
            new GameFrame();

            dispose();


}
    }
    private class EventHandler1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }
    }



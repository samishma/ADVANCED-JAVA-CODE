/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).*/

package swings;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ClockButtonExample {

    JLabel l1;

    ClockButtonExample() {

        JFrame f = new JFrame("Clock Button Example");

        // Label
        l1 = new JLabel();
        l1.setBounds(50, 50, 700, 100);
        l1.setFont(new Font("Lucida Calligraphy", Font.BOLD, 40));

        // Load and scale images
        ImageIcon clockIcon = new ImageIcon(getClass().getResource("/images/digitalclock.jpg"));
        Image img1 = clockIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        clockIcon = new ImageIcon(img1);

        ImageIcon hourGlassIcon = new ImageIcon(getClass().getResource("/images/hourglass.jpg"));
        Image img2 = hourGlassIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        hourGlassIcon = new ImageIcon(img2);

        // Buttons with images
        JButton b1 = new JButton("Digital Clock", clockIcon);
        JButton b2 = new JButton("Hour Glass", hourGlassIcon);

        b1.setBounds(50, 200, 200, 120);
        b2.setBounds(300, 200, 200, 120);

        // Align text properly
        b1.setHorizontalTextPosition(JButton.CENTER);
        b1.setVerticalTextPosition(JButton.BOTTOM);

        b2.setHorizontalTextPosition(JButton.CENTER);
        b2.setVerticalTextPosition(JButton.BOTTOM);

        // Event handling
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Digital Clock is pressed");
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Hour Glass is pressed");
            }
        });

        // Add components
        f.add(b1);
        f.add(b2);
        f.add(l1);

        f.setSize(600, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new ClockButtonExample();
    }
}
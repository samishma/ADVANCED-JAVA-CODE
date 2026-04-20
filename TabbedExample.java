/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and display the concerned color whenever the specific tab is selected in the Pan*/

package swings;

import java.awt.Color;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedExample {

    JFrame f;

    TabbedExample() {

        f = new JFrame();

        // Panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        // Set required colors
        p1.setBackground(Color.CYAN);
        p2.setBackground(Color.MAGENTA);
        p3.setBackground(Color.YELLOW);

        // Tabbed Pane
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50, 50, 300, 300);

        tp.add("CYAN", p1);
        tp.add("MAGENTA", p2);
        tp.add("YELLOW", p3);

        // Event to detect tab change
        tp.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tp.getSelectedIndex();
                String color = tp.getTitleAt(index);
                System.out.println("Selected Color: " + color);
            }
        });

        f.add(tp);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new TabbedExample();
    }
}
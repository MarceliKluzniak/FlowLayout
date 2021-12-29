package pl.mkluzniak;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Layout Manager = defines the natural layout for components within a container

        // FlowLayout = places components in row, sized at their preferred size.
        //              if the horizontal space in the container is too small,
        //              the FlowLayout class uses the next available row.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //method is used to specify one of several options for the close button
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));//set gap between buttons and layout place for buttons


        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));//dimension for panel
        panel.setBackground(Color.LIGHT_GRAY);//setting background color for panel
        panel.setLayout(new FlowLayout());//

        panel.add(new JButton("1"));// adding buttons
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("10"));

        frame.add(panel); //adding all components to panel

        frame.setVisible(true);


    }
}

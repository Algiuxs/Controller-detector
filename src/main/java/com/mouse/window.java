package com.mouse;

import javax.swing.JFrame;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class window {
    JFrame frame;
    controller con;

    public void createWindow() {
        controller con = new controller();
        JFrame frame = new JFrame();
        frame.setSize(1200, 700);
        frame.setLayout(null);
        frame.setTitle("Moouse");
        frame.setBounds(0, 0, 1200, 700);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new Keyboard());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                con.quitSDLGamepad();
            }
        });
    }



    public JFrame getFrame() {
        return frame;
    }
}

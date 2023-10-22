package com.mouse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements ActionListener, KeyListener {
  int key;


  Keyboard() {
  }

  public void keyPressed(KeyEvent e) {

    int key = e.getKeyCode();

    System.out.print(e.getKeyChar()); 
    if (key == KeyEvent.VK_ESCAPE) {
      System.exit(1);
    }
  }


  @Override
  public void actionPerformed(ActionEvent e) {

  }

  @Override
  public void keyTyped(KeyEvent e) {

  }

  @Override
  public void keyReleased(KeyEvent e) {
    
  }
  public int lastKeyPressed(){
    return key;
  }
}
package com.mouse;

public class Main {
    public static void main(String[] args) {
        window win = new window();
        Keyboard k = new Keyboard();
        Mouse mg = new Mouse();
        controller con = new controller();

        win.createWindow();
        con.tick();
        mg.GlideMouse(100, 100, 20, 20);
        while (true) {
            
        }
    }
}

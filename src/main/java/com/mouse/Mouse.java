package com.mouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Point;
import java.awt.MouseInfo;

public class Mouse {
    Point p;
    int x, y;

    Mouse() {
        p = MouseInfo.getPointerInfo().getLocation();
    }

    public void GlideMouse(int finalX, int finalY, int t, int n) {
        UpdateMousePos();
        try {
            Robot r = new Robot();
            double dx = (finalX - x) / ((double) n);
            double dy = (finalY - y) / ((double) n);
            double dt = t / ((double) n);
            for (int step = 1; step <= n; step++) {
                Thread.sleep((int) dt);
                r.mouseMove((int) (x + dx * step), (int) (y + dy * step));
                UpdateMousePos();
            }
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int GetMouseX() {
        x = p.x;
        return x;
    }

    public int GetMouseY() {
        y = p.y;
        return y;
    }

    public void UpdateMousePos() {
        x = p.x;
        y = p.y;
    }
}

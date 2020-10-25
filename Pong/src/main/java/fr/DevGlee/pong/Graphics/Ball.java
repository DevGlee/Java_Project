/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.pong.Graphics;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DevGlee
 */
public class Ball implements Drawable {

    private final int initialX;
    private final int initialY;
    
private Color color =Color.WHITE;

    public int x;
    public int y;
    
    public Ball(int x, int y) {
        initialX = x;
        initialY = y;
    }

    public void resetPosition() {
        x = initialX;
        y = initialY;
    }

    public void setColor(Color color) {
this.color=color;
    }

    public void draw(Graphics gc) {

    }

}

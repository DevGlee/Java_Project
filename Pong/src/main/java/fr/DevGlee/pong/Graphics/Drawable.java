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
public interface Drawable {
    void resetPosition();
    void setColor(Color color);
    void draw(Graphics gc);
}

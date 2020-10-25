/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.pong.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author DevGlee
 */
public class KeyInput implements KeyListener {

    public boolean up, down,boost,esc;

    public void keyPressed(KeyEvent e) {
       if (e.getKeyCode() == KeyEvent.VK_UP) up = true;
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) down = true;
		else if (e.getKeyCode() == KeyEvent.VK_SPACE) boost = true;
		else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) esc = true;
    }

    public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) up = false;
		else if (e.getKeyCode() == KeyEvent.VK_DOWN) down = false;
		else if (e.getKeyCode() == KeyEvent.VK_SPACE) boost = false;
		else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) esc = false;
    }

    public void keyTyped(KeyEvent e) {

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.pong.Graphics;

/**
 *
 * @author DevGlee
 */
import java.awt.Color;
import java.awt.Graphics;

public class GameContent {

    public Platform player;
    public Platform ai;
    public Ball ball;

    public GameContent() {

        player = new Platform(5, 225);
        ai = new Platform(480, 225);
        ball = new Ball(250, 250);
        resetPosition();

    }

    public void resetPosition() {
        player.resetPosition();
        ai.resetPosition();
        ball.resetPosition();
    }

    public void display(Graphics gc) {
        player.draw(gc);
        ai.draw(gc);
        ball.draw(gc);
    }

    public void clear(Graphics gc) {
        gc.setColor(Color.BLACK);
        gc.fillRect(0, 0, 500, 500);
        gc.setColor(Color.WHITE);
        gc.fillRect(0, 0, 500, 30);
    }

}

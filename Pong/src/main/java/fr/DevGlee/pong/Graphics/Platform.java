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
public class Platform implements Drawable {

   private final int	initialX;
	private final int	initialY;

	private Color color = Color.WHITE;

	public int	x;
	public int	y;

	public int	speed;
	public int	boost	= 1;

	public Platform(int x, int y, int speed) {
		this.speed = speed;
		initialX = x;
		initialY = y;
	}

	public void resetPosition() {
		x = initialX;
		y = initialY;
	}

	public void moveUp() {
		if (y > 35) y -= speed * boost;
	}

	public void moveDown() {
		if (y < 415) y += speed * boost;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void draw(Graphics gc) {
		gc.setColor(color);
		gc.fillRect(x, y, 10, 50);
	}
}

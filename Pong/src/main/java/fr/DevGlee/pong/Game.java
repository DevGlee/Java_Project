/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.pong;

import fr.DevGlee.pong.Graphics.Window;

/**
 *
 * @author DevGlee
 */
public class Game {
    
    private Window window;
    private Thread thread;
    
    public Game(){
        window = new Window("Pong",500,500);
    }
    public static void main( String[] args){
        Game game = new Game();
    }
}

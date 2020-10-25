/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.pong;

import fr.DevGlee.pong.Graphics.GameContent;
import fr.DevGlee.pong.Graphics.Window;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DevGlee
 */
public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;
    private Window window;
    private GameContent content;
    private Thread thread;

    private boolean shouldRun = false;
    
    
    public Game() {
        Dimension size = new Dimension(500,500);
        setPreferredSize(size);
        window = new Window("Pong", 500, 500);
        content= new GameContent();
        window.add(this);
    }


    public void start() {
        window.setVisible(true);
        shouldRun = true;
        thread = new Thread(this, "Display");
        thread.start();
    }

    public synchronized void stop()/*Pour arrêter le jeu*/ {
        shouldRun = false;
        try {
            thread.join();
            System.exit(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update()/*Logique du jeu*/ {

        //TODO
    }

    public void render()/*Focntions Graphique*/ {
            
        BufferStrategy buffer= getBufferStrategy();
        
        if(buffer==null){
            createBufferStrategy(3);
            return;
        }
        Graphics gc = buffer.getDrawGraphics();{
        
            content.clear(gc);
            content.display(gc);
    }
        gc.dispose();
        buffer.show();
    }

    public void run()/*Boucle du jeu*/ {
        while (shouldRun = true) {
            update();
            render();
        }
    }

    

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}

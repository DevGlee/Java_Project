/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.DevGlee.pong.Graphics;
import javax.swing.*;
/**
 *
 * @author DevGlee
 */
public class Window extends JFrame {
    
    private static final long serialVersionUID=1L;
    
    public Window(String title,int width,int height){
        setTitle(title);
        setSize(width,height);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
    }
    
}

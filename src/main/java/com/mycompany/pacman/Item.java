/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author bruno.gpinheiro
 */
public abstract class Item extends GameObject{
    
    private boolean visible;

    public Item(int x, int y) {
        super(x, y);
    }

    public Item() {
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    
}

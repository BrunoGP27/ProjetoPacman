/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author bruno.gpinheiro
 */
public abstract class GameObject {
    
    private int x;
    private int y;
    private int screenSize;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public GameObject() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
    
     
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author bruno.gpinheiro
 */
public class Player extends GameObject {
    
    private int direction;
    private int life;
    private boolean invencivel = false;
    
    public boolean podeSeMover(int x, int y, int size, int direcao){
        boolean movimento = true;
        /*if(x <= 0 || x > size || y <= 0 || y > size){
            movimento = false;
        }*/
        if (direcao == 270 && x < 10) movimento = false;
        if (direcao == 90 && x > size - 10) movimento = false;
        if (direcao == 0 && y < 10) movimento = false;
        if (direcao == 180 && y > size - 10) movimento = false;
        return movimento;
        
    }
    public void movimento(int x, int y, int direcao, int size){
        
        podeSeMover(x,y,size, direcao);       
        if(podeSeMover(x,y,size, direcao)== true){
            switch (direcao) {
                case 270:
                    x -= 10;
                    break;
                case 90:
                    x += 10;
                    break;
                case 0:
                    y -= 10;
                    break;
                case 180:
                    x += 10;
                    break;
                default:
                    throw new AssertionError();
            }
        }
  
    }

    public Player() {
    }

    public Player(int direcao, int x, int y) {
        super(x, y);
        this.direction = direcao;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }
    
    
    
    
}

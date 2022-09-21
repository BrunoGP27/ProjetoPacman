/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author bruno.gpinheiro
 */
public class Ghost extends GameObject{
    
    private int direction;
    //copiar o metodo movimenta e pode se mover
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
    public void movimentoAleatorio(int x, int y, int size){
        int max = 4;
        int min = 1;       
        int range = max - min + 1;
        int direcao = (int)(Math.random() * range) + min;

        podeSeMover(x,y,size, direcao);       
        if(podeSeMover(x,y,size, direcao)== true){
            switch (direcao) {
                case 1:
                    x -= 10;
                    break;
                case 2:
                    x += 10;
                    break;
                case 3:
                    y -= 10;
                    break;
                case 4:
                    x += 10;
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public Ghost() {
    }

    public Ghost(int direction, int x, int y) {
        super(x, y);
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    
}

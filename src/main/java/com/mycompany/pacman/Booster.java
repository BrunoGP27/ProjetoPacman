/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pacman;

/**
 *
 * @author bruno.gpinheiro
 */
public class Booster extends Item {
    
    private int duracao;
    

    public Booster(int duracao, int x, int y) {
        super(x, y);
        this.duracao = duracao;
    }

    public Booster() {
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    
    
}

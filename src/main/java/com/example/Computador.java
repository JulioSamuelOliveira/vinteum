package com.example;

public class Computador extends Jogador {

    @Override //Sobrecarga do método parou para padronizar a ação do computador
    public boolean parou() {
        return this.getPontos() > 16;      
    }    
    
}
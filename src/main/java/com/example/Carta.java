package com.example;

public class Carta {
    private int numero;
    private Naipe naipe;

    //construtores    
    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    //método de trabalho para o path das imagens
    public String imagePath(){
        return "classic-cards/" + numero + naipe + ".png";
    }

    //getters | não há setters pois o valor da carta n pode ser alterado
    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    
}
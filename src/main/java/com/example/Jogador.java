package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    //Métodos
    private int pontos = 0;
    private List<Carta> cartas = new ArrayList<>();
    private boolean parou = false;
    
    public void receberCarta(Carta carta){
        cartas.add(carta);
        pontos += pontos + carta.getNumero();
    }

    public void parar(){
        parou = true;

    }
    //Getters
    public int getPontos() {
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public boolean parou() { //retirar is para melhorar a leitura
        return parou;
    }
    
}

package controller;

import interfaces.ReprodutorInterface;

public class Reprodutor implements ReprodutorInterface{

    public String status ="";
    public String musicaAtual ="";

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public String setStatus(String st) {
        this.status=st  ; 
        return status; 
    }

    @Override
    public String tocar() {
        setStatus("Tocando a música: "+ musicaAtual);
        return "Tocando a música: " + musicaAtual;    
    }

    @Override
    public String pausar() {
        setStatus("Pausando a música");
        return "Tocando a música"; 
    }

    @Override
    public String selecionarMusica(String st) {
        musicaAtual = st;
        setStatus("Selecionando a música: "+musicaAtual);
        return "Selecionando a música: "+musicaAtual; 
    }
    
}

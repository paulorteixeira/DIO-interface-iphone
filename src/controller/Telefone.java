package controller;

import interfaces.TelefoneInterface;

public class Telefone implements TelefoneInterface{
    public String status ="";
    
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
    public String ligar() {
        setStatus("Realizando Ligação");
        return "Realizando Ligação";
  }

    @Override
    public String atender() {
        setStatus("Atendendo Ligação");
        return "Atendendo Ligação";    
    }

    @Override
    public String iniciarCorreioVoz() {
         setStatus("Iniciando Correio de voz");
        return "Iniciando Correio de voz"; 
           }
    
}

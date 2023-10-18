package controller;

public class Dispositivo {
    public Navegador navegador;
    public Reprodutor reprodutor;
    public Telefone telefone;

    public Dispositivo(){
        this.navegador =new Navegador();
        this.reprodutor = new Reprodutor();
        this.telefone = new Telefone();
    }
}

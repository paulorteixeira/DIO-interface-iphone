package controller;

import interfaces.NavegadorInterface;

public class Navegador implements  NavegadorInterface{
    public String status ="";
    public String siteAtual ="";

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
    public String exibirPagina(String st) {
        setStatus("Exibindo a página: " + st);
        return "Exibindo a página" + st;
    }

    @Override
    public String adicionarNovaAba() {
        setStatus("Nova Aba Adicionada" );
        return "Nova Aba Adicionada";
    }

    @Override
    public String atualizarPagina() {
        setStatus("Atualizando pagina" );
        return "Nova Aba Adicionada";   
    }

}

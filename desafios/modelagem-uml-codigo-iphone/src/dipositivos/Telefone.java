package dipositivos;

import funcionalidades.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {

    @Override
    public void abrirDiscador() {
        System.out.println("Abrindo discador no telefone");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação via telefone");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada pelo telefone");
    }

    @Override
    public void desligarChamada() {
        System.out.println("Encerrando chamada pelo telefone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz no telefone");
    }
    
}

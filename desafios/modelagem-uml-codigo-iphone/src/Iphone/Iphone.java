package Iphone;
import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical {


    public Iphone() {
        System.out.println("Tela inicial do Iphone");
    } 

    public void homeButton() {
        System.out.println("Voltando para home");
    }

    @Override
    public void abrirReprodutor() {
        System.out.println("Abrindo reprodutor de música no Iphone");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música via Iphone");
    }

    @Override
    public void pausarMusica() {
       System.out.println("Pausando música no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Iphone");
    }

    @Override
    public void abrirDiscador() {
        System.out.println("Abrindo discador no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo ligação via Iphone");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada pelo Iphone");
    }

    @Override
    public void desligarChamada() {
       System.out.println("Encerrando chamada pelo Iphone");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador no Iphone");
    }
    
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador pelo Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador pelo Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador pelo Iphone");
    }

 
}

import Iphone.Iphone;
import dipositivos.Ipod;
import dipositivos.Safari;
import dipositivos.Telefone;

public class Usuario {
    
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        // ------------------------------------------------------------------------------------------
        // Também podem ser feito testes dos métodos de cada interface com as classes abaixo.

        // Telefone telefone = new Telefone();
        // Ipod ipod = new Ipod();
        // Safari safari = new Safari();
        // ------------------------------------------------------------------------------------------


        iphone.abrirDiscador();
        iphone.ligar();
        iphone.desligarChamada();

        System.out.print("\n");

        iphone.homeButton();

        System.out.print("\n");

        iphone.abrirNavegador();
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.print("\n");

        iphone.homeButton();
        
        System.out.print("\n");

        iphone.abrirReprodutor();
        iphone.selecionarMusica();
        iphone.tocarMusica();
        iphone.pausarMusica();
        

        
    }
}

package dipositivos;

import funcionalidades.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    @Override
    public void abrirReprodutor() {
        System.out.println("Abrindo reprodutor de música no Ipod");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música via Ipod");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no Ipod");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música no Ipod");
    }
    
}

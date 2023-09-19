package dipositivos;

import funcionalidades.NavegadorInternet;

public class Safari implements NavegadorInternet {

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionar nova aba no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador");
    }
    
}

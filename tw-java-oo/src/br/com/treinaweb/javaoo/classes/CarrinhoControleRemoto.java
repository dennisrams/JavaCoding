package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import br.com.treinaweb.javaoo.excecoes.VelocidadeVeiculoZeroException;
import br.com.treinaweb.javaoo.interfaces.Andador;
import br.com.treinaweb.javaoo.interfaces.Ligador;

public class CarrinhoControleRemoto implements Andador, Ligador{

    @Override
    public void ligar() {
        
    }

    @Override
    public void desligar() {
        
    }

    @Override
    public void acelerar() throws AceleracaoVeiculoLigadoException {
        
    }

    @Override
    public void frear() throws FrenagemVeiculoDesligadoException, VelocidadeVeiculoZeroException {
        
    }

}

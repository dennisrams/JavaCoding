package br.com.treinaweb.javaoo.interfaces;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import br.com.treinaweb.javaoo.excecoes.VelocidadeVeiculoZeroException;

public interface Andador {
    void acelerar() throws AceleracaoVeiculoLigadoException;
    void frear() throws FrenagemVeiculoDesligadoException, VelocidadeVeiculoZeroException;
}
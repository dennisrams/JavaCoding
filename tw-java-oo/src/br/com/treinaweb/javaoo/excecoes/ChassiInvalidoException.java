package br.com.treinaweb.javaoo.excecoes;

public class ChassiInvalidoException extends Exception{
    
private static final long serialVerionUID = 8046906767502979484L;

    public ChassiInvalidoException(final String chassi){
        super(String.format("este chassi é inválido: %s", chassi));
    }
}
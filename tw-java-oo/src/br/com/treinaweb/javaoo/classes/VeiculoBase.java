package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import br.com.treinaweb.javaoo.excecoes.VelocidadeVeiculoZeroException;
import br.com.treinaweb.javaoo.interfaces.Andador;
import br.com.treinaweb.javaoo.interfaces.Ligador;
import br.com.treinaweb.javaoo.interfaces.Veiculo;

public abstract class VeiculoBase implements Veiculo, Ligador, Andador{
    private String nome;
    private String marca;
    private String chassi;
    protected int quantidadeRodas;
    private float quantidadeCombustivel;
    private Boolean ligado;
    protected float velocidade;

    public VeiculoBase(){
        this.ligado = false;
        this.velocidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) throws ChassiInvalidoException{
        if (chassi.length() == 5) {
            this.chassi = chassi;
        } else
            throw new ChassiInvalidoException(chassi);
    }

    public int getQuantidadeRodas() {
        return quantidadeRodas;
    }

    public float getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public Boolean isLigado(){
        return ligado;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void ligar() {
        this.ligado = true;
        this.velocidade = 0;
        System.out.printf("O veículo '%s' acabou de ligar...\n", getNome());
    }
    
    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        System.out.printf("O veículo '%s' desligou.\n", getNome());
    }

    public final void abastecer(float litros) throws AbastecimentoVeiculoLigadoException{
        if(!this.ligado) quantidadeCombustivel += litros;
        else throw new AbastecimentoVeiculoLigadoException();
    }

    public void acelerar() throws AceleracaoVeiculoLigadoException{
        if(this.ligado) this.velocidade +=10;
        else throw new AceleracaoVeiculoLigadoException();
    }

    public void frear() throws FrenagemVeiculoDesligadoException,VelocidadeVeiculoZeroException{
        if(this.ligado) this.velocidade -=10;
        else if(this.velocidade == 0) throw new VelocidadeVeiculoZeroException();
        else throw new FrenagemVeiculoDesligadoException();
    }

    public abstract void preparar();
}

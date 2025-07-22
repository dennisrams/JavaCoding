package br.com.treinaweb.javaoo.classes;

public class Carro extends VeiculoBase{
    
    private int quantidadePortas;
    
    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public Carro(){
        this.quantidadeRodas = 4;
    }

    public Carro(String nome, String marca){
         this.quantidadeRodas = 4;
         this.setNome(nome);
         this.setMarca(marca);
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void preparar() {
        System.out.println("Colocar o cinto de segurança.");
    }

}



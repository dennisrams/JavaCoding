package br.com.treinaweb.javaoo.main;
import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.Moto;
import br.com.treinaweb.javaoo.classes.VeiculoBase;
import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;

public class Main {
    public static void main(String[] args) {

        try {

            VeiculoBase corsa = new Carro("Corsa", "GM");
            System.out.println(corsa.getQuantidadeRodas());
            corsa.setChassi("ABCDE");
            corsa.abastecer(10);
            System.out.println(corsa.getQuantidadeCombustivel());
            System.out.println(String.format("O veículo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));
            corsa.abastecer(10);
            corsa.preparar();
            corsa.ligar();
            //((Carro)corsa).setQuantidadePortas(4);
            corsa.acelerar();
            System.out.println(String.format("Velocidade atual: %f", corsa.getVelocidade()));
            corsa.frear();
            System.out.println(String.format("Velocidade atual: %f", corsa.getVelocidade()));
        } catch (AbastecimentoVeiculoLigadoException e) {
            System.out.println("Você não pode abastecer um veículo enquanto ele estiver ligado " + e.getMessage());
        } catch (ChassiInvalidoException e){
            System.out.println("Chassi inválido! " + e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}
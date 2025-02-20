import Fabrica.FabricaEletricos;
import Fabrica.FabricaVeiculo;
import Models.Veiculo;

public class Main {
    public static void main(String[] args) {
        FabricaVeiculo fabricaEletricos = new FabricaEletricos();
        Veiculo veiculo = null;
        String tipoVeiculo = "Carro";
        String marca  = "BMW";

        if (tipoVeiculo.equals("Carro")) {
            veiculo = fabricaEletricos.criarCarro(marca);
        }

        if (tipoVeiculo.equals("Moto")) {
            veiculo = fabricaEletricos.criarMoto(marca);
        }

        if (tipoVeiculo.equals("Navio")) {
            veiculo = fabricaEletricos.criarNavio(marca);
        }
        
        System.out.println(veiculo);
    }
}
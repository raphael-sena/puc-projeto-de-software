import Fabrica.FabricaVeiculo;
import Fabrica.FabricaEletricos;
import Fabrica.FabricaCombustao;
import Models.Veiculo;

public class Main {
    public static void main(String[] args) {
        String tipoFabrica = "Combustao";
        String tipoVeiculo = "Carro";
        String marca = "BMW";

        FabricaVeiculo fabricaVeiculos = null;

        if ("Eletricos".equalsIgnoreCase(tipoFabrica)) {
            fabricaVeiculos = new FabricaEletricos();
        } else if ("Combustao".equalsIgnoreCase(tipoFabrica)) {
            fabricaVeiculos = new FabricaCombustao();
        } else {
            System.out.println("Tipo de fábrica não suportada: " + tipoFabrica);
            return;
        }

        Veiculo veiculo = null;

        switch (tipoVeiculo) {
            case "Carro":
                veiculo = fabricaVeiculos.criarCarro(marca);
                break;
            case "Moto":
                veiculo = fabricaVeiculos.criarMoto(marca);
                break;
            case "Navio":
                veiculo = fabricaVeiculos.criarNavio(marca);
                break;
            default:
                System.out.println("Tipo de veículo não suportado: " + tipoVeiculo);
        }

        if (veiculo != null) {
            System.out.println("Veículo criado: " + veiculo);
        }
    }
}

import Fabrica.FabricaEletricos;
import Fabrica.FabricaVeiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FabricaVeiculo fabrica = new FabricaEletricos();
        String tipoVeiculo = "Carro";
        String marca  = "BMW";

        if (tipoVeiculo.equals("Carro")) {
            fabrica.criarCarro(marca);
        }

        if (tipoVeiculo.equals("Moto")) {
            fabrica.criarMoto(marca);
        }

        if (tipoVeiculo.equals("Navio")) {
            fabrica.criarNavio(marca);
        }

        System.out.println(fabrica);
    }
}
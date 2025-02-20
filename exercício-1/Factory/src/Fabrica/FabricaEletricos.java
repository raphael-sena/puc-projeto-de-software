package Fabrica;

import Models.Carro;
import Models.Moto;
import Models.Navio;

public class FabricaEletricos implements FabricaVeiculo{

    private String motor = "Eletrico";


    @Override
    public Moto criarMoto(String marca) {
        return new Moto(marca, motor);
    }

    @Override
    public Carro criarCarro(String marca) {
        return new Carro(marca, motor);
    }

    @Override
    public Navio criarNavio(String marca) {
        return new Navio(marca, motor);
    }
}

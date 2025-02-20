package Fabrica;

import Models.Carro;
import Models.Moto;
import Models.Navio;
import Models.Veiculo;

public interface FabricaVeiculo {

    Moto criarMoto(String marca);
    Carro criarCarro(String marca);
    Navio criarNavio(String marca);
}

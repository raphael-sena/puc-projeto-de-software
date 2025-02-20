package Models;

import java.time.Year;

public class Carro extends Veiculo {

    public Carro(String marca, String motor) {
        super(marca, "Carro", Year.now().getValue(), motor);
    }
}
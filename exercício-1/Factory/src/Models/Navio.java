package Models;

import java.time.Year;

public class Navio extends Veiculo{
    public Navio(String marca, String motor) {
        super(marca, "Navio", Year.now().getValue(), motor);
    }

}

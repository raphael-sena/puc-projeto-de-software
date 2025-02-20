package Models;

import java.time.Year;

public class Moto extends Veiculo{

    public Moto(String marca, String motor) {
        super(marca, "Moto", Year.now().getValue(), motor);
    }

}

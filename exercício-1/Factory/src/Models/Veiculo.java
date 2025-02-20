package Models;

public abstract class Veiculo {

    private String tipo;
    private String marca;
    private int ano;
    private String motor;

    public Veiculo(String marca, String tipo, int ano, String motor) {
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
        this.motor = motor;
    }
}

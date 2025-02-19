public abstract class Componente {
    protected String nome;
    protected double valor;

    public Componente() {
    }

    public Componente(String nome) {
        this.nome = nome;
    }

    public abstract void escreva();
    public abstract void add(Componente peca);
    public abstract void remove(Componente peca);
    public abstract Componente obterPecas(int pos);
    public abstract double calcularValorTotal();
}

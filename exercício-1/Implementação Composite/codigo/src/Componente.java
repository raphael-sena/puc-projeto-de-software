public abstract class Componente {
    protected String nome;
    protected double valorTotal;

    public Componente() {
    }

    public Componente(String nome, double valorTotal) {
        this.nome = nome;
        this.valorTotal = valorTotal;
    }

    public abstract void escreva();
    public abstract void add(Componente peca);
    public abstract void remove(Componente peca);
    public abstract Componente obterPecas(int pos);
}

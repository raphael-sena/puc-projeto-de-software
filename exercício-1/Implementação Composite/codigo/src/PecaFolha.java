public class PecaFolha extends Componente {

    protected Double valor;

    public PecaFolha() {
    }


    public PecaFolha(String nome, Double valor) {
        super(nome, valor);
        this.valor = valor;
    }

    @Override
    public void escreva() {

    }

    @Override
    public void add(Componente peca) {
    }

    @Override
    public void remove(Componente peca) {
    }

    @Override
    public Componente obterPecas(int pos) {
        return null;
    }
}

public class PecaFolha extends Componente {

    public PecaFolha() {
    }


    public PecaFolha(String nome, Double valor) {
        super(nome);
        this.valor = valor;
    }

    @Override
    public void escreva() {
        System.out.println("  --" + "Nome: " + nome + "; Valor: " + valor);
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

    @Override
    public double calcularValorTotal() {
        return valor;
    }
}

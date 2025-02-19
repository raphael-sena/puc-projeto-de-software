import java.util.ArrayList;

public class PecaComposta extends Componente {

    protected double valorTotal = 0;

    private ArrayList<Componente> componentes;

    public PecaComposta() {
    }

    public PecaComposta(String nome, double valorTotal) {
        super(nome, valorTotal);
        this.valorTotal += valorTotal;
        componentes = new ArrayList<>();
    }

    @Override
    public void escreva() {
        System.out.println("+" + "Nome: " + nome + " Valor: " + valorTotal);
        for(Componente componente : componentes) {
            componente.escreva();
        }
    }

    @Override
    public void add(Componente peca) {
        componentes.add(peca);
    }

    @Override
    public void remove(Componente peca) {
        componentes.remove(peca);
    }

    @Override
    public Componente obterPecas(int pos) {
        return componentes.get(pos);
    }
}

import java.util.ArrayList;

public class PecaFolha extends Componente {

    private ArrayList<Componente> componentes;

    public PecaFolha() {
    }

    public PecaFolha(String nome, double valorTotal) {
        super(nome, valorTotal);
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

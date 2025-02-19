import java.util.ArrayList;

public class PecaComposta extends Componente {

    private ArrayList<Componente> componentes = new ArrayList<>();

    public PecaComposta() {
    }

    public PecaComposta(String nome) {
        super(nome);
    }

    @Override
    public void escreva() {
        System.out.println("+" + "Nome: " + nome + " Valor: " + valor);
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

    @Override
    public double calcularValorTotal() {
        valor = 0;
        for (Componente componente : componentes) {
            valor += componente.calcularValorTotal();
        }
        return valor;
    }
}

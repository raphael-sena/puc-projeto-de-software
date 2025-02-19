//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PecaComposta pc1 = new PecaComposta("Motor");
        PecaFolha pf1 = new PecaFolha("Parafuso", 10.0);
        PecaFolha pf2 = new PecaFolha("Arruela", 10.0);

        pc1.add(pf1);
        pc1.add(pf2);
        pc1.calcularValorTotal();

        PecaComposta pc2 = new PecaComposta("Banco");
        PecaFolha pf3 = new PecaFolha("Estofado", 10.0);
        PecaFolha pf4 = new PecaFolha("Couro", 10.0);

        pc2.add(pf3);
        pc2.add(pf4);
        pc2.calcularValorTotal();

        PecaComposta carro = new PecaComposta("Carro");
        carro.add(pc1);
        carro.add(pc2);
        carro.calcularValorTotal();

        carro.escreva();

        System.out.println("\n---- Removendo o motor ----");
        carro.remove(pc1);
        carro.calcularValorTotal();

        carro.escreva();

    }
}
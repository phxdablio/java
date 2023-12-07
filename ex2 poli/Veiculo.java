package ex2.poli;

public abstract class Veiculo {

    protected String modelo;
    protected double preco;

    public Veiculo(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public abstract void printDados();
}

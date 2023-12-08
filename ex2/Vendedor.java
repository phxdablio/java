package ex2;

public class Vendedor extends Empregado {
    private double vendas;
    private int qntVendas;

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Vendas: " + vendas + ", Quantidade de Vendas: " + qntVendas;
    }
}

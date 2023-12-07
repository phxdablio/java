
package ex2.poli;


// Classe Carro (subclasse de Veiculo)
public class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    @Override
    public double getPreco() {
        if (km > 100000) {
            return preco * 0.92; // Reduz 8% do preço se a quilometragem for alta
        } else {
            return preco;
        }
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        // Implementação da inserção de dados, se necessário
    }

    @Override
    public void printDados() {
        System.out.println("Carro: Modelo: " + modelo + ", Quilometragem: " + km + ", Preço: R$" + getPreco());
    }
}

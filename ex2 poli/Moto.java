package ex2.poli;

public class Moto extends Veiculo {

    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        // Implementação da inserção de dados, se necessário
    }

    @Override
    public void printDados() {
        System.out.println("Moto: Modelo: " + modelo + ", Ano: " + ano + ", Preço: R$" + preco);
    }
}

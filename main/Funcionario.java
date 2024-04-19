
package main;


public class Funcionario extends Thread {
    private String nome;
    private double salario;
    private Loja loja;
    private Conta contaSalario;
    private Conta contaInvestimentos;

    public Funcionario(String nome, double salario, Loja loja) {
        this.nome = nome;
        this.salario = salario;
        this.loja = loja;
        this.contaSalario = loja.getConta();
        this.contaInvestimentos = new Conta();
    }

    @Override
    public void run() {
        while (true) {
            // Aguarda o salário estar disponível na conta
            synchronized (contaSalario) {
                while (contaSalario.getSaldo() < salario) {
                    try {
                        contaSalario.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // Recebe o salário
                contaSalario.sacar(salario);
                // Investe 20% do salário na conta de investimentos
                double valorInvestido = salario * 0.2;
                contaInvestimentos.depositar(valorInvestido);
                System.out.println(nome + " investiu R$" + valorInvestido + " na conta de investimentos.");
            }
        }
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Conta getContaInvestimentos() {
        return contaInvestimentos;
    }

    void receberSalario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


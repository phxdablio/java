package main;

public class Loja {
    private String nome;
    private double saldo;
    private Conta conta;
    private Produto produto1;
    private Produto produto2;
    private Funcionario[] funcionarios;

    public Loja(String nome, Conta contaLoja, Banco banco) {
        this.nome = nome;
        this.saldo = 0;
        this.conta = contaLoja;
        if (nome.equalsIgnoreCase("papelaria")) {
            this.produto1 = new Produto("Caderno", 100.0);
            this.produto2 = new Produto("Livro", 200.0);
        } else if (nome.equalsIgnoreCase("informatica")) {
            this.produto1 = new Produto("Fone", 100.0);
            this.produto2 = new Produto("SSD", 200.0);
        }
        this.funcionarios = new Funcionario[1]; // Apenas um funcionário por enquanto
        this.funcionarios[0] = new Funcionario("Funcionario1", 1400.0, this);
    }

    public void efetuarCompra(Cliente cliente, Produto produto) {
        double valorCompra = produto.getPreco();
        if (cliente.getSaldo() >= valorCompra) {
            // Simular transferência de dinheiro da conta do cliente para a conta da loja
            cliente.atualizarSaldo(-valorCompra);
            this.saldo += valorCompra;
            conta.depositar(valorCompra);
            System.out.println(cliente.getNome() + " comprou na loja " + this.nome + " um(a) " + produto.getNome() + " por R$" + valorCompra);
            // Verifica se há saldo suficiente para pagar os funcionários
            if (this.saldo >= 1400) {
                pagarFuncionarios();
            }
        } else {
            System.out.println("Saldo insuficiente para a compra na loja " + this.nome + " pelo cliente " + cliente.getNome());
        }
    }

    public void pagarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            conta.sacar(1400.0);
            funcionario.receberSalario();
            this.saldo -= 1400.0;
            System.out.println("Salário de " + funcionario.getNome() + " pago pela loja " + this.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public Produto getProduto1() {
        return produto1;
    }

    public Produto getProduto2() {
        return produto2;
    }
}

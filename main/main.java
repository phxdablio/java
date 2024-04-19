package main;

import java.util.Scanner;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um banco, contas, lojas, clientes, funcionários, etc.
        Banco banco = new Banco();

        Conta contaCliente1 = new Conta();
        Conta contaCliente2 = new Conta();
        Conta contaCliente3 = new Conta();
        Conta contaCliente4 = new Conta();
        Conta contaCliente5 = new Conta();
        Conta contaPapelaria = new Conta();
        Conta contaInformatica = new Conta();

        banco.adicionarConta("Cliente1", contaCliente1);
        banco.adicionarConta("Cliente2", contaCliente2);
        banco.adicionarConta("Cliente3", contaCliente3);
        banco.adicionarConta("Cliente4", contaCliente4);
        banco.adicionarConta("Cliente5", contaCliente5);
        banco.adicionarConta("Papelaria", contaPapelaria);
        banco.adicionarConta("Informatica", contaInformatica);

        Loja papelaria = new Loja("Papelaria", contaPapelaria, banco);
        Loja informatica = new Loja("Informatica", contaInformatica, banco);

        Cliente cliente1 = criarCliente(scanner, "Cliente 1", 1000.0, papelaria, informatica);
        Cliente cliente2 = criarCliente(scanner, "Cliente 2", 1000.0, papelaria, informatica);
        Cliente cliente3 = criarCliente(scanner, "Cliente 3", 1000.0, papelaria, informatica);
        Cliente cliente4 = criarCliente(scanner, "Cliente 4", 1000.0, papelaria, informatica);
        Cliente cliente5 = criarCliente(scanner, "Cliente 5", 1000.0, papelaria, informatica);

        // Funcionários, início do loop de compras, etc.

        scanner.close();
    }

    private static Cliente criarCliente(Scanner scanner, String defaultName, double saldo, Loja papelaria, Loja informatica) {
        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();
        return new Cliente(nome.isEmpty() ? defaultName : nome

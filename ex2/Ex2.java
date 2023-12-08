package ex2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        System.out.println("Digite as informacoes do Cliente:");
        System.out.print("Nome: ");
        cliente.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        cliente.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Sexo: ");
        cliente.setSexo(scanner.nextLine());
        System.out.print("Valor da Divida: ");
        cliente.setValorDivida(scanner.nextDouble());
        System.out.print("Ano de Nascimento: ");
        cliente.setAnoNascim(scanner.nextInt());
        System.out.println(cliente);

        Vendedor vendedor = new Vendedor();
        System.out.println("\nDigite as informacoes do Vendedor:");
        System.out.print("Nome: ");
        vendedor.setNome(scanner.next());
        System.out.print("Salario: ");
        vendedor.setSalario(scanner.nextDouble());
        System.out.print("Vendas: ");
        vendedor.setVendas(scanner.nextDouble());
        System.out.print("Quantidade de Vendas: ");
        vendedor.setQntVendas(scanner.nextInt());
        System.out.println(vendedor);

        Gerente gerente = new Gerente();
        System.out.println("\nDigite as informacoes do Gerente:");
        System.out.print("Nome: ");
        gerente.setNome(scanner.next());
        System.out.print("Idade: ");
        gerente.setIdade(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Matricula: ");
        gerente.setMatricula(scanner.next());
        System.out.print("Nome da Gerencia: ");
        gerente.setNomeGerencia(scanner.next());
        System.out.println(gerente);

        scanner.close();
    }
}

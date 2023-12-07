package ex2.poli;

// Programa principal
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex2Poli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();

        while (true) {
            System.out.println("Digite 'c' para registrar um carro, 'm' para registrar uma moto ou 's' para sair:");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("s")) {
                break;
            }

            System.out.println("Digite o modelo:");
            String modelo = scanner.nextLine();

            System.out.println("Digite o ano:");
            int ano = scanner.nextInt();

            System.out.println("Digite o preco:");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer

            if (opcao.equalsIgnoreCase("c")) {
                System.out.println("Digite a quilometragem:");
                double km = scanner.nextDouble();
                veiculos.add(new Carro(modelo, preco, km));
            } else if (opcao.equalsIgnoreCase("m")) {
                veiculos.add(new Moto(modelo, preco, ano));
            } else {
                System.out.println("Opção invalida. ");
            }
            scanner.nextLine(); // Limpar o buffer
        }

        System.out.println("\nRelatorio de veículos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
        }
    }
}

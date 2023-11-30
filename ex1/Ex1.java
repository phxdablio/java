package ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do animal:");
        String nome = scanner.nextLine();

        System.out.println("Digite o peso do animal:");
        double peso = scanner.nextDouble();

        System.out.println("Digite 'p' se seu animal e um peixe ou 'c' se ele e um cachorro:");
        char tipoAnimal = scanner.next().charAt(0); // Lê o primeiro caractere

        if (tipoAnimal == 'p' || tipoAnimal == 'P') {
            System.out.println("Digite o tipo de habitat do peixe:");
            scanner.nextLine(); 
            String tipoHabitat = scanner.nextLine();

            Peixe peixe = new Peixe(nome, peso, tipoHabitat);
            peixe.setNome(nome);
            peixe.setPeso(peso);
            peixe.setTipoHabitat(tipoHabitat);

            System.out.println("Informações do Peixe:");
            System.out.println(peixe.toString());
        } else if (tipoAnimal == 'c' || tipoAnimal == 'C') {
            System.out.println("Digite a raca do cachorro:");
            scanner.nextLine(); 
            String raca = scanner.nextLine();

            Cachorro cachorro = new Cachorro(nome, peso, raca);
            cachorro.setNome(nome);
            cachorro.setPeso(peso);
            cachorro.setRaca(raca);

            System.out.println("Informações do Cachorro:");
            System.out.println(cachorro.toString());
        } else {
            System.out.println("Opcao invalida");
        }

        scanner.close();
    }
}

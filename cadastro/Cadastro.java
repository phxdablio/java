
package cadastro;

import java.util.Scanner;


public class Cadastro {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        Pet p2 = new Pet();
        Veiculo p3 = new Veiculo();
        
        System.out.println("Cadastro Pessoa");
        System.out.println("Nome: ");
        p1.nome = scanner.nextLine();
        
        System.out.println("Idade: ");
        p1.idade = scanner.nextInt();
        
        System.out.println("CPF: ");
        p1.cpf = scanner.nextLine();
        
        System.out.println("Dados do Pet");
        System.out.println("Animal: ");
        p2.animal = scanner.nextLine();
        
        System.out.println("Idade: ");
        p2.idade = scanner.nextInt();
        
        System.out.println("Raca do Animal: ");
        p2.raca = scanner.nextLine();
        
        System.out.println("Dados Automovel");
        System.out.println("Veiculo: ");
        p3.automovel = scanner.nextLine();
        
        System.out.println("Modelo: ");
        p3.Modelo = scanner.nextLine();
        
        System.out.println("Ano: ");
        p3.ano = scanner.nextInt();
        
        System.out.println("Cor: ");
        p3.cor = scanner.nextLine();
        
        System.out.println("Placa: ");
        p3.placa = scanner.nextLine();
        
        
        System.out.println("Dados Usuario: ");
        System.out.println("Nome: " +p1.nome);
        System.out.println("Idade: "+ p1.idade);
        System.out.println("CPF: "+ p1.cpf);
        
        System.out.println("Dados do Pet");
        System.out.println("Animal: "+p2.animal);
        System.out.println("Raca: "+p2.raca);
        System.out.println("Idade do Pet: "+p2.idade);
        
        System.out.println("Automovel: "+p3.automovel);
        System.out.println("Modelo: "+p3.Modelo);
        System.out.println("Ano: "+p3.ano);
        System.out.println("Cor: "+p3.cor);
        System.out.println("Placa: "+p3.placa);
        
        
    }
    
}

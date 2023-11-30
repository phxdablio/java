
package ex1poli;

import java.util.Scanner;


public class Ex1poli {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do CD:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o preco do CD:");
        double preco = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Digite o codigo do CD:");
        int codigo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o numero de musicas do CD:");
        int nMusicas = scanner.nextInt();
        scanner.nextLine();
        
        CD cd = new CD(codigo, preco, nome, nMusicas);
        cd.setNome(nome);
        cd.setPreco(preco);
        cd.setPreco(preco);
        cd.setnMusicas(nMusicas);
        
        System.out.println("Digite o nome do DVD:");
        String nomee = scanner.nextLine();
        
        System.out.println("Digite o preco do DVD:");
        double precoo = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.println("Digite o codigo do DVD:");
        int codigoo = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o numero de faixas do DVD:");
        int nFaixas = scanner.nextInt();
        scanner.nextLine();
        
        DVD dvd = new DVD (codigo, preco, nome, nFaixas);
        dvd.setNome (nomee);
        dvd.setPreco(precoo);
        dvd.setCodigo(codigoo);
        dvd.setnFaixas(nFaixas);
        
        cd.printDados();
        dvd.printDados();
       
       
       
        
      
    }
    
    
   
}

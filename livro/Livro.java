
package livro;

import java.util.Scanner;


public class Livro {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do livro");
        String titulo = scanner.nextLine();
        
        System.out.println("Digite o nome do autor do livro");
        String autor = scanner.nextLine();
        
        System.out.println("Digite o numero de pagians do livro");
        int numPags = scanner.nextInt();
        
        Classe_Livro livro = new Classe_Livro(titulo, autor, numPags);
        
        
        livro.imprimirInfo();
        scanner.close();
    }
    
}

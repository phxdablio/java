
package informatica;

import java.util.Scanner;


public class Informatica {

   
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a descricao da compra: ");
        String descricao = scanner.nextLine();
        
        System.out.println("Digite o numero do produto: ");
        int numero = scanner.nextInt();
        
        System.out.println("Quantas vezes deseja comprar o Item ?: ");
        int quantidade = scanner.nextInt();
        
        System.out.println("Digite o preco do item: ");
        int precoPorItem = scanner.nextInt();
        
        fatura.setDescricao(descricao);
        fatura.setNumero(numero);
        fatura.setQuantidade(quantidade);
        fatura.setPrecoPorItem(precoPorItem);
        
        fatura.getTotalFatura();
        
        
        
    }
    
}

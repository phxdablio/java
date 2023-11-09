
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //criar objeto do Pessoa
        Pessoa pessoa = new Pessoa();
     
        pessoa.setNome("Pedro");
        pessoa.setCpf("052.879.181-86");
        pessoa.setEmail("marquesphx@gmail.com");
        
       //criar objeto do endereço
       Endereço endereco = new Endereço();
       endereco.setCidade("Samambaia");
       endereco.setEstado("Df");
       endereco.setRua("QR 114");
       
       //criar objeto do endereço
       Telefone telefone = new Telefone();
       telefone.setTipo("Celular");
       telefone.setDdd("61");
       telefone.setNumero("985606305");
       
       //Prit Pessoa
        System.out.println(""+pessoa.getNome());
        System.out.println(""+pessoa.getCpf());
        System.out.println(""+pessoa.getEmail());
        
       //Print endereço
        System.out.println(""+endereco.getCidade());
        System.out.println(""+endereco.getEstado());
        System.out.println(""+endereco.getRua());
        
        //Print telefone
        System.out.println(""+telefone.getDdd());
        System.out.println(""+telefone.getNumero());
        System.out.println(""+telefone.getTipo());
       
        
    }
    
}

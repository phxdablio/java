
package main;

import java.util.ArrayList;


public class Pessoa {
   
   private String nome;
   private String cpf;
   private String email;
   private Endereco endereco;
   private Telefone telefone;
   private ArrayList<Telefone> telefones = new ArrayList<>();


   
   public Pessoa (String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefones = new ArrayList<>();

   }

    Pessoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }
    public void addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
    }
    }
   
   

   
    
      
    
    



package main;


public class Pessoa {

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
    
    public void addTelefone(Telefone telefone){
    telefone.addPessoa(this);
    
}       
    private String nome;
    private String cpf;
    private String email;
    
    
}

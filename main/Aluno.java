
package main;

import java.util.ArrayList;


public class Aluno extends Pessoa {
    
    private ArrayList<Double> notas = new ArrayList();
    private ArrayList<Disciplina> disciplina = new ArrayList<>();
    private Curso cursos;
    
     public Aluno(String nome, String cpf, String email) {
       super(nome,cpf,email);
       this.notas = new ArrayList();
       this.disciplina = new ArrayList<>();
       this.cursos = new Curso();
       
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public ArrayList<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public Curso getCursos() {
        return cursos;
    }

    public void setCursos(Curso cursos) {
        this.cursos = cursos;
    }

    public void addTelefone(Telefone telefone) {
        super.addTelefone(telefone);
    }
    
     public void imprimir() {
        System.out.println("\nInformações do Aluno:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("E-mail: " + getEmail());
        System.out.println("Endereço: " + getEndereco().getRua() + ", " +
                getEndereco().getCidade() + ", " + getEndereco().getEstado());
        System.out.println("Telefones:");
        for (Telefone telefone : getTelefones()) {
            System.out.println("  Tipo: " + telefone.getTipo() + ", DDD: " +
                    telefone.getDdd() + ", Número: " + telefone.getNumero());
        }
        System.out.println("Curso: " + getCursos().getNome());
   
}
}
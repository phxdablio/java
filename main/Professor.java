package main;

import java.util.ArrayList;
import main.Telefone;

public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private ArrayList<String> disciplinasMinistradas = new ArrayList<>();

    public Professor(String nome, String cpf, String email) {
        super(nome, cpf, email);
    }

    Professor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<String> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void setDisciplinasMinistradas(ArrayList<String> disciplinasMinistradas) {
        this.disciplinasMinistradas = disciplinasMinistradas;
    }

    public void addDisciplina(String disciplina) {
        disciplinasMinistradas.add(disciplina);
    }

    public void imprimir() {
        System.out.println("\nInformações do Professor:");
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
        System.out.println("Titulação: " + getTitulacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Disciplinas Ministradas:");
        for (String disciplina : disciplinasMinistradas) {
            System.out.println("  Nome da Disciplina: " + disciplina);
        }
    }

    void addDisciplina(Disciplina disciplina) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

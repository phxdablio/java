package main;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();

    public Disciplina() {
        // Construtor vazio
    }

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
    }

    public void imprimir() {
        System.out.println("\nInformações da Disciplina:");
        System.out.println("Nome da Disciplina: " + getNome());
        System.out.println("Alunos matriculados na disciplina:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome());
        }
        System.out.println("Professores da disciplina:");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome());
        }
    }
}

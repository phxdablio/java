
package main;

import java.util.ArrayList;


public class Curso {
    
   private String nome;
   private ArrayList<Professor> professores = new ArrayList<>();
   private ArrayList<Aluno> alunos = new ArrayList<>();
   private ArrayList<Disciplina> disciplinas = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    void addDisciplina(String disciplina) {
        
    }
    void addCursos(String cursos){
        
    }
    
    public void imprimir() {
        for (Disciplina disciplina : disciplinas) {
            System.out.println("\nDisciplina: " + disciplina.getNome());
            System.out.println("Alunos matriculados:");
            for (Aluno aluno : disciplina.getAlunos()) {
                System.out.println(" - " + aluno.getNome());
            }
            System.out.println("Professores:");
            for (Professor professor : disciplina.getProfessores()) {
                System.out.println(" - " + professor.getNome());
            }
        }
    }
}



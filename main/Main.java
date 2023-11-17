package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de alunos:");
        int numAlunos = scanner.nextInt();
        scanner.nextLine(); 

        for (int j = 0; j < numAlunos; j++) {
            System.out.println("Digite o nome do aluno:");
            String nome = scanner.nextLine();
            System.out.println("Digite o CPF do aluno:");
            String cpf = scanner.nextLine();
            System.out.println("Digite o e-mail do aluno:");
            String email = scanner.nextLine();

            Aluno aluno = new Aluno(nome, cpf, email);

            System.out.println("Digite a rua do endereco:");
            String rua = scanner.nextLine();
            System.out.println("Digite a cidade do endereco:");
            String cidade = scanner.nextLine();
            System.out.println("Digite o estado do endereco:");
            String estado = scanner.nextLine();

            Endereco endereco = new Endereco();
            endereco.setRua(rua);
            endereco.setCidade(cidade);
            endereco.setEstado(estado);

            aluno.setEndereco(endereco);

            System.out.println("Quantos telefones o aluno possui?");
            int numTelefones = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            for (int i = 0; i < numTelefones; i++) {
                System.out.println("Digite o tipo do telefone " + (i + 1) + ":");
                String tipoTelefone = scanner.nextLine();
                System.out.println("Digite o DDD do telefone " + (i + 1) + ":");
                String ddd = scanner.nextLine();
                System.out.println("Digite o numero do telefone " + (i + 1) + ":");
                String numeroTelefone = scanner.nextLine();

                Telefone telefone = new Telefone();
                telefone.setTipo(tipoTelefone);
                telefone.setDdd(ddd);
                telefone.setNumero(numeroTelefone);

                aluno.addTelefone(telefone);
            }

            System.out.println("Digite o nome do curso:");
            String nomeCurso = scanner.nextLine();

            Curso curso = new Curso();
            curso.setNome(nomeCurso);

            aluno.setCursos(curso);

            aluno.imprimir();
        }

        System.out.println("Digite o numero de professores:");
        int numProfessores = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numProfessores; i++) {
            System.out.println("\nDigite o nome do professor " + (i + 1) + ":");
            String nomeProfessor = scanner.nextLine();
            System.out.println("Digite o CPF do professor " + (i + 1) + ":");
            String cpfProfessor = scanner.nextLine();
            System.out.println("Digite o e-mail do professor " + (i + 1) + ":");
            String emailProfessor = scanner.nextLine();

            Professor professor = new Professor(nomeProfessor, cpfProfessor, emailProfessor);

            System.out.println("Digite a rua do endereco do professor " + (i + 1) + ":");
            String ruaProfessor = scanner.nextLine();
            System.out.println("Digite a cidade do endereco do professor " + (i + 1) + ":");
            String cidadeProfessor = scanner.nextLine();
            System.out.println("Digite o estado do endereco do professor " + (i + 1) + ":");
            String estadoProfessor = scanner.nextLine();

            Endereco enderecoProfessor = new Endereco();
            enderecoProfessor.setRua(ruaProfessor);
            enderecoProfessor.setCidade(cidadeProfessor);
            enderecoProfessor.setEstado(estadoProfessor);

            professor.setEndereco(enderecoProfessor);

            System.out.println("Quantos telefones o Professor possui?");
            int numTelefones2 = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            for (int l = 0; l < numTelefones2; l++) {
                System.out.println("Digite o tipo do telefone " + (l + 1) + ":");
                String tipoTelefone = scanner.nextLine();
                System.out.println("Digite o DDD do telefone " + (l + 1) + ":");
                String ddd = scanner.nextLine();
                System.out.println("Digite o numero do telefone " + (l + 1) + ":");
                String numeroTelefone = scanner.nextLine();

                Telefone telefone = new Telefone();
                telefone.setTipo(tipoTelefone);
                telefone.setDdd(ddd);
                telefone.setNumero(numeroTelefone);

                professor.addTelefone(telefone);
            }

            System.out.println("Digite o salario do professor " + (i + 1) + ":");
            double salarioProfessor = scanner.nextDouble();
            professor.setSalario(salarioProfessor);

            scanner.nextLine(); 

            System.out.println("Digite a titulacao do professor " + (i + 1) + ":");
            String titulacaoProfessor = scanner.nextLine();
            professor.setTitulacao(titulacaoProfessor);

            System.out.println("Quantas disciplinas o professor " + (i + 1) + " ministra?");
            int numDisciplinasProfessor = scanner.nextInt();
            scanner.nextLine(); 

            for (int j = 0; j < numDisciplinasProfessor; j++) {
                System.out.println("Digite o nome da disciplina " + (j + 1) + " que o professor " + (i + 1) + " ministra:");
                String disciplinaProfessor = scanner.nextLine();
                professor.addDisciplina(disciplinaProfessor);
            }
        }


        System.out.println("Digite o nome do curso:");
        String nomeCurso = scanner.nextLine();
        System.out.println("Quantas disciplinas o curso possui?");
        int numDisciplinas = scanner.nextInt();
        scanner.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);

        for (int i = 0; i < numDisciplinas; i++) {
            Disciplina disciplina = new Disciplina();
            System.out.println("Digite o nome da disciplina " + (i + 1) + ":");
            String nomeDisciplina = scanner.nextLine();
            disciplina.setNome(nomeDisciplina);

            System.out.println("Digite o número de alunos matriculados na disciplina " + (i + 1) + ":");
            int numAlunosDisciplina = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < numAlunosDisciplina; j++) {
                Aluno aluno = new Aluno();
                System.out.println("Digite o nome do aluno " + (j + 1) + " matriculado na disciplina " + (i + 1) + ":");
                String nomeAluno = scanner.nextLine();
                aluno.setNome(nomeAluno);
                disciplina.getAlunos().add(aluno);
            }

            System.out.println("A disciplina " + nomeDisciplina + " possui algum professor (S/N)?");
            String resposta = scanner.nextLine().toUpperCase();

            if (resposta.equals("S")) {
                System.out.println("Digite o nome do professor da disciplina " + (i + 1) + ":");
                String nomeProfessor = scanner.nextLine();
                Professor professor = new Professor();
                professor.setNome(nomeProfessor);
                disciplina.getProfessores().add(professor);
            }

            curso.getDisciplinas().add(disciplina);
        }

      
        
       
          curso.imprimir(); // Chama o método imprimir de Curso
        
        scanner.close();
    }
}

       


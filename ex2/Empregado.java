package ex2;

public class Empregado extends Pessoa {
    private double salario;
    private String matricula;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salário: " + salario + ", Matrícula: " + matricula;
    }

    public double valorInss() {
        return salario * 0.11;
    }
}

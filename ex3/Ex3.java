public class Ex3 {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Fornecedor 1", "Rua A", "123456789", 5000, 2000);
        System.out.println("Nome do Fornecedor: " + fornecedor.getNome());
        System.out.println("Saldo do Fornecedor: " + fornecedor.obterSaldo());

        System.out.println();

        Administrador administrador = new Administrador("Admin 1", "Rua B", "987654321", 123, 3000, 10, 500);
        System.out.println("Nome do Administrador: " + administrador.getNome());
        System.out.println("Salário do Administrador: " + administrador.calcularSalario());

        System.out.println();

        Operario operario = new Operario("Operario 1", "Rua C", "456789012", 456, 2000, 5, 10000, 2);
        System.out.println("Nome do Operario: " + operario.getNome());
        System.out.println("Salário do Operario: " + operario.calcularSalario());

        System.out.println();

        Vendedor vendedor = new Vendedor("Vendedor 1", "Rua D", "789012345", 789, 2500, 8, 5000, 3);
        System.out.println("Nome do Vendedor: " + vendedor.getNome());
        System.out.println("Salário do Vendedor: " + vendedor.calcularSalario());
    }
}

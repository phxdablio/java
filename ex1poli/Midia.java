
package ex1poli;


public class Midia {
    private int codigo;
    private double preco;
    private String nome;
   
    public Midia(){
        
    }
    public Midia (int codigo, double preco, String nome){
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
    
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    
   public String getDetalhes() {
        return "Código: " + getCodigo() + ", Preco: " + getPreco() + ", Nome: " + getNome();
    }
  
   public void printDados(){
       System.out.println("Tipo"+getTipo());
       System.out.println("Informacoes"+getDetalhes());
       
       
   }
   
   public void inserirDados(int codigo, double preco, String nome){
       this.setCodigo(codigo);
       this.setPreco(preco);
       this.setNome(nome);
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
}


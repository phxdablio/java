
package ex1poli;


public class CD extends Midia{
    private int nMusicas;
    
    public CD (){
        
    }
   public CD (int codigo, double preco, String nome, int nMusicas){
       super (codigo, preco, nome);
       this.nMusicas = nMusicas;
   }
   public String getTipo(){
      return this.getClass().getSimpleName();  
   }
   public String getDetalhes(){
       return "Codigo: " + getCodigo() + ", Preco: " + getPreco() +  ", Nome: " + getNome() + "Numeros de Musicas" + getnMusicas();
   }
   public void printDados(){
       System.out.println("Tipo:"+getTipo());
       System.out.println("Informacoes"+getDetalhes());
   }
   public void inserirDados(int codigo, double preco, String nome){
        super.inserirDados(codigo, preco, nome);
        this.setnMusicas(getnMusicas());
    }

    public int getnMusicas() {
        return nMusicas;
    }

    public void setnMusicas(int nMusicas) {
        this.nMusicas = nMusicas;
    }
}

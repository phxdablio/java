
package ex1poli;


public class DVD extends Midia {
    private int nFaixas;
    
    public DVD(){
        
    }
    
    public DVD(int codigo, double preco, String nome, int nFaixas){
        super (codigo,preco,nome);
        this.nFaixas = nFaixas;
    }
    
    public String getTipo(){
        return this.getClass().getSimpleName();
    }
    public String getDetalhes(){
        return "Codigo: " + getCodigo() + ", Preco: " + getPreco() + ", Nome: " + getNome() + "Numero de Faixas: " + getnFaixas();
    }
    public void pritDados(){
        System.out.println("Tipo:"+getTipo());
        System.out.println("Informacoes:"+getDetalhes());
    }
    public void inserirDados(int codigo, double preco, String nome){
        super.inserirDados(codigo, preco, nome);
        this.setnFaixas(getnFaixas());
    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }
}

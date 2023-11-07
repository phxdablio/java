
package informatica;


public class Fatura {

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(int precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
    
    public void getTotalFatura(){
    
        resultado = this.precoPorItem * this.quantidade;
        System.out.println("Descricao: "+this.descricao);
        System.out.println("Numero: "+this.numero);
        System.out.println("Preco por Item: "+this.precoPorItem);
        System.out.println("Quantidade do Produto: "+this.quantidade);
        System.out.println("Resultado da fatura eh: "+resultado);
        
        
        
}
    private int numero;
    private String descricao;
    private int quantidade;
    private int precoPorItem;
    int resultado;
}

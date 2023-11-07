
package livro;


public class Classe_Livro {
    
    String titulo;
    String autor;
    int numPags;
    
    Classe_Livro(){
    
}
    Classe_Livro(String titulo, String autor, int numPags){
        
        this.titulo = titulo;
        this.autor = autor;
        this.numPags = numPags;
    
}
     public void imprimirInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Numero de Pagians: "+numPags);
    }
}

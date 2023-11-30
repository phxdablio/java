
package ex1;


public class Peixe extends Animal {
    private String tipoHabitat;
    
    public Peixe (String nome, double peso, String tipoHabitat){
        super (nome,peso);
        this.tipoHabitat = tipoHabitat;
    }
    public String getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(String tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }
    
    public String toString() {
        return "Peixe - Nome: " + getNome() + ", Peso: " + getPeso() + ", Tipo de Habitat: " + tipoHabitat;
    }
}

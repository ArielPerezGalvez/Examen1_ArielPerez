
package examen1;

import java.util.ArrayList;

public class Clase {
  private Clase clase;
  ArrayList <String> metodos = new ArrayList();
  ArrayList <String> atributos = new ArrayList(); 

    public Clase() {
    }

    public Clase(Clase clase) {
        this.clase = clase;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public ArrayList<String> getMetodos() {
        return metodos;
    }

    public void setMetodos(ArrayList<String> metodos) {
        this.metodos = metodos;
    }

    public ArrayList<String> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<String> atributos) {
        this.atributos = atributos;
    }

    @Override
    public String toString() {
        return "Clase{" + "clase=" + clase + ", metodos=" + metodos + ", atributos=" + atributos + '}';
    }
  
    
    
    
    
    
}

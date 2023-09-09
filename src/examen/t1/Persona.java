
package examen.t1;

public class Persona {

    private String nombre_completo;
    
    public Persona(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }
    public String consola() {
        return this.nombre_completo + " ";
            
    }
}

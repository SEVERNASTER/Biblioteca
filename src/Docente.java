package Docker;
public class Docente extends Persona {
    private String codDocente;

    public Docente(String nombre, String CI, int edad, String codDocente){
        super(nombre, CI, edad);
        this.codDocente = codDocente;
        this.tipoPersona = "  (Docente)";
    }

    @Override
    public String toString(){
        return yellow + "Nombre: " + reset + cyan + nombre + reset + yellow + " Edad: " + reset + cyan + edad + reset + yellow + " CI: " + reset + cyan + CI + reset + yellow + " codDocente: " + reset + cyan + codDocente + reset; 
    }




}

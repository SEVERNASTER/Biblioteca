package Docker;
public class Estudiante extends Persona {
    private String codEstudiante;
    
    public Estudiante(String nombre, String CI, int edad, String codEstudiante){
        super(nombre, CI, edad);
        this.codEstudiante = codEstudiante;
        this.tipoPersona = "  (Estudiante)";
    }

    @Override
    public String toString(){
        return yellow + "Nombre: " + reset + cyan + nombre + reset + yellow + " Edad: " + reset + cyan + edad + reset + yellow + " CI: " + reset + cyan + CI + reset + yellow + " codEstudiante: " + reset + cyan + codEstudiante + reset; 
    }


}

package Docker;


import java.util.ArrayList;

import Content.Material;
import Themes.Colores;

public abstract class Persona  extends Colores{
    protected String nombre;
    protected String CI;
    protected int edad;
    protected boolean sePresto;
    protected String tipoPersona;
    protected ArrayList<Material> materialPrestado;
    

    public Persona(String nombre, String CI, int edad) {
        this.nombre = nombre;
        this.CI = CI;
        this.edad = edad;
        materialPrestado = new ArrayList<>();
    }

    public boolean getSePresto() {
        return sePresto;
    }

    public void setSePresto(boolean sePresto) {
        this.sePresto = sePresto;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipoPersona(){
        return tipoPersona;
    }

    public void agregarMaterial(Material material){
        materialPrestado.add(material);
    }

    public int debe(){
        return materialPrestado.size();
    }
    
    public ArrayList<Material> getArray(){
        return materialPrestado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCI(String cI) {
        CI = cI;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCI() {
        return CI;
    }

    public int getEdad() {
        return edad;
    }

    
}

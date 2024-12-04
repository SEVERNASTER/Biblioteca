package Content;
public class Revista extends Material {

    public Revista(String nombre, int paginas, String codigo, String tipo) {
        super(nombre, paginas, codigo);
        this.tipo = tipo;
        this.tipoMateriaL = "  (Revista)";
    }

    @Override
    public String toString() {
        return yellow + "Nombre: " + cyan + nombre + yellow + " Paginas: " + cyan + paginas + yellow + " Codigo: " + cyan + codigo + yellow + " Tipo: " + cyan + tipo + reset;
    }

    

    

}

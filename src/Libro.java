package Content;


public class Libro extends Material{

    public Libro(String nombre, String autor, int paginas, String codigo, int edicion){
        super(nombre, paginas, codigo);
        this.autor = autor;
        this.edicion = edicion;
        this.tipoMateriaL = "  (Libro)";
    }

    @Override
    public String toString(){
        return  yellow + "Nombre: " + cyan + nombre + yellow + " Autor: " + cyan + autor + yellow + " Paginas: " + cyan + paginas + yellow + " Codigo: " + cyan + codigo + yellow + " Edicion: " + cyan + edicion + reset;
    }


    


}

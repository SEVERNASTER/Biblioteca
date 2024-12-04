package Content;
import Themes.Colores;

public class Material extends Colores {
    protected String nombre;
    protected int paginas;
    protected String codigo;
    protected String tipoMateriaL;
    protected String autor;
    protected int edicion;
    protected String tipo;


    public Material(String nombre, int paginas, String codigo){
        this.nombre = nombre;
        this.paginas = paginas;
        this.codigo = codigo;
    }

    public String getTipoMaterial(){
        return tipoMateriaL;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipoMateriaL(String tipoMateriaL) {
        this.tipoMateriaL = tipoMateriaL;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    
    
    


}

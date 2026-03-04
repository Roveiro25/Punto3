public class ObjLibro{
    private String titulo;
    private String autor;
    private int precio;

    public ObjLibro() {
    }

    public ObjLibro(String autor, int precio, String titulo) {
        this.autor = autor;
        this.precio = precio;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


}
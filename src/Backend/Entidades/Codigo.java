package Backend.Entidades;

public class Codigo {
    private int idCodigo;
    private String codigo;
    
    Producto producto;

    public Codigo() {
        //this.producto = new Producto();
    }

    /*public Codigo(String codigo) {
        this.codigo = codigo;
    }*/

    //#region Getters and Setters

    public int getIdCodigo() {
        return idCodigo;
    }

    public void setIdCodigo(int idCodigo) {
        this.idCodigo = idCodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    //#endregion

    @Override
    public String toString() {
        return "Codigo{" +
                "idCodigo=" + idCodigo +
                ", codigo='" + codigo + '\''+
                '}';
    }
}

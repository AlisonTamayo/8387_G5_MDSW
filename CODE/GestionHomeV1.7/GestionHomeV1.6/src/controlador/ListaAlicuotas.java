
package controlador;

public class ListaAlicuotas {
    private String cedula;
    private String nombre;
    private int NCasa;
    private String Valorpago;

    public ListaAlicuotas(String cedula, String nombre, String Valorpago, int Ncasa) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Valorpago = Valorpago;
        this.NCasa=NCasa;
    }

    public ListaAlicuotas(int NCasa) {
        this.NCasa = NCasa;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNCasa() {
        return NCasa;
    }

    public void setNCasa(int NCasa) {
        this.NCasa = NCasa;
    }

    public String getValorpago() {
        return Valorpago;
    }

    public void setValorpago(String Valorpago) {
        this.Valorpago = Valorpago;
    }
    
    
    
}

import java.util.Date;

public class Producto {

    public String ID;
    public String nombre;
    public String tipo;
    public Date fechavencimiento;

    public Producto(String ID, String nombre, String tipo, Date fechavencimiento) {
        this.ID = ID;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechavencimiento = fechavencimiento;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }
}

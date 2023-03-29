public abstract class Vehiculo implements Alquilable {

protected String marca;
protected String modelo;
protected float precio;

public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

public Vehiculo() {
    }

public String getMarca() {
        return marca;
    }

public void setMarca(String marca) {
        this.marca = marca;
    }

public String getModelo() {
        return modelo;
    }

public void setModelo(String modelo) {
        this.modelo = modelo;
    }

public float getPrecio() {
        return precio;
    }

public void setPrecio(float precio) {
        this.precio = precio;
    }
}

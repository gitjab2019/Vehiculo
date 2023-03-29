public class Moto extends Vehiculo{
    private float cilindrada;

    public Moto(String marca, String modelo, float precio, float cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public Moto(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public float calcularPrecioAlquiler() {
        return 10.0f*this.cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio=" + precio +
                '}';
    }
}

public class Coche extends Vehiculo{

   private int nroDePuertas;

   public Coche(String marca, String modelo, Float precio, int nroDePuertas) {
      super(marca, modelo, precio);
      this.nroDePuertas = nroDePuertas;
   }

   public Coche(int nroDePuertas) {
      this.nroDePuertas = nroDePuertas;
   }

   public int getNroDePuertas() {
      return nroDePuertas;
   }

   public void setNroDePuertas(int nroDePuertas) {
      this.nroDePuertas = nroDePuertas;
   }

   @Override
   public float calcularPrecioAlquiler() {
      return ((float)this.nroDePuertas * 10.0f);
   }

   @Override
   public String toString() {
      return "Coche{" +
              "nroDePuertas=" + nroDePuertas +
              ", marca='" + marca + '\'' +
              ", modelo='" + modelo + '\'' +
              ", precio=" + precio +
              '}';
   }
}

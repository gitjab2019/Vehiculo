import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

     Moto moto1=new Moto("BMW","Cross",100000.0f, 4.8f);
     Coche auto1=new Coche("Ford","Mustang Coupe",50000.0f,3);

     ArrayList<Vehiculo> listaVehiculos=new ArrayList<Vehiculo>();


     listaVehiculos.add(moto1);
     listaVehiculos.add(auto1);

     for(Vehiculo v:listaVehiculos)
     {
      System.out.println(v);
      System.out.println("Precio Alquiler: "+ v.calcularPrecioAlquiler());
     }
   /*VERSION LISTA DE ALQUILABLES
    Mediante esta opcion defino una lista de alquilables para que funcione, hay que
    quitar implements alquilable de Vehiculo y que lo hagan tanto coche como moto
    1) quitar implements alquilable de vehiculo
    2) agregar implements alquilable de Moto y Coche

     ArrayList<Alquilable> listaVehiculos=new ArrayList<Alquilable>();


     listaVehiculos.add(moto1);
     listaVehiculos.add(auto1);

     for(Alquilable v:listaVehiculos)
     {
      System.out.println(v);
      System.out.println("Precio Alquiler: "+ v.calcularPrecioAlquiler());
     }

    FIN VERSION LISTA DE ALQUILABLES*/
    }
}
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Auto("Mercedes", "GLE", 50.0));
        listaVehiculos.add(new Moto("Tesla", "MT99", 30.0));

        int diasAlquiler = 5;

        System.out.println("=== ALQUILER DE VEHÍCULOS ===");
        System.out.println("Cálculo de alquiler para " + diasAlquiler + " días:\n");

        for (Vehiculo v : listaVehiculos) {
            double costoTotal = v.calcularCostoAlquiler(diasAlquiler);
            System.out.println("Vehículo: " + v.getMarca() + " " + v.getModelo() +
                    "\nTarifa base/día: $" + v.getTarifaBase() +
                    "\nCosto total (" + diasAlquiler + " días): $" + costoTotal +
                    "\n----------------------------------------");
        }
    }
}
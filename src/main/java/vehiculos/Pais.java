package vehiculos;

public class Pais {

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public static Pais paisMasVendedor() {
        Fabricante fabricante = Fabricante.fabricaMayorVentas();
        return fabricante.getPais();
    }

    public String getNombre() {
        return nombre;
    }
}

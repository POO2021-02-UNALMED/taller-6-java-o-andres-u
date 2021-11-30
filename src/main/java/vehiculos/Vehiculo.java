package vehiculos;

public class Vehiculo {
    private static int cantidadVehiculos;

    private String placa;
    private int puertas;
    private final int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private final String traccion;
    private Fabricante fabricante;

    public Vehiculo(int velocidadMaxima, String traccion) {
        this.velocidadMaxima = velocidadMaxima;
        this.traccion = traccion;
        Vehiculo.cantidadVehiculos += 1;
    }

    public Vehiculo(int puertas, int velocidadMaxima, String traccion) {
        this(velocidadMaxima, traccion);
        this.puertas = puertas;
    }

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this(puertas, velocidadMaxima, traccion);
        this.placa = placa;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.fabricante = fabricante;
        Fabricante.agregarFabricante(fabricante);
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    }

    public static String vehiculosPorTipo() {
        return String.format(
                "Automoviles: %d" +
                "Camionetas: %d" +
                "Camiones: %d", 0, 0, 0); // TODO
    }

    public String getPlaca() {
        return placa;
    }

    public int getPuertas() {
        return puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public float getPeso() {
        return peso;
    }

    public String getTraccion() {
        return traccion;
    }
}

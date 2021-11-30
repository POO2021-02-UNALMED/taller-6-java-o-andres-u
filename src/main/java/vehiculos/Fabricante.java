package vehiculos;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fabricante {

    private static final ArrayList<Fabricante> fabricantes = new ArrayList<>();

    private String nombre;
    private Pais pais;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public static void agregarFabricante(Fabricante fabricante) {
        fabricantes.add(fabricante);
    }

    public static Fabricante fabricaMayorVentas() {
        Map<Fabricante, Long> counted = fabricantes.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return counted.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }
}

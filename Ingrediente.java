import java.math.BigDecimal;

public class Ingrediente implements IComponente {
    private final int id;
    private final String nombre;
    private final BigDecimal precio;

    public Ingrediente(int id, String nombre, BigDecimal precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public BigDecimal getPrecio() {
        return precio;
    }
}

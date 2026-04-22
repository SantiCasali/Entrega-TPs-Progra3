import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Plato implements IComponente {
    private final int id;
    private final String nombre;
    private final List<IComponente> componentes = new ArrayList<>();

    public Plato(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarComponente(IComponente c) {
        componentes.add(c);
    }

    @Override
    public BigDecimal getPrecio() {
        BigDecimal total = BigDecimal.ZERO;
        for (IComponente c : componentes) {
            total = total.add(c.getPrecio());
        }
        return total;
    }
}

public class Pizza extends Plato {
	private final String tipoPizza;

	public Pizza(int id, String nombre, String tipoPizza) {
		super(id, nombre);
		this.tipoPizza = tipoPizza;
	}

	public String getTipoPizza() {
		return tipoPizza;
	}

	@Override
	public String toString() {
		return "Pizza{id=" + getId() + ", nombre='" + getNombre() + "', tipoPizza='" + tipoPizza + "'}";
	}
}

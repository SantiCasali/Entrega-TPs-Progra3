public class Hambuguesa extends Plato {
	private final String tipoHambuguesa;

	public Hambuguesa(int id, String nombre, String tipoHambuguesa) {
		super(id, nombre);
		this.tipoHambuguesa = tipoHambuguesa;
	}

	public String getTipoHambuguesa() {
		return tipoHambuguesa;
	}

	@Override
	public String toString() {
		return "Hambuguesa{id=" + getId() + ", nombre='" + getNombre() + "', tipoHambuguesa='" + tipoHambuguesa + "'}";
	}
}

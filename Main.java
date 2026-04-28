import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Ingrediente harina = new Ingrediente(1, "Harina", new BigDecimal("500"));
		Ingrediente huevo = new Ingrediente(2, "Huevo", new BigDecimal("300"));
		Ingrediente agua = new Ingrediente(3, "Agua", new BigDecimal("100"));
		Ingrediente dulceDeLeche = new Ingrediente(4, "Dulce de leche", new BigDecimal("800"));

		Plato panqueques = new Plato(1, "Panqueques");
		panqueques.agregarComponente(harina);
		panqueques.agregarComponente(huevo);
		panqueques.agregarComponente(agua);

		Plato panquequesConDulceDeLeche = new Plato(2, "Panqueques con dulce de leche");
		panquequesConDulceDeLeche.agregarComponente(panqueques);
		panquequesConDulceDeLeche.agregarComponente(dulceDeLeche);

		System.out.println("Precio de panqueques: " + panqueques.getPrecio());
		System.out.println("Precio de panqueques con dulce de leche: " + panquequesConDulceDeLeche.getPrecio());

		// Ejemplo simple de herencia: Pizza y Hambuguesa heredan de Plato.
		Ingrediente masa = new Ingrediente(5, "Masa", new BigDecimal("700"));
		Ingrediente salsa = new Ingrediente(6, "Salsa", new BigDecimal("250"));
		Ingrediente queso = new Ingrediente(7, "Queso", new BigDecimal("900"));
		Ingrediente pina = new Ingrediente(8, "Piña", new BigDecimal("400"));

		Pizza pizzaConPina = new Pizza(10, "Pizza", "Piña");
		pizzaConPina.agregarComponente(masa);
		pizzaConPina.agregarComponente(salsa);
		pizzaConPina.agregarComponente(queso);
		pizzaConPina.agregarComponente(pina);

		Hambuguesa hamburguesaArgenta = new Hambuguesa(11, "Hambuguesa", "Argenta");

		System.out.println(pizzaConPina);
		System.out.println("Precio de pizza con piña: " + pizzaConPina.getPrecio());
		System.out.println(hamburguesaArgenta);
	}
}

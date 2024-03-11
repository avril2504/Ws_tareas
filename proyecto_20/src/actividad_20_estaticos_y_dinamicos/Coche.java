package actividad_20_estaticos_y_dinamicos;

public class Coche {
	private int id;
	private String matricula;
	private String marca;
	private static int contadorID = 0;
	private static final String MARCA_MAS_USADA1 = "TOYOTA";
	private static final String MARCA_MAS_USADA2 = "RENAULT";
	
	public Coche() {
		super();
		this.id = ++contadorID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static int getContadorID() {
		return contadorID;
	}


	/**
	 * Muestra los daos del coche por pantalla
	 */
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}
	/**
	 * este metodo tiene la opción de mostrar el valor actual del contadorID
	 */
	public static void mostrarContador() {
		System.out.println(contadorID);
	}
	
	/**
	 * este metodo tendrá la opción de resetear el contadorID a cero.
	 */
	public static void resetear() {
		contadorID = 0;
		contadorID = contadorID;
		System.out.println(contadorID);
	}
}

package Acrividad_17_ordenador;

import java.util.ArrayList;

public class MainOrdenador {

	public static void main(String[] args) {
		Procesador procesador = new Procesador("Intel", "core", 4, 300);
		RAM ram = new RAM("Corsair", 16, 100);
		TarjetaGrafica tarjetaGrafica = new TarjetaGrafica("NVIDIA","GeForce RTX 3080", 8704, ram, 800);
		PlacaBase placaBase = new PlacaBase("ASUS", "ATX", 190);
		
		//Modulos RAM
		RAM ram2 = new RAM("Corsair Vengeance LPX", 16, 100);
		RAM ram3 = new RAM("Crucial Ballistix", 8, 50);
		RAM ram4 = new RAM("Team T-Force Vulcan", 16, 80);
		ArrayList<RAM>listaRAM = new ArrayList<RAM>();
		listaRAM.add(ram2);
		listaRAM.add(ram3);
		listaRAM.add(ram4);
		
		//Perifericos
		Periferico periferico = new Periferico("Ratón", "Logitech", 60);
		Periferico periferico2 = new Periferico("Teclado mecánico", "Razer", 90);
		Periferico periferico3 = new Periferico("Monitor de 24 pulgadas", "ASUS", 150);
		Periferico periferico4 = new Periferico("Auriculares gaming", "HyperX", 60);
		ArrayList<Periferico>listaPeriferico = new ArrayList<Periferico>();
		listaPeriferico.add(periferico);
		listaPeriferico.add(periferico2);
		listaPeriferico.add(periferico3);
		listaPeriferico.add(periferico4);
		
		//Ordenador
		
		Ordenador ordenador = new Ordenador(0, procesador, placaBase, listaRAM, listaPeriferico, tarjetaGrafica);
		System.out.println(ordenador);
		ordenador.calcularPrecio();
		System.out.println(ordenador);
	}

}

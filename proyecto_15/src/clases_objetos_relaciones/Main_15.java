package clases_objetos_relaciones;


public class Main_15 {

	public static void main(String[] args) {

		//Empresa y trabajadores 1
		
		Trabajador trabajador1 = new Trabajador();
		trabajador1.setNombre("Luis");
		trabajador1.setDni("12345678A");
		trabajador1.setSalario(4000.00);
		
		Trabajador trabajador2 = new Trabajador();
		trabajador2.setNombre("Alex");
		trabajador2.setDni("123s5678A");
		trabajador2.setSalario(1500.00);
		
		Trabajador trabajador3 = new Trabajador();
		trabajador3.setNombre("Ana");
		trabajador3.setDni("12335678A");
		trabajador3.setSalario(2200.00);

		Trabajador[] ArrayT = new Trabajador[3];
		ArrayT[0] = trabajador1;
		ArrayT[1] = trabajador2;
		ArrayT[2] = trabajador3;
		
		Empresa empresa = new Empresa();
		empresa.setNombre("Nintendo");
		empresa.setNif("156AC556");
		empresa.setLista_trabajadores(ArrayT);
		System.out.println(empresa);
		
		//Empresa y trabajadores 2
		
		Trabajador trabajador4 = new Trabajador();
		trabajador4.setNombre("Luisa");
		trabajador4.setDni("12345po8A");
		trabajador4.setSalario(3000.00);
		
		Trabajador trabajador5 = new Trabajador();
		trabajador5.setNombre("Alexander");
		trabajador5.setDni("56987412A");
		trabajador5.setSalario(1500.00);
		
		Trabajador trabajador6 = new Trabajador();
		trabajador6.setNombre("Ana");
		trabajador6.setDni("12335678A");
		trabajador6.setSalario(2200.00);

		Trabajador[] ArrayT2 = new Trabajador[3];
		ArrayT2[0] = trabajador4;
		ArrayT2[1] = trabajador5;
		ArrayT2[2] = trabajador6;
		
		Empresa empresa2 = new Empresa();
		empresa2.setNombre("Meta");
		empresa2.setNif("16Dsa486");
		empresa2.setLista_trabajadores(ArrayT2);
		System.out.println(empresa2);
		
		//Array de empresa y metodos
		
		Empresa[] ArrayEmpresa = new Empresa[2];
		ArrayEmpresa[0] = empresa;
		ArrayEmpresa[1] = empresa2;
		
		for(Empresa e : ArrayEmpresa) {
			
			System.out.println("-------------------------------------------------------");
			e.datos_trabajadores();
			e.ExisteTrabajadorDNI("12345678A");
			e.numero_trabajadores();
			e.salario_total();
			e.ganan_mas_tresmil();
			e.ganan_memos_SMI();
			e.ganan_mas(2300.00);
			e.DNIvalidoTrabajadores();
			e.empresa_igual(empresa2);
			
			for(Trabajador t : e.getLista_trabajadores()) {
				t.validarDNI();
				t.salario_mayor(trabajador1.getSalario(), trabajador2.getSalario());
				t.trabajador_igual(trabajador5);
			}
			
		}

	}

}

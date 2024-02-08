package objetos_y_array;

public class Main_usuario {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		usuario1.id = 234685133;
		usuario1.nombre = "Samantha";
		int[]Array = new int[3];
		Array[0] = 3;
		Array[1] = 4;
		Array[2] = 5;
		usuario1.valoracion = Array;
		
		int[]Array2 = new int[5];
		Array2[0] = 1;
		Array2[1] = 2;
		Array2[2] = 3;
		Array2[3] = 4;
		Array2[4] = 5;
		Usuario usuario2 = new Usuario(1546553, "Luis", Array2);
		usuario2.valoracion = Array2;
		
		int[]Array3 = new int[5];
		Array3[0] = 5;
		Array3[1] = 7;
		Array3[2] = 3;
		Array3[3] = 8;
		Array3[4] = 9;
		Usuario usuario3 = new Usuario(46586465, "Sophia", Array3);
		usuario3.valoracion = Array3;
		
		Usuario[]ArrayUsuarios = new Usuario[3];
		ArrayUsuarios[0] = usuario1;
		ArrayUsuarios[1] = usuario2;
		ArrayUsuarios[2] = usuario3;
		
		for(int i = 0; i < ArrayUsuarios.length; i++) {
			Usuario u = ArrayUsuarios[i];
			System.out.println(u);
			u.media();
			u.valoraciones();
			u.SuperaValoraciones(5);
			u.superaMedia(6);
			
		}

	}

}

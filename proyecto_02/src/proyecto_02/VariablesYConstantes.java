package proyecto_02;

public class VariablesYConstantes {

	public static void main(String[] args) {
		
		//calcular área y périmetro de un réctangulo
		
		int longitud = 35;
	    System.out.println(longitud);

	    int ancho = 15;
	    System.out.println(ancho);
	    
	    int area = longitud * ancho;
	    System.out.println(area);
	    
	    int perimetro = 2 * (longitud + ancho);
	    System.out.println(perimetro);
	    
	   // -----------------------------------------
	    
	    longitud = 40;
	    System.out.println(longitud);
	    
	    ancho = 17;
	    System.out.println(ancho);
	    
	    area = longitud * ancho;
	    System.out.println(area);
	    
	    perimetro = 2 * (longitud + ancho);
	    System.out.println(perimetro);
	    
	    //------------------------------------------
	    
	    longitud = 78;
	    System.out.println(longitud);
	    
	    ancho = 34;
	    System.out.println(ancho);
	    
	    area = longitud * ancho;
	    System.out.println(area);
	    
	    perimetro = 2 * (longitud + ancho);
	    System.out.println(perimetro);
	    
	    
	    //Conversión de temperatura
	    
	    int farenheit = 45;
	    System.out.println(farenheit);
	    
	    int celsius = ((farenheit - 32) * 5 / 9);// el 32, el 5 y el 9 son constantes asi que seria
	    //mejor colocarlos como tal "EJ: final CONSTANTE = 32;"
	    System.out.println(celsius);
	   
	   
	    //Calculo de área de un circulo
	    
	   final double PI = 3.1416;
	   
	   int radio = 26;
	    double areacirculo = PI * (radio * 2);
	    System.out.println(areacirculo);
	   
	    
	    //Calculo de interés simple
	    
	    int principal = 1000;
	    
	    int tasa = 1500;
	    
	    int tiempo = 40;
	    
	    int interes = principal * tasa * tiempo;
	    System.out.println(interes);
	    
	    
	    //Conversión de moneda
	    
	   final double dolar_1 = 0.85;
	   System.out.println("dolar_1: "+ dolar_1);
	   
	   int euros = 36_000;
	   
	   final double conversion = euros * dolar_1;
	   System.out.println("conversion: "+ conversion);
	    
	   
	   //Calculo del indice de masa corporal
	   
	   int peso = 68;
	   
	   final double altura = 1.69;
	   
	   final double IMC = peso / (altura * altura);
	   System.out.println(IMC);
	   
			   
	    
	    	
	    		

	    
	    
	}

}

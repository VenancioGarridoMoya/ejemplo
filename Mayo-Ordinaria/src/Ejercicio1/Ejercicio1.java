package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String [] a) {
		Scanner teclado = new Scanner(System.in);
		int numeroCadenas=0;
		String cadenaMayor="";
		long caracteresIntroducidos=0;
		String cadena;
		do {
			System.out.println("Introduce cadena ('fin' => Salir): ");
			cadena=teclado.nextLine();
			if (!cadena.toUpperCase().equals("FIN")) {
				if(cadena.length()>cadenaMayor.length())
					cadenaMayor=cadena;
				numeroCadenas++;
				caracteresIntroducidos+=cadena.length();
				
			}
		}while (!cadena.toUpperCase().equals("FIN"));
		System.out.println("Cadena mayor: "+cadenaMayor+" - longitud: "+
				cadenaMayor.length());
		System.out.println("Número de cadenas: "+ numeroCadenas);
		System.out.println("Número de caracteres: "+ caracteresIntroducidos);		
	}

}

package com.programaciongratis.aplicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		// aqui solo creamos una variable de tipo int
		int variable = 0;
		
		// ¿cual crees que sera el valor de 'variable' despues
		// de ejecutarse esta declaracion if-else?
		if (variable > 5) {
			variable = variable + 5;
		} else {
			variable = variable - 5;
		}
		
		// acerataras?
		System.out.println("variable: " + variable);
		
		//aqui creamos otra varibale
		int otraVariable = 5;
		
		// ¿cual crees que sera el valor de 'otraVariable' despues
		// de ejecutarse esta declaracion if?
		if (otraVariable >= 5) {
			otraVariable = otraVariable + 5;
		}
		
		// acerataras?
		System.out.println("otraVariable: " + otraVariable);
		
		
		// -------------------------------------------------------------------------------------
		// ahora insertamos una declaracion switch
		// basado en el valor de otraVariable.
		switch (otraVariable) {
			//switch funciona por casos (case).
			case 5:  // el numero 5 significa, si otraVariable vale 5 entonces este codigo se ejecuta
				System.out.println("El valor de otraVariable es 5...");
				
				// se ejecuta hasta llegar a break (romper)
				break;
			
			// lo mismo pasa con este caso.
			case 10: 
				System.out.println("El valor de otra variable es 10...");
				break;
			
			// caso default (por defecto) se ejecuta si ninguno de los casos de arriba
			// se ejecutan
			default:
				System.out.println("El valor de otraVariable no es ni 5 ni 10...\n\n");
		}
		
		//---------------------------------------------------------------------------------------
		//el siguiente for loop se va ejecutar 10 veces
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + " - este mensaje se va escribir 10 veces...");
		}
		
		// para usar el enhanced for loop necesitamos un array (coleccion)
		String[] nombres = {"lucho", "juanito", "pepito", "florencio"};
		
		for (String nombre : nombres) {
			System.out.println("Soy: " + nombre);
		}
		
		//---------------------------------------------------------------------------------------
		//en este ejemplo while loop vamos a ejecutar codigo hasta
		//que el usuario entre el numero cero.
		
		BufferedReader consola = new BufferedReader(new InputStreamReader(System.in));
		
		int numero = -1;
		
		//preguntamos al usuario que entre un numero
		System.out.println("\n\nPorfavor entre un numero:");
		
		try {
			
			while (numero != 0) {
				System.out.println("Entre cero para salir.");
				System.out.println("Entre cualquier otro numero para seguir ejecutando el while loop.");
				
				numero = Integer.parseInt(consola.readLine());
			}
			
			System.out.println("Saliste del while loop...");
			
		} catch (NumberFormatException e) {
			// esto va ejecutarse si no entraste un numero...
			// no me crees? entra una letra o una palabra...
			System.out.println("Si se ejecuto esto es porque escribiste"
					+ " una palabra o un numero o un simbolo :P");
			e.printStackTrace();
		} catch (IOException e) {
			//esto se ejcuta solo si hay problemas al leer
			//lo que escribiste.
			e.printStackTrace();
		}
		
	}

}

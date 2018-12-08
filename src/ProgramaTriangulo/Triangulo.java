package ProgramaTriangulo;

// importamos la libreria LocalDateTime para poder sacar la hora y fecha de inicio y final del proceso
import java.time.LocalDateTime;

/**
 * 
 * Esta es la clase Triangulo, contiene un main para la entrada de argumentos,
 * esta clase se encarga de imprimir un Triangulo segun el argumento que se le
 * pase.
 *
 */
public class Triangulo {

	public static void main(String[] args) {

		// Este if comprueba si se han pasado argumentos

		if (args.length == 0) {
			// Se utiliza el length para saber la longitud del array , si el array es 0, no
			// hay argumentos
			// Si no hay argumentos se imprime lo siguiente y se acaba el programa:
			// Si no hay argumento, se imprime el siguiente mensaje
			System.out.println("Se requiere un argumento");
			// Si no hay argumento, se imprime el mensaje de error
			System.err.println("_________________________________________________________");
			System.err.println("Se ha encontrado un error. Revise su archivo.");
			System.err.println("_________________________________________________________");
			return;
		}
		// Si no se ha dado error alguno, se imprime el siguiente mensaje y continua el
		// programa
		else {
			System.err.println("_________________________________________________________");
			System.err.println("No se ha encontrado error ninguno. Revise su archivo.");
			System.err.println("_________________________________________________________");
		}

		// Se crea un entero, que va a guardar el argumento
		// se le hace un parseInt para transformarlo en numero entero
		int filas = Integer.parseInt(args[0]);
		// Se imprime la hora y fecha a la que se inicia el proceso
		System.out.println("La hora del inicio del proceso: " + LocalDateTime.now() + " .");
		// Se imprime un espacio en blanco para que pase a otra linea
		System.out.println();
		// Se indica el numero del argumento que ha entrado, del cual se hace el
		// triangulo
		System.out.println("Triangulo generado del numero: " + filas + ".");
		// Impresion de una linea
		System.out.println("_________________________________________________________");

		// Se hace un bucle for para crear las filas
		// Mientras que el numero del argumentos sea mayor o igual que uno, se va
		// restando, hasta acabar en la fila del 1
		// se encarga de hacer las filas que son iguales al numero que entra por la
		// variable filas, el argumento que le facilitamos
		for (int i = filas; i >= 1; i--) {

			for (int n = 1; n <= i; n++) {
				// va imprimiendo cada fila de numero
				System.out.print(n);

			}
			// espacio para que la siguiente cadena de numeros vaya en la linea siguiente
			System.out.println();

		}
		// Espacio para que se deje una linea en blanco
		System.out.println();
		// Impresion de una linea
		System.out.println("_________________________________________________________");
		// Se imprime la hora a la que acaba el proceso
		System.out.println("La hora del final del proceso: " + LocalDateTime.now() + " .");
	}

}
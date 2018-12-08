package ProgramaTriangulo;

/**
 * @author Alejandro 
 *@version 1.0
 *@year 2018
 */

import java.io.File; // Importamos la libreria File ya que el proceso la usa para la salida de los ficheros
import java.io.IOException;// Importamos la libreria IOException para poder capturar las excepciones generadas por la entrada/salida de ficheros

/**
 * Esta es la clase Lanzador, se encarga de lanzar 3 procesos que generaran los
 * triangulos en tres archivos de texto distintos. Los procesos ejecutaran la clase Triangulo y le pasaran como
 * argumento el numero asignado para la ejecucion mediante la consola de
 * comandos, habra que situarse en la carpeta llamada "bin" donde se encontrara
 * el paquete "ProgramaTriangulo", y dentro del mismo los archivos
 * correspondientes a cada clase. Por ultimo, habra que escribir "java
 * ProgramaTriangulo/Lanzador" y se ejecutara la clase Lanzador
 */

public class Lanzador {

	public static void main(String[] args) {
		// Aqui creamos tres ojetos nuevos de la clase ProcessBuilder, que seran los
		// procesos
		// Incluiremos como parametros de estos objetos el String "java" para que se
		// ejecute desde la consola de comandos
		// Tambien incluiremos el String Triangulo precedido de su paquete contenedor
		// seguido de "/" , para especificar la ruta, que ejecutara a la clase Triangulo
		// Por ultimo anadimos un numero como argumento para crear la piramide en base a
		// ese numero
		ProcessBuilder proceso1, proceso2, proceso3;
		proceso1 = new ProcessBuilder("java", "ProgramaTriangulo/Triangulo", "5");
		proceso2 = new ProcessBuilder("java", "ProgramaTriangulo/Triangulo", "7");
		proceso3 = new ProcessBuilder("java", "ProgramaTriangulo/Triangulo", "9");
		/*

		/*
		 * Un proceso lanzado no tendra entrada y salida por consola como se suele
		 * hacer. Con reditrectError recibe un objeto File por parametro, generando un
		 * archivo de texto que se llamara "errores_triangulo_x" este escribe los errores que se
		 * hayan dado en la clase Triangulo, los reconoce por el System.err.. Con
		 * redirectOutput lo que hacemos es recibir un objeto File por parametro,
		 * generando un archivo de texto que se llamara "triangulox" y este escribira los
		 * resultados que se dan al pasarle el argumento a la clase Triangulo
		 */

		// Proceso 1, redireccion de salida de errores a archivo de texto
		proceso1.redirectError(new File("errores_triangulo_5.txt"));
		// Proceso 1, redireccion de salida a archivo de texto
		proceso1.redirectOutput(new File("Triangulo_5.txt"));

		// Proceso 2, redireccion de salida  de errores a archivo de texto
		proceso2.redirectError(new File("errores_triangulo_7.txt"));
		// Proceso 2, redireccion de salida a archivo de texto
		proceso2.redirectOutput(new File("Triangulo_7.txt"));

		// Proceso 3, redireccion de salida de los  errores a archivo de texto
		proceso3.redirectError(new File("errores_triangulo_9.txt"));
		// Proceso 3, redireccion de salida a archivo de texto
		proceso3.redirectOutput(new File("Triangulo_9.txt"));

		/**
		 * Creamos una sentencia en bloque try catch para capturar las excepciones que
		 * entrada y salida que pueden lanzarse al iniciar cada proceso, si se lanza
		 * alguna esta sera capturada y se imprimira el nombre de la misma
		 */

		try {
			// Iniciamos el proceso 1
			proceso1.start();
			// Sacamos por pantalla que el primer proceso se ha lanzado con exito
			System.out.println("El primer proceso se ha lanzado con exito");
			// Sacamos por pantalla que se revisen los archivos generados por este proceso
			System.out.println("Revisa el contenido de los archivos errores_triangulo_5.txt y Triangulo_5.txt");
			// Iniciamos el proceso 2
			proceso2.start();
			// Sacamos por pantalla que el segundo proceso se ha lanzado con exito
			System.out.println("El segundo proceso se ha lanzado con exito");
			// Sacamos por pantalla que se revisen los archivos generados por este proceso
			System.out.println("Revisa el contenido de los archivos errores_triangulo_7.txt y Triangulo_7.txt");
			// Iniciamos el proceso 3
			proceso3.start();
			// Sacamos por pantalla que el tercer proceso se ha lanzado
			System.out.println("El segundo tercer se ha lanzado con exito");
			// Sacamos por pantalla que se revisen los archivos generados por este proceso
			System.out.println("Revisa el contenido de los archivos errores_triangulo_9.txt y Triangulo_9.txt");
			// Imprimimos por consola un mensaje para indicar que los procesos se han lanzado correctamente
			System.out.println("Los procesos se han lanzado");
			System.out.println("Examina los archivos de salida");

		} // capturamos las excepciones que se han lanzado de entrada y salida
		catch (IOException e) {
			// si hay alguna, se imprime el mensaje de dicha excepcion
			e.printStackTrace();

		}
	}

}

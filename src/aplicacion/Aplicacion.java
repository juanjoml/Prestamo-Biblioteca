package aplicacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		ArrayList<Prestamo> lista = new ArrayList<Prestamo>(); /* Creamos un ArrayList vacio llamado lista, que ordena
																nuestra clase Prestamo. */
		Scanner scan = new Scanner(System.in);
		
		int iterar = 1;
		
		while (iterar==1)	// Creamos un bucle infinito con un menu con opciones, incluida salir del bucle).
		{
			System.out.println();
			
			System.out.println("Elige la opcion: ");
			
			System.out.println("1. Introducir nuevo libro: ");
			
			System.out.println("2. Introducir nueva revista");
			
			System.out.println("3. Ver los prestamos realizados");
			
			System.out.println("4. Borrar un prestamo");
			
			System.out.println("5. Salir de la aplicacion");
			
			System.out.println();
			
			System.out.print("Introduce una opcion: ");
			
			int opcion = scan.nextInt();	// Introducimos la opcion.
			
			switch (opcion)
			{
				case 1:
				{
					System.out.println();	// Metemos todos los atributos del objeto Libro:
				
					System.out.println("Introducir nuevo libro: ");
				
					System.out.println(" -Nombre: ");	// Nombre (del elemento padre Material).
				
					String nombre = scan.next();
				
					System.out.println(" -id: ");	// ID (del elemento padre Material).
				
					int id = scan.nextInt();
				
					System.out.println(" -Editorial: ");	// Editorial
				
					String editorial = scan.next();
				
					System.out.println(" -Genero: ");	// Genero
				
					String genero = scan.next();
				
					System.out.println(" -Autor: ");	// Autor
				
					scan = new Scanner(System.in);		// Usaremos un nuevo Scanner antes de cada nuevo nextLine que usemos,
					String autor = scan.nextLine(); // para que no de error (nextLine imprime una cadena de mas de una palabra).
				
					System.out.println(" -isbn: ");	// ISBM
				
					String isbn = scan.next();
				
					System.out.println(" -Año de Publicacion: ");	// y año de Publicacion
				
					int anoPublicacion = scan.nextInt();
				
					Libro libro = new Libro (nombre, id, editorial, genero, autor, isbn, anoPublicacion);
				
					/* Creamos el objeto libro, pasandole con el constructor todos los atributos introducidos. */
				
					System.out.println(" Datos de la persona a la que se presta el libro: ");
	
					System.out.println();	// Metemos todos los atributos del objeto Persona:
				
					System.out.println(" dni: "); // dni
				
					String dni = scan.next();
		
					System.out.println(" -Nombre de la persona: "); // nombre de la persona
				
					String nombrePersona = scan.next();
		
					System.out.println(" -Primer apellido: "); // apellido1
				
					String apellido1 = scan.next();
				
					System.out.println("-Segundo apellido: "); // apellido2
				
					String apellido2 = scan.next();
				
					Persona persona = new Persona(dni, nombrePersona, apellido1, apellido2);
				
					/* Creamos el objeto persona, pasandole con el constructor todos los atributos introducidos. */
				
					Prestamo prestamo = new Prestamo(libro, persona);
				
					/* Creamos el objeto "prestamo", pasandole con el constructor sus atributos introducidos:
				   el de tipo Material (en este caso, el objeto libro) y persona. */
				
					lista.add(prestamo);	// Y con el metodo add, lo agregamos a la lista.
					
					break;
				
				}
				case 2:
				{
					System.out.println();	// Metemos todos los atributos del objeto Revista:
				
					System.out.println(" Introducir nueva revista: ");
				
					System.out.println(" -Nombre: ");	// Nombre (del elemento padre Material).
				
					String nombre = scan.next();
				
					System.out.println(" -id: ");	// ID (del elemento padre Material).
				
					int id = scan.nextInt();
				
					System.out.println(" -Editor: ");	// Editor
					
					scan = new Scanner(System.in);		// Usaremos un nuevo Scanner antes de cada nuevo nextLine que usemos,
					String editor = scan.nextLine(); // para que no de error (nextLine imprime una cadena de mas de una palabra).
				
					System.out.println(" -Genero: ");	// Genero
				
					String genero = scan.next();
				
					System.out.println(" -doi: ");	// Doi
						
					String doi = scan.next(); 
				
					System.out.println(" -volumen: ");	// Volumen
				
					int volumen = scan.nextInt();
				
					System.out.println(" -Año de Publicacion: ");	// y año de Publicacion
				
					int anoPublicacion = scan.nextInt();
				
					Revista revista = new Revista (nombre, id, editor, genero, doi, volumen, anoPublicacion);
				
					/* Creamos el objeto revista, pasandole con el constructor todos los atributos introducidos. */
				
					System.out.println(" Datos de la persona a la que se presta el libro: ");
	
					System.out.println();	// Metemos todos los atributos del objeto Persona:
				
					System.out.println(" dni: "); // dni
				
					String dni = scan.next();
		
					System.out.println(" -Nombre de la persona: "); // nombre de la persona
				
					String nombrePersona = scan.next();
		
					System.out.println(" -Primer apellido: "); // apellido1
				
					String apellido1 = scan.next();
				
					System.out.println("-Segundo apellido: "); // apellido2
				
					String apellido2 = scan.next();
				
					Persona persona = new Persona(dni, nombrePersona, apellido1, apellido2);
				
					/* Creamos el objeto persona, pasandole con el constructor todos los atributos introducidos. */
				
					Prestamo prestamo = new Prestamo(revista, persona);
				
					/* Creamos el objeto "prestamo", pasandole con el constructor sus atributos introducidos:
				   el de tipo Material (en este caso, el objeto revista) y persona. */
				
					lista.add(prestamo);	// Y con el metodo add, lo agregamos a la lista.
					
					break;
				
				}
				case 3:
				{
					System.out.println();
					
					System.out.println("Lista de prestamos: ");
				
					System.out.println(lista.toString()); // Imprimimos la lista con toString (convierte la lista en una cadena).
				
					break;
				}
				case 4:
				{
					System.out.println("Que prestamo quieres borrar? ");
				
					try									// Usamos try (primera opcion, si encuentra la posicion)
					{
						int posicion=scan.nextInt();	// Indicamos y metemos con la variable "posicion", la posicion a borrar de la lista.
					
						lista.remove(posicion);			// Y con el metodo remove, la borramos de lista.
					}
					catch(Exception e)				// Si no estuviera dicha posicion, lo indicamos con catch (Exception e), similar a un else.
					{
						System.out.println("Dicho prestamo no existe");
					}
				
					break;
				}
				case 5:
				{
					iterar=0;	// Y con la opcion 5, cambiamos la variable del bucle infinito y salimos de este y del menu.
			
					break;
				}
			
				default: break;
			}
		}
	}
}

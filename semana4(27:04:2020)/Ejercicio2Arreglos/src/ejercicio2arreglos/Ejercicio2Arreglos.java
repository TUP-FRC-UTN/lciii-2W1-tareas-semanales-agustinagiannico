
package ejercicio2arreglos;

import java.util.Scanner;


public class Ejercicio2Arreglos {

  
    public static void main(String[] args) {
  /** 
    2. Una Veterinaria encargada del cuidado de mascotas ha solicitado
    * la realización de un software para obtener resultados sobre sus clientes y
    * sus respectivas mascotas. (Suponer que cada cliente posee una sola mascota)
Se sabe que cada Cliente de esta veterinaria tienen: un numero de cliente, un nombre,
* una antigüedad (hace cuánto que son clientes de la veterinaria) y una Mascota. 
* De la Mascota se dispone los siguientes datos: el nombre y la edad.
El software requiere cargar un número n de Clientes 
(este valor deberá ser cargado por teclado). 
* Almacenar la información de los clientes en un arreglo.
Se pide:
 Mostrar la cantidad de clientes.
 Mostrar el promedio de edad de las mascotas.
 Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.
*/
  
  Scanner sc = new Scanner(System.in);

  Cliente clientes[];
  
        System.out.println("Ingrese la cantidad de clientes:");
        int cantidad = sc.nextInt();
  
  clientes = new Cliente[cantidad];
  
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Ingrese el nro de cliente " + i + ":");
            int nroCliente= sc.nextInt();
            
            System.out.println("Ingrese el nombre del cliente "+ i + ":");
             sc.nextLine();
            String nombre= sc.nextLine();
            
            System.out.println("Ingrese la antiguedad de cliente "+ i + ":");
            int antiguedad= sc.nextInt();
            
            System.out.println("Ingrese el nombre de la mascota "+ i + ":");
             sc.nextLine();
            String nombreM= sc.nextLine();
            
             System.out.println("Ingrese la edad de la mascota "+ i + ":");
            int edad= sc.nextInt();
            
            
            clientes[i]= new Cliente( nroCliente, nombre, antiguedad,nombreM, edad);
        }
        
        
  // Mostrar la cantidad de clientes
   System.out.println("Cantidad de clientes:" + cantidad);
   
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
 
        
  // Mostrar el promedio de edad de las mascotas
  double promedio = 0;
  double sumaEdad=0;
            for (int i = 0; i < clientes.length; i++) {
                if (clientes[i].getEdad() != 0) {
                    sumaEdad = clientes[i].getEdad() + sumaEdad;
                }
        }
  promedio= sumaEdad /clientes.length;
        System.out.println("Promedio de edad de las mascotas:" + promedio);


  // Informar cuántos clientes tienen una antigüedad mayor igual a 5 años
  
  int antmayor5 = 0;
  for (int i = 0; i < clientes.length; i++) {
            if (clientes[i].getAntigüedad() >= 5) {
                    antmayor5++;
      }
        }
  
        System.out.println("Cantidad de clientes que tienen una antiguedad "
                + "mayor/igual a 5 años: " + antmayor5 );
        
  
  
  
  
  
    }
    
}


package ejercicio1herencia;

import java.util.Scanner;


public class Ejercicio1Herencia {

    
    public static void main(String[] args) {
        
        
////        1. En un comercio se mantienen los datos de sus clientes, 
//algunos de los cuales son de confianza suficiente para comprar al fiado. 
//Programar dos clases llamadas Cliente y ClientePreferencial respectivamente 
//        aplicando herencia. Sobreescribir el método toString e incluir 
//                constructores con parámetros en cada una de ellas.
////De cada cliente se conoce su número, nombre y teléfono, mientras que de
//los clientes preferenciales se conoce adicionalmente su saldo, límite (saldo máximo)
//y su domicilio.

Scanner sc = new Scanner(System.in);

        Cliente clientes[];
  
        System.out.println("Ingrese la cantidad de clientes:");
        int cantidad = sc.nextInt();
  
  clientes = new Cliente[cantidad];
  
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Ingrese el nro de cliente " + i + ":");
            int numero= sc.nextInt();
            
            System.out.println("Ingrese el nombre del cliente "+ i + ":");
             sc.nextLine();
            String nombre= sc.nextLine();
            
            System.out.println("Ingrese el telefono del cliente "+ i + ":");
             sc.nextLine();
            String telefono= sc.nextLine();
            
            clientes[i]= new Cliente( numero, nombre, telefono);
            
            System.out.println(clientes[i].toString());
        }
        
        ClientePreferencial clientesP[];
  
        System.out.println("Ingrese la cantidad de clientes Preferenciales:");
        int cantidad2 = sc.nextInt();
  
  clientesP = new ClientePreferencial[cantidad];
  
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Ingrese el nro de cliente " + i + ":");
            int numero= sc.nextInt();
            
            System.out.println("Ingrese el nombre del cliente "+ i + ":");
             sc.nextLine();
            String nombre= sc.nextLine();
            
            System.out.println("Ingrese el telefono del cliente "+ i + ":");
             sc.nextLine();
            String telefono= sc.nextLine();
            
             System.out.println("Ingrese el domicilio del cliente "+ i + ":");
             sc.nextLine();
            String domicilio= sc.nextLine();
            
             System.out.println("Ingrese el limite del cliente "+ i + ":");
            Double limite= sc.nextDouble();
            
            System.out.println("Ingrese el saldo del cliente "+ i + ":");
            Double saldo= sc.nextDouble();
            
            clientesP[i]= new ClientePreferencial( saldo,limite, domicilio, numero, nombre, telefono );
            
        System.out.println(clientesP[i].toString());
        }
        
    }
    
}

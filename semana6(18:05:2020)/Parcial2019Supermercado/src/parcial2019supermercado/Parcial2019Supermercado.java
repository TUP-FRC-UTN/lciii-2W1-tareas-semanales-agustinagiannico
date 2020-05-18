
package parcial2019supermercado;

import java.util.Scanner;


public class Parcial2019Supermercado {

  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

  Folleto ofertas[];
  
        System.out.println("Ingrese la cantidad de articulos:");
        int cantidad = sc.nextInt();
  
  ofertas = new Folleto[cantidad];
  
        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Ingrese el nro de artículo " + i + ":");
            int nro= sc.nextInt();
            
            System.out.println("Ingrese el nombre del artículo "+ i + ":");
             sc.nextLine();
            String nombre= sc.nextLine();
            
            System.out.println("Ingrese el precio del artículo "+ i + ":");
            double precio= sc.nextDouble();
            
            System.out.println("Ingrese el precio de oferta "+ i + ":");
            double precioProm= sc.nextDouble();
            
           System.out.println("Ingrese la cantidad de días de la oferta "+ i + ":");
            int cantDias= sc.nextInt();
            System.out.println("Ingrese el stock de la oferta "+ i + ":");
            int stock= sc.nextInt();
            
            ofertas[i]= new Folleto(precioProm, cantDias, stock, nro, nombre, precio);
        }
        
        //1. Cantidad de artículos ofertados por más de 5 días.
        int mayor5dias = 0;
  for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i].getCantDias()> 5) {
                    mayor5dias++;
      }
        }
  
        System.out.println("Cantidad de artículos ofertados por más de 5 días:"
                + mayor5dias );
        
        
        //2. Total de unidades que hay a la venta (sumatoria del stock).
        double sumaStock=0;
            for (int i = 0; i < ofertas.length; i++) {
                if (ofertas[i].getStock() != 0) {
                    sumaStock = ofertas[i].getStock() + sumaStock;
                }
        }
        System.out.println("Total de unidades que hay a la venta: " + sumaStock);
     
     //3. Cantidad de artículos ofrecidos con un descuento superior a $20.
     
     int descMayor20 = 0;
  for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i].getPrecio()- ofertas[i].getPrecioProm() > 20) {
                    descMayor20++;
      }
        }
  
        System.out.println("Cantidad de artículos ofrecidos con un descuento superior a $20:"
                + descMayor20 );
        
/**  4. Total a recaudar por un artículo en particular indicado por su código,
* suponiendo que se vendan todas las unidades disponibles. */
      System.out.println("Total a recaudar por el artículo número: ");
int nroArt=sc.nextInt();
double total=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i].getNro()== nroArt) {
                total=ofertas[i].getPrecioProm()* ofertas[i].getStock();
                System.out.println("El total recaudado vendiendo todas las unidades: " 
                        + total);
                
            }
            
        }

      
      
    }
    
}

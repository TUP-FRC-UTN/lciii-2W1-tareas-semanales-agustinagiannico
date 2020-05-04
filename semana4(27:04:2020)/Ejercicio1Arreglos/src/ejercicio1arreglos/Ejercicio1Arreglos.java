
package ejercicio1arreglos;

import java.util.Scanner;

public class Ejercicio1Arreglos {

   
  
     
    public static void main(String[] args) {
        /** 1. Agregar a la clase Equipo (unidad 1) un arreglo con los datos
         *de los jugadores. De cada jugador se conoce su  nombre, posición 
         * (1: arquero, 2: defensor, 3: mediocampo, 4: delantero) número de camiseta,
         * cantidad de partidos jugados y porcentaje de estado físico 
         * (100 equivale a un jugador sano y 0 a uno imposibilitado de jugar por lesiones).
Desarrollar un programa que permita cargar todos los datos de un equipo 
* y a continuación informe:
 Cantidad de jugadores con menos de 10 partidos jugados.
 Nombre del jugador con mayor cantidad de partidos jugados.
 Promedio de estado físico de todo el equipo.
 Estado físico de un jugador particular identificado por número de camiseta.
 Promedio de partidos jugados de los jugadores de cada posición (4 resultados).
*/
        
        
        
        Scanner sc= new Scanner(System.in);
        
        Jugador equipo[];
        
        System.out.println("Ingrese cantidad de jugadores: ");
        int cantidad = sc.nextInt();
        
        equipo = new Jugador[cantidad];
        for (int i = 0; i < cantidad; i++) {
         
            System.out.println("Ingrese el nombre del jugador " + i + ":");
            sc.nextLine();
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese la posición del jugador " + i + ":");
            int posicion=sc.nextInt();
            
             System.out.println("Ingrese el nro de camiseta del jugador " + i + ":");
            int nroCamiseta=sc.nextInt();
            
             System.out.println("Ingrese la cantidad de partidos jugados " + i + ":");
            int cantPartidos=sc.nextInt();
            
             System.out.println("Ingrese el porcentaje de estado físico " + i + ":");
            int estadoFisico=sc.nextInt();
           
            equipo[i]= new Jugador(nombre,posicion,nroCamiseta,cantPartidos,estadoFisico);
        }
        
        for (int i = 0; i < equipo.length; i++) {
        System.out.println(equipo[i]);        
        }
         
// Cantidad de jugadores con menos de 10 partidos jugados
int cantMen10 = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getCantPartidos() < 10) {
                cantMen10++;
            }
        }
  System.out.println("Cantidad de jugadores con menos de 10 partidos jugados: " + cantMen10);

//Nombre del jugador con mayor cantidad de partidos jugados
Jugador jugMasPartGan = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if (jugMasPartGan.getCantPartidos() < equipo[i].getCantPartidos()) {
                
            }
        }
    System.out.println("Jugador con mayor cant de partidos jugados: " + jugMasPartGan);
        
//Promedio de estado físico de todo el equipo

double promedioEstFis = 0;
double sumaEstFis=0;
            for (int i = 0; i < equipo.length; i++) {
                if (equipo[i].getEstadoFisico() != 0) {
                    sumaEstFis = equipo[i].getEstadoFisico() + sumaEstFis;
                }
        }
  promedioEstFis= sumaEstFis /equipo.length;
        System.out.println("Promedio del estado físico de todo el equipo:" + promedioEstFis);

//Estado físico de un jugador particular identificado por número de camiseta
System.out.println("Estado físico del jugador con el nro de camiseta: ");
int nroCam=sc.nextInt();
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getNroCamiseta()== nroCam) {
                System.out.println("El estado fisico del jugador es del " + equipo[i].getEstadoFisico() + "%");
                
            }
            
        }


//Promedio de partidos jugados de los jugadores de cada posición (4 resultados).
//ARQUERO
   double promedioArq = 0;
   double sumaArq=0;
            for (int i = 0; i < equipo.length; i++) {
                if (equipo[i].getPosicion() == 1) {
                    sumaArq= equipo[i].getCantPartidos() + sumaArq;
                }
        }
  promedioArq= sumaArq /equipo.length;
        System.out.println("Promedio de partidos jugados en posición ARQUERO:" + promedioArq);
        
 //DEFENSOR
    double promedioDef = 0;
    double sumaDef=0;
            for (int i = 0; i < equipo.length; i++) {
                if (equipo[i].getPosicion() == 2) {
                    sumaDef= equipo[i].getCantPartidos() + sumaDef;
                }
        }
  promedioDef= sumaDef /equipo.length;
        System.out.println("Promedio de partidos jugados en posición DEFENSOR:" + promedioDef);
        
 //MEDIOCAMPO
    double promedioMed = 0;
    double sumaMed=0;
            for (int i = 0; i < equipo.length; i++) {
                if (equipo[i].getPosicion() == 3) {
                    sumaMed= equipo[i].getCantPartidos() + sumaMed;
                }
        }
  promedioMed= sumaMed /equipo.length;
        System.out.println("Promedio de partidos jugados en posición MEDIOCAMP0:" + promedioMed);
 //DELANTERO     
    double promedioDel = 0;
    double sumaDel=0;
            for (int i = 0; i < equipo.length; i++) {
                if (equipo[i].getPosicion() == 4) {
                    sumaDel= equipo[i].getCantPartidos() + sumaDel;
                }
        }
  promedioDel= sumaDel /equipo.length;
        System.out.println("Promedio de partidos jugados en posición DELANTERO:" + promedioDel);       
        
        
        
        
        
        
        
        
    }
    
}

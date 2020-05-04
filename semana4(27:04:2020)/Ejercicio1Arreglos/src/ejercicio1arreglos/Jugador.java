
package ejercicio1arreglos;

public class Jugador {
    String nombre;
    int posicion;
    int nroCamiseta;
    int cantPartidos;
    int estadoFisico;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosición(int posición) {
        this.posicion = posición;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public int getCantPartidos() {
        return cantPartidos;
    }

    public void setCantPartidos(int cantPartidos) {
        this.cantPartidos = cantPartidos;
    }

    public int getEstadoFisico() {
        return estadoFisico;
    }

    public void setEstadoFisico(int estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public Jugador(String nombre, int posicion, int nroCamiseta, int cantPartidos, int estadoFisico) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamiseta = nroCamiseta;
        this.cantPartidos = cantPartidos;
        this.estadoFisico = estadoFisico;
    
        } 
    public Jugador() {
       
    }   
    
//    public int jposicion(){ 
//          switch ( posicion ) {
//      case 1:
//           System.out.println( "Arquero" );
//           break;
//      case 2:
//           System.out.println( "Defensor");
//           break;
//      case 3:
//           System.out.println( "Mediocampo");
//           break;
//      case 4:
//           System.out.println( "Delantero" );
//           break;
//      default:
//           System.out.println("error" );
//           break;
//      }
//        return posicion;
//        }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", nroCamiseta=" + nroCamiseta + ", cantPartidos=" + cantPartidos + ", estadoFisico=" + estadoFisico + '}';
    }
    
    
    
    
}

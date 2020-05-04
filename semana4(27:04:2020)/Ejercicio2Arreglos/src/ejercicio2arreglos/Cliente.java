package ejercicio2arreglos;


public class Cliente {
    int nroCliente; 
    String nombre;
    int antigüedad;
    String nombreM;
    int edad;
    
    public int getNroCliente() {
        return nroCliente;
    }

    public void setNroCliente(int nroCliente) {
        this.nroCliente = nroCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cliente(int nroCliente, String nombre, int antigüedad, String nombreM, int edad) {
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.antigüedad = antigüedad;
        this.nombreM = nombreM;
        this.edad = edad;
    }
    
 
    
    
    @Override
    public String toString() {
        return "Cliente{" + "nroCliente=" + nroCliente + ", nombre=" + nombre + ", antig\u00fcedad=" + antigüedad + ", nombreM=" + nombreM + ", edad=" + edad + '}';
    }

 
    
    
    
}

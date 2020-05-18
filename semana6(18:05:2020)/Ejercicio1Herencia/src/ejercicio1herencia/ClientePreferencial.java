
package ejercicio1herencia;


public class ClientePreferencial extends Cliente {
    private double saldo;
      private double limite;
      private String domicilio;
      
    public ClientePreferencial (int numero,String nombre, String telefono)
    {
      super (numero, nombre, telefono);
     
    } 

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public ClientePreferencial(double saldo, double limite, String domicilio, int numero, String nombre, String telefono) {
        super(numero, nombre, telefono);
        this.saldo = saldo;
        this.limite = limite;
        this.domicilio = domicilio;
    }

    @Override
    public String toString() {
        return super.toString() +"ClientePreferencial{" + "saldo=" + saldo + ", limite=" + limite + ", domicilio=" + domicilio + '}';
    }
      
      
}

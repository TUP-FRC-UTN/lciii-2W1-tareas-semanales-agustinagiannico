
package parcial2019supermercado;

public class Folleto extends Articulo {
    private double precioProm;
    private int CantDias;
    private int stock;

    public Folleto(int nro, String nombre, double precio) {
        super(nro, nombre, precio);
    }

    public double getPrecioProm() {
        return precioProm;
    }

    public void setPrecioProm(double precioProm) {
        this.precioProm = precioProm;
    }

    public int getCantDias() {
        return CantDias;
    }

    public void setCantDias(int CantDias) {
        this.CantDias = CantDias;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Folleto(double precioProm, int CantDias, int stock, int nro, String nombre, double precio) {
        super(nro, nombre, precio);
        this.precioProm = precioProm;
        this.CantDias = CantDias;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.toString() + "Folleto{" + "precioProm=" + precioProm + ", CantDias=" + CantDias + ", stock=" + stock + '}';
    }

 
    
    
}

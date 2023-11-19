package dominio;
public class VehiculoTurismo {
    
    private String marca;
    private String modelo;
    private double precioBase;
    private int numeroPlazas;

    
    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.numeroPlazas = numeroPlazas;
    }

    
    public double calcularPrecioFinal() {
        double precioFinal;

        if (numeroPlazas <= 5) {
            precioFinal = precioBase;
        } else {
            int plazasExtras = numeroPlazas - 5;
            double aumento = 0.10 * plazasExtras;
            precioFinal = precioBase * (1 + aumento);
        }

        return precioFinal;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
}

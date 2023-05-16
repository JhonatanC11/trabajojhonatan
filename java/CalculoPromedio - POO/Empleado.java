public class Empleado {
    private String identificacion;
    private String nombre;
    private String area;
    private double[] ventas;

    public Empleado(String identificacion, String nombre, String area, double[] ventas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.area = area;
        this.ventas = ventas;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double venta : ventas) {
            suma += venta;
        }
        return suma / ventas.length;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArea() {
        return area;
    }
}

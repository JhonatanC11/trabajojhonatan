
import java.util.Scanner;
class Empleado {
    private String identificacion;
    private String nombre;
    private String area;
    private double semana1;
    private double semana2;
    private double semana3;

    public Empleado(String identificacion, String nombre, String area, double semana1, double semana2, double semana3) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.area = area;
        this.semana1 = semana1;
        this.semana2 = semana2;
        this.semana3 = semana3;
    }

    public double getTotalVentas() {
        return semana1 + semana2 + semana3;
    }
}
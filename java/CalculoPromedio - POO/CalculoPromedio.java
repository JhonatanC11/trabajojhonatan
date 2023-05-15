import java.util.ArrayList;
import java.util.Scanner;

public class CalculoPromedio {
    private ArrayList<Empleado> empleados;
    private double promedio;
    private double sumaTotal;

    public CalculoPromedio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el número de empleados a evaluar: ");
        int numeroEmpleados = scanner.nextInt();
        empleados = new ArrayList<>();
        sumaTotal = 0;

        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.print("Digite la identificación del empleado: ");
            String identificacion = scanner.next();
            System.out.print("Digite el nombre del empleado: ");
            String nombre = scanner.next();
            System.out.print("Digite el área encargada del empleado: ");
            String area = scanner.next();
            System.out.print("Digite el número de ventas en la semana 1 del empleado: ");
            double semana1 = scanner.nextDouble();
            System.out.print("Digite el número de ventas en la semana 2 del empleado: ");
            double semana2 = scanner.nextDouble();
            System.out.print("Digite el número de ventas en la semana 3 del empleado: ");
            double semana3 = scanner.nextDouble();

            Empleado empleado = new Empleado(identificacion, nombre, area, semana1, semana2, semana3);
            empleados.add(empleado);
            sumaTotal += empleado.getTotalVentas();

            System.out.println();
        }
    }

    public void calcularPromedioVentas() {
        promedio = sumaTotal / (empleados.size() * 3);
        System.out.println("El promedio de ventas de los empleados es de: " + promedio);
    }

    public static void main(String[] args) {
        CalculoPromedio calculoPromedio = new CalculoPromedio();
        calculoPromedio.calcularPromedioVentas();
    }
}
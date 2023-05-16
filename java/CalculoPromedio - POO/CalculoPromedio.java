import java.util.Scanner;
public class CalculoPromedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite el número de empleados a evaluar: ");
        int numeroEmpleados = input.nextInt();
        input.nextLine(); // Consumir el salto de línea

        Empleado[] empleados = new Empleado[numeroEmpleados];

        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.print("Digite la identificación del empleado: ");
            String identificacion = input.nextLine();

            System.out.print("Digite el nombre del empleado: ");
            String nombre = input.nextLine();

            System.out.print("Digite el área encargada del empleado: ");
            String area = input.nextLine();

            double[] ventas = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite el número de ventas en la semana " + (j + 1) + " del empleado: ");
                ventas[j] = input.nextDouble();
            }
            input.nextLine(); // Consumir el salto de línea

            Empleado empleado = new Empleado(identificacion, nombre, area, ventas);
            empleados[i] = empleado;

            System.out.println();
        }

        double promedio = 0;
        for (Empleado empleado : empleados) {
            promedio += empleado.calcularPromedio();
        }
        promedio /= numeroEmpleados;

        System.out.println("El promedio de ventas de los empleados es de: " + promedio);
    }
}
import java.util.Scanner;

public class CalculoPromedio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] identificaciones = new String[50];
        String[] nombres = new String[30];
        String[] areas = new String[30];
        double[] semana1 = new double[30];
        double[] semana2 = new double[30];
        double[] semana3 = new double[30];

        int numeroEmpleados, i;
        double Semana1, Semana2, Semana3, promedio = 0;

        System.out.print("Digite el número de empleados a evaluar: ");
        numeroEmpleados = input.nextInt();

        for (i = 0; i < numeroEmpleados; i++) {
            System.out.print("Digite la identificación del empleado: ");
            String identificacion = input.next();
            identificaciones[i] = identificacion;

            System.out.print("Digite el nombre del empleado: ");
            String nombre = input.next();
            nombres[i] = nombre;

            System.out.print("Digite el area encargada del empleado: ");
            String area = input.next();
            areas[i] = area;

            System.out.print("Digite el numero de ventas en la semana 1 del empleado: ");
            Semana1 = input.nextDouble();
            semana1[i] = Semana1;

            System.out.print("Digite el numero de ventas en la semana 2 del empleado: ");
            Semana2 = input.nextDouble();
            semana2[i] = Semana2;

            System.out.print("Digite el numero de ventas en la semana 3 del empleado: ");
            Semana3 = input.nextDouble();
            semana3[i] = Semana3;
            System.out.print("\n");
        }

        for (i = 0; i < numeroEmpleados; i++) {
            promedio += (semana1[i] + semana2[i] + semana3[i]) / 3;
        }
        promedio /= numeroEmpleados;
        
        System.out.println("El promedio de ventas de los empleados en 3 semanas es de: " + promedio);
    }
}
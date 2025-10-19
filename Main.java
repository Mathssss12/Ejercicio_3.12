/*Cree una clase llamada Empleado, que incluya tres variables de instancia:
un primer nombre (tipo String), un apellido paterno (tipo String) y un salario mensual (double).
Su clase debe tener un constructor que inicialice las tres variables de instancia.
Proporcione un método establecer y un método obtener para cada variable de instancia.
Si el salario mensual no es positivo, no establezca su valor.
Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
Cree dos objetos Empleado y muestre el salario anual de cada objeto.
Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.
 */

import javax.swing.*;

void main() {
    int opc;
    Scanner sc = new Scanner(System.in);

    String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del empleado 1:");
    String apellido1 = JOptionPane.showInputDialog("Ingrese el apellido del empleado 1:");
    String salarioTexto1 = JOptionPane.showInputDialog("Ingrese el salario del empleado 1:");
    double salario1 = Double.parseDouble(salarioTexto1);

    Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);


    System.out.print("SALARIO DE EMPLEADOS\n");

    String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del empleado 2:");
    String apellido2 = JOptionPane.showInputDialog("Ingrese el apellido del empleado 2:");
    String salarioTexto2 = JOptionPane.showInputDialog("Ingrese el salario del empleado 2:");
    double salario2 = Double.parseDouble(salarioTexto2);

    Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

    // Mostrar datos iniciales - EMPLEADO 1
    System.out.println("\n--- DATOS INICIALES EMPLEADO 1 ---");
    empleado1.PruebaEmpleado();

    // Mostrar datos iniciales - EMPLEADO 2
    System.out.println("\n--- DATOS INICIALES EMPLEADO 2 ---");
    empleado2.PruebaEmpleado();

    // Aplicar aumento del 10%
    empleado1.darAumento(10);
    empleado2.darAumento(10);

    // Mostrar datos después del aumento - EMPLEADO 1
    System.out.println("\n--- EMPLEADO 1 DESPUES DEL AUMENTO ---");
    empleado1.PruebaEmpleado();

    // Mostrar datos después del aumento - EMPLEADO 2
    System.out.println("\n--- EMPLEADO 2 DESPUES DEL AUMENTO ---");
    empleado2.PruebaEmpleado();

}



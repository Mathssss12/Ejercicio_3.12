import javax.swing.*;

public class Empleado {
    String nombre;
    String apellido;
    double salario;

    /*Creacion de constructores*/

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;

        if (salario <= 0) {
            System.out.println("Dato incorrecto");
            this.salario = 0.0;
        } else {
            this.salario = salario;
        }
    }
    /*Creacion de getter and setter*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    /*Metodos del programador*/

    public void setSalario(double salario) {
        if (salario < 0){
            System.out.print("Dato incorrecto");
        }

        this.salario = salario;
    }

    // Método para dar aumento
    public void darAumento(double porcentaje) {
        this.salario = this.salario * (1 + porcentaje/100);
    }

    // Método para imprimir datos del empleado
    public void PruebaEmpleado() {
        String mensaje = "\nDatos del Empleado:\n" +
                "Nombre: " + this.nombre + "\n" +
                "Apellido: " + this.apellido + "\n" +
                "Salario Mensual: $" + String.format("%.2f", this.salario) + "\n" +
                "Salario Anual: $" + String.format("%.2f", (this.salario * 12));

        JOptionPane.showMessageDialog(null, mensaje);

    }
}

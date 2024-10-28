package clasesempresa;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<Empleado>();
    }

    public void contratarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public int getTotalempleados() {
        return empleados.size();
    }

    public void nombreSalario() {
        for (Empleado e : empleados) {
            System.out.println("Nombre: " + e.getNombre() + " Salario: " + e.getSalario());
        }
    }

    public double getTotalSalarios() {
        double total = 0;
        for (Empleado e : empleados) {
            total = total + e.getSalario();
        }
        return total;
    }

    public void EmpMayorSalario() {
        Empleado empMayorSalario = empleados.get(0);
        double mayorSalario = empleados.get(0).getSalario();
        for (Empleado e : empleados) {
            if (e.getSalario() > mayorSalario) {
                mayorSalario = e.getSalario();
                empMayorSalario = e;
            }
        }

        System.out.println("Nombre: " + empMayorSalario.getNombre() + " Salario: " + empMayorSalario.getSalario());
    }

    public void EmpMenorSalario() {
        Empleado empMenorSalario = empleados.get(0);
        double menorSalario = empleados.get(0).getSalario();
        for (Empleado e : empleados) {
            if (e.getSalario() > menorSalario) {
                menorSalario = e.getSalario();
                empMenorSalario = e;
            }
        }

        System.out.println("Nombre: " + empMenorSalario.getNombre() + " Salario: " + empMenorSalario.getSalario());
    }
}

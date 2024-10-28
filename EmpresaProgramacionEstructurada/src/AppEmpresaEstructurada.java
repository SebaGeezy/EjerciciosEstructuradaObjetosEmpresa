import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppEmpresaEstructurada{
    public static void main(String[] args) throws Exception {
        ArrayList<String> nombres = new ArrayList<String>();
        ArrayList<String> cargos = new ArrayList<String>();
        ArrayList<Double> salarios = new ArrayList<Double>();

        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de empleados:"));

        for(int emp = 0; emp < cantidad; emp++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del empleado ");
            String cargo = JOptionPane.showInputDialog(null, "Ingrese el cargo del empleado ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el salario del empleado"));

            //almacenamiento de datos
            nombres.add(nombre);
            cargos.add(cargo);
            salarios.add(salario);
        }

        System.out.println("La cantidad de empleados es: " + cantidad);

        System.out.println("Los nombres y salario de los empleados son; ");
        for(int emp = 0; emp < cantidad; emp++) {
            System.out.println("Nombre: "+ nombres.get(emp) + "Salario: " + salarios.get(emp));
        }

        double total=0;
        for(int emp = 0; emp < cantidad; emp++) {
            total = total + salarios.get(emp);
        }

        System.out.println("El total del salario pagado es: " + total);

        System.out.println("El empleado que mas dinero gana es: ");
        double mayorSalario = salarios.get(0);
        int pocision = 0; 
        for(int emp = 1; emp < cantidad; emp++) {
            if(salarios.get(emp) > mayorSalario) {
                mayorSalario = salarios.get(emp);
                pocision = emp; 
            }
        }

        System.out.println("Nombre : " + nombres.get(pocision) + " Cargo " + cargos.get(pocision) + " Salario: " + salarios.get(pocision));

        System.out.println("El empleado que menos dinero gana es: ");
        double menorSalario = salarios.get(0);
        int pocision1 = 0; 
        for(int emp = 1; emp < cantidad; emp++) {
            if(salarios.get(emp) > menorSalario) {
                menorSalario = salarios.get(emp);
                pocision1 = emp; 
            }
        }

        System.out.println("Nombre : " + nombres.get(pocision1) + " Cargo " + cargos.get(pocision1) + " Salario: " + salarios.get(pocision1));
    }
}
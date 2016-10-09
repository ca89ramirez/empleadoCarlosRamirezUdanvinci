package empleado;

/**
 * @author carlosramirezvelazquez
 * @version 1.0
 */
public class PruebaEmpleado {
    public static void main (String [] args){
        Empleado empleado0= new Empleado(" "," ",0 );

        empleado0.setNombre("Franz");
        empleado0.setApellido("Beckenbauer");
        empleado0.setSalarioMensual(40000.00);
        
        //Obtiene e imprime nombre
        String nombre;
        nombre = empleado0.getNombre();
        System.out.println("Nombre:" + nombre);
        
        //Obtiene e imprime el apellido paterno
        String apellidoPaterno;
        apellidoPaterno= empleado0.getApellido();
        System.out.print("Apellido Paterno:");
        System.out.println(apellidoPaterno);
        
        //Obtiene e imprime el salario mensual
        Double salarioMensual;
        salarioMensual = empleado0.getSalarioMensual();
        System.out.print("Salario Mensual:");
        System.out.println(salarioMensual);
        
        //Obtiene e imprime el salario anual
        Double salarioAnual;
        salarioAnual = empleado0.getSalarioAnual();
        System.out.println("Salario Anual:" + salarioAnual);
        
        //Obtiene e imprime el aumento del 10%
        Double aumento;
        aumento = empleado0.getAumento();
        System.out.println("Salario con Aumento 10%:" + aumento);
       
         System.out.println("********************************");
        
        Empleado empleado1 = new Empleado(" ", " ", 0);
        
        empleado1.setNombre("Víctor");
        empleado1.setApellido("Godinez");
        empleado1.setSalarioMensual(2500.00);
        
        //Obtiene e imprime nombre
        String nombre1;
        nombre1 = empleado1.getNombre();
        System.out.println("Nombre:" + nombre1);
        
        //Obtiene e imprime el apellido paterno
        String apellidoPaterno1;
        apellidoPaterno1 = empleado1.getApellido();
        System.out.println ("Apellido Paterno:" + apellidoPaterno1);
        
        //Obtiene e imprime el salario mensual
        Double salarioMensual1;
        salarioMensual1 = empleado1.getSalarioMensual();
        System.out.println("Salario Mensual: " + salarioMensual1);
        
        //Obtiene e imprime el salario anual
        Double salarioAnual1;
        salarioAnual1 = empleado1.getSalarioAnual();
        System.out.println("Salario Anual: " + salarioAnual1);
        
        //Obtiene e imprime el aumento del 10%
        Double aumento1;
        aumento1 = empleado1.getAumento();
        System.out.println("Salario Anual con Aumento: " + aumento1);
        
       
    }
}

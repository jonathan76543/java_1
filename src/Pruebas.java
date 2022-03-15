
public class Pruebas{

    public static void main(String[] args) {

        Empleados trabajador1=new Empleados("Paco");

        Empleados trabajador2=new Empleados("Ana");

        trabajador1.cambiaSeccion("RRHH");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());

    }
}



class Empleados<string>{

    public Empleados(String nom){

        nombre=nom;

        seccion="Administracion";
    }

   
    public void cambiaSeccion(String seccion){//setter

       this.seccion=seccion;

    }   
    public <string> String devuelveDatos(){

        return "El nombre es:"+ nombre +"//la seccion es:"+ seccion;
 
     }   


    private final String nombre;

    private String seccion;

    

}   
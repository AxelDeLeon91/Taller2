package logica.alumnos;
import logica.inscripciones.AsignCursadas;
public class Alumno {
     private int cedula;
     private String nombre;
     private String apellido;
     private String domicilio;
     private int telefono;
     private int asignaprobadas;
     private AsignCursadas cursadas;
     
   public Alumno () 
   {
	   cedula= 0;
	   nombre= null;
	   apellido= null;
	   domicilio= null;
	   telefono= 0;
	   asignaprobadas= 0;
	   cursadas= new AsignCursadas();
   }
   
   public Alumno (int c, String n, String a, String d, int t)
   {
	   cedula= c;
	   nombre= n;
	   apellido= a;
	   domicilio= d;
	   telefono= t;
	   asignaprobadas= 0;
	   cursadas= new AsignCursadas();
   }
   
   public int getCedula ()
   {
	   return cedula;
   }
   
   public String getNombre ()
   {
	   return nombre;
   }
   
   public String getApellido ()
   {
	   return apellido;
   }
   
   public String getDomicilio ()
   {
	   return domicilio;
   }
   
   public int getTelefono ()
   {
	   return telefono;
   }
   
   public int getAsignAprobadas ()
   {
	   return asignaprobadas;
   }
   
   public AsignCursadas getAsignCursadas ()
   {
	   return cursadas;
   }
   
   public void aumentarAsignAprobadas ()
   {
	   asignaprobadas++;
   }
   
   public String getTipo ()
   {
	   return ("Alumno");
   }
   
   public double calcularMonto (int a)
   {
	   return cursadas.calcularMontoAño (a);
   }
   
}

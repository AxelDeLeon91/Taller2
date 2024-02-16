package logica.inscripciones;
import logica.asignaturas.Asignatura;
public class Inscripcion {
     private int numero;
     private int año;
     private double montobase;
     int calificacion;
     Asignatura asigninscripta;
     
   public Inscripcion ()
   {
	   numero= 0;
	   año= 0;
	   montobase= 0.0;
	   calificacion= 0;
	   asigninscripta= null;
   }
   
   public Inscripcion (int n, int a,double m, Asignatura asig)
   {
	   numero=n;
	   año=a;
	   montobase=m;
	   calificacion=0;
	   asigninscripta=asig;
   }
   
   public int getNumero ()
   {
	   return numero;
   }
   
   public int getAño ()
   {
	   return año;
   }
   
   public double getMontoBase ()
   {
	   return montobase;
   }
   
   public int getCalificacion ()
   {
	   return calificacion;
   }
   
   public Asignatura getAsignaturaInsc ()
   {
	   return asigninscripta;
   }
   
   public void setCalificacion (int c)
   {
	   calificacion=c;
   }
   
   
}

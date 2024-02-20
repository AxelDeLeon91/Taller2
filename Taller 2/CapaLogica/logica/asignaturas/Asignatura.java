package logica.asignaturas;

public class Asignatura {
     private String codigo;
     private String nombre;
     private String descripcion;
     private static int contador;
     
   public Asignatura ()
   {
	   codigo= null;
	   nombre= null;
	   descripcion= null;
	   contador++;
   }
   
   public Asignatura (String c, String n, String d)
   {
	   codigo=c;
	   nombre=n;
	   descripcion=d;
	   contador++;
   }
   
   public String getCodigo ()
   {
	   return codigo;
   }
   
   public String getNombre ()
   {
	   return nombre;
   }
   
   public String getDescripcion ()
   {
	   return descripcion;
   }
   
   public static int cantInstancias ()
   {
	   return contador;
   }
   
  
}

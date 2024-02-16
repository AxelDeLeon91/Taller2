package logica.asignaturas;

public class Asignatura {
     private String codigo;
     private String nombre;
     private String descripcion;
     
   public Asignatura ()
   {
	   codigo= null;
	   nombre= null;
	   descripcion= null;
   }
   
   public Asignatura (String c, String n, String d)
   {
	   codigo=c;
	   nombre=n;
	   descripcion=d;
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
   
  
}

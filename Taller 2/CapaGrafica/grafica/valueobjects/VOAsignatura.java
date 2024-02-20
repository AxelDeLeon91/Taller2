package grafica.valueobjects;

public class VOAsignatura {
          private String codigo;
          private String nombre;
          private String descripcion;
          
     public VOAsignatura ()
     {
    	 codigo= null;
    	 nombre= null;
    	 descripcion= null;
     }
     
     public VOAsignatura (String c, String n, String d)
     {
    	 codigo= c;
    	 nombre= n;
    	 descripcion= d;
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
     
     public String toString1()
     {
    	 String resu;
    	 resu= '\n'+ "Codigo: "+codigo+", "+"Nombre: "+nombre+", "+"Descripcion: "+descripcion;
    	 return resu;
     }
     
  
}

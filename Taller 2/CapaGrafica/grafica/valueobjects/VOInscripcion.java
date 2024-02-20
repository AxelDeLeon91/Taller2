package grafica.valueobjects;

public class VOInscripcion {
         private int numero;
         private int año;
         private double montobase;
         private int calificacion;
         private VOAsignatura asigninscripta;
         
     public VOInscripcion ()
     {
    	 numero= 0;
    	 año= 0;
    	 montobase= 0.0;
    	 calificacion= 0;
    	 asigninscripta= null;
     }
     
     public VOInscripcion (int n, int a, double m, VOAsignatura asig)
     {
    	 numero= n;
    	 año= a;
    	 montobase= m;
    	 calificacion= 0;
    	 asigninscripta= asig;
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
     
     public void setCalificacion (int c)
     {
    	 calificacion= c;
     }
     
     public VOAsignatura getAsignaturaInsc ()
     {
    	 return asigninscripta;
     }
     
     public String toString1 ()
     {
    	 String resu;
    	 resu='\n'+ "Numero: "+numero+ ", "+ "Nombre: "+asigninscripta.getNombre()+ ", "+ "Anio: "+año+ ", "+ "Calificacion: "+calificacion;
    	 return resu;
     }
     
     public String toString2 ()
     {
    	 String resu;
    	 resu= toString1()+ ", "+ "Monto base: "+montobase;
    	 return resu;
     }
     
}

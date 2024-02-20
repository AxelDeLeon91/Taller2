package grafica.valueobjects;

public class VOAlumno {
       private int cedula;
       private String nombre;
       private String apellido;
       private String domicilio;
       private int telefono;
       private int asignaprobadas;
       private double promediototal;
       private double promedioaprobadas;
       
    public VOAlumno ()
    {
    	cedula= 0;
    	nombre= null;
    	apellido= null;
    	domicilio= null;
    	telefono= 0;
    	asignaprobadas= 0;
    	promediototal= 0.0;
    	promedioaprobadas= 0.0;
    }
    
    public VOAlumno (int c, String n, String a, String d, int t)
    {
    	cedula= c;
    	nombre= n;
    	apellido= a;
    	domicilio= d;
    	telefono= t;
    	asignaprobadas=0;
    	promediototal= 0.0;
    	promedioaprobadas= 0.0;
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
    
    public double getPromTotal ()
    {
    	return promediototal;
    }
    
    public double getPromAprob ()
    {
    	return promedioaprobadas;
    }
    
    public void setAsignAprobadas (int n)
    {
    	asignaprobadas= n;
    }
    
    public void setPromedioTotal (double p)
    {
    	promediototal= p;
    }
    
    public void setPromedioAprobadas (double p)
    {
    	promedioaprobadas= p;
    }
    
    public String getTipo ()
    {
    	return ("Alumno");
    }
    
    public String toString1 ()
    {
    	String resu;
    	resu='\n'+ "Apellido: "+apellido+", " +"Nombre: "+nombre+", " + "Cedula: "+cedula+", " + "Tipo: "+getTipo();
    	return resu;
    }
    
    public String toString2 ()
    {
    	String resu;
    	resu='\n'+ "Cedula: "+cedula+", "+"Nombre: "+nombre+", "+"Apellido: "+apellido+", "+"Domicilio: "+domicilio+", "+"Telefono: "+telefono+", "+"Asignaturas aprobadas: "+asignaprobadas+", "+"Tipo: "+getTipo();
    	return resu;
    }
    
    public String toString3 ()
    {
    	String resu;
    	resu='\n'+"Apellido: "+apellido+", " +"Nombre: "+nombre+", " + "Cedula: "+cedula;
    	return resu;
    }
    
    public String toString4 ()
    {
    	String resu;
    	resu=toString3() + ", "+ "Promedio total: "+promediototal+", "+ "Promedio aprobadas: "+promedioaprobadas+'\n';
    	return resu;
    }
    
}


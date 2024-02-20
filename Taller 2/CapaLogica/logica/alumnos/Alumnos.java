package logica.alumnos;
import java.util.*;
import grafica.valueobjects.VOAlumno;
import grafica.valueobjects.VOBecado;
public class Alumnos {
	 private static Alumnos instancia;
     private TreeMap <Integer,Alumno> alumnos; 
     private Iterator <Alumno> iter;
     
    private Alumnos ()
    {
    	alumnos= new TreeMap<>();
    }
    
    public static Alumnos getInstancia ()
    {
    	if(instancia==null)
    		instancia=new Alumnos();
    	return instancia;
    }
    
    public void insert (Alumno a)
    {
    	alumnos.put(a.getCedula(), a);
    }
    
    public boolean member (int c)
    {
    	return alumnos.containsKey(c);
    }
    
    public boolean esVacio ()
    {
    	return alumnos.isEmpty();
    }
    
    public Alumno find (int c)
    {
    	return alumnos.get(c);
    }
    
    public ArrayList<VOAlumno> listarAlumApellido (String a)
    {
    	ArrayList<VOAlumno> voalum= new ArrayList<>();
    	iter=alumnos.values().iterator();
    	while(iter.hasNext())
    	{
    		Alumno aux= iter.next();
    		if(aux.getApellido().startsWith(a))
    		{
    			if(aux.getTipo()=="Alumno")
    			{
    				VOAlumno voaux= new VOAlumno (aux.getCedula(),aux.getNombre(),aux.getApellido(),aux.getDomicilio(),aux.getTelefono());
    				voaux.setAsignAprobadas(aux.getAsignAprobadas());
    				voalum.add(voaux);
    			}
    			else
    			{
    				Becado auxbecado= (Becado) aux;
    				VOAlumno voaux= new VOBecado (auxbecado.getCedula(),auxbecado.getNombre(),auxbecado.getApellido(),auxbecado.getDomicilio(),auxbecado.getTelefono(),auxbecado.getDescuento(),auxbecado.getRazon());
    				voaux.setAsignAprobadas(auxbecado.getAsignAprobadas());
    				voalum.add(voaux);
    			}
    		}
    	}
    	return voalum;
    }
    
    public ArrayList<VOAlumno> listarEgresados ()
    {
    	ArrayList<VOAlumno> voalum= new ArrayList<>();
    	iter=alumnos.values().iterator();
    	while(iter.hasNext())
    	{
    		Alumno aux= iter.next();
    		if(aux.getAsignAprobadas()==10)
    		{
    			VOAlumno voaux= new VOAlumno (aux.getCedula(),aux.getNombre(),aux.getApellido(),aux.getDomicilio(),aux.getTelefono());
    			voaux.setPromedioTotal(aux.getAsignCursadas().promedioTotal());
    			voaux.setPromedioAprobadas(aux.getAsignCursadas().promedioAprobadas());
    			voalum.add(voaux);
    		}
    	}
    	return voalum;
    }
}

package logica.inscripciones;
import grafica.valueobjects.VOInscripcion;
import grafica.valueobjects.VOAsignatura;
import java.util.*;
public class AsignCursadas {
     private LinkedList <Inscripcion> inscripciones; 
     private Iterator <Inscripcion> iter;
     
    public AsignCursadas ()
    {
    	inscripciones= new LinkedList<>();
    }
    
    public boolean estaAprobada (String c)
    {
    	iter= inscripciones.iterator();
    	boolean esta=false;
    	while (iter.hasNext() && !esta)
    	{
    		Inscripcion ins= iter.next();
    		if (ins.getAsignaturaInsc().getCodigo()==c)
    		{ 			
    		    if (ins.getCalificacion()>=6)
    			esta=true;
    		}
    	}
    	return esta;		
    }
    
    public boolean estaCursando (String c)
    {
    	iter= inscripciones.iterator();
    	boolean esta=false;
    	while (iter.hasNext() && !esta)
    	{
    		Inscripcion ins= iter.next();
    		if (ins.getAsignaturaInsc().getCodigo()==c)
    		{
    			if(ins.getCalificacion()==0)
    				esta=true;
    		}
    	}
    	return esta;
    }
    
    public boolean esVacia ()
    {
    	return inscripciones.size() == 0;
    }
    
    public Inscripcion ultimaCursada ()
    {
    	return inscripciones.getLast();
    }
    
    public void insert (Inscripcion ins)
    {
    	inscripciones.add (ins);
    }
    
    public Inscripcion find (int n)
    {
    	return inscripciones.get(n-1);
    }
    
    public double calcularMontoAño (int a)
    {
    	iter= inscripciones.iterator();
    	double monto=0.0;
    	while(iter.hasNext())
    	{
    		Inscripcion ins= iter.next();
    		if (ins.getAño()==a)
    			monto= monto + (ins.getMontoBase()* 9); 
    	}
    	return monto;
    }
    
    public double promedioTotal () 
    {
    	int cantidad= inscripciones.size();
    	int calificaciontotal= 0;
    	iter= inscripciones.iterator();
    	while(iter.hasNext())
    	{
    		Inscripcion ins= iter.next();
    		calificaciontotal= calificaciontotal + ins.getCalificacion();
    	}
    	return (double) calificaciontotal / cantidad;
    }
    
    public double promedioAprobadas () 
    {
     	int cantidad= inscripciones.size();
    	int calificaciontotal= 0;
    	iter=inscripciones.iterator();
    	while(iter.hasNext())
    	{
    		Inscripcion ins= iter.next();
    		if (ins.getCalificacion()>=6)
    			calificaciontotal= calificaciontotal + ins.getCalificacion();
    	}
    	return (double) calificaciontotal / cantidad;
    }
    
   public ArrayList<VOInscripcion> listadoCompleto ()
   {
	   ArrayList <VOInscripcion> voinsc= new ArrayList<>();  
	   iter=inscripciones.iterator();
	   while(iter.hasNext())
   	  {
   		Inscripcion insaux= iter.next();
   		VOAsignatura asigaux= new VOAsignatura (insaux.getAsignaturaInsc().getCodigo(),insaux.getAsignaturaInsc().getNombre(),insaux.getAsignaturaInsc().getDescripcion());
   		VOInscripcion voaux= new VOInscripcion (insaux.getNumero(),insaux.getAño(),insaux.getMontoBase(),asigaux);
   		voaux.setCalificacion(insaux.getCalificacion());
   		voinsc.add(voaux);
   	  }
   	  return voinsc;
   }
   
   public ArrayList<VOInscripcion> listadoParcial ()
   {
	   ArrayList <VOInscripcion> voinsc= new ArrayList<>();  
	   iter=inscripciones.iterator();
	   while(iter.hasNext())
   	  {
   		Inscripcion insaux= iter.next();
   		if(insaux.getCalificacion()!=0)
   		{
   		    VOAsignatura asigaux= new VOAsignatura (insaux.getAsignaturaInsc().getCodigo(),insaux.getAsignaturaInsc().getNombre(),insaux.getAsignaturaInsc().getDescripcion());
   		    VOInscripcion voaux= new VOInscripcion (insaux.getNumero(),insaux.getAño(),insaux.getMontoBase(),asigaux);
   		    voaux.setCalificacion(insaux.getCalificacion());
   		    voinsc.add(voaux);
   		}
   	  }
   	  return voinsc;
   }
    
}

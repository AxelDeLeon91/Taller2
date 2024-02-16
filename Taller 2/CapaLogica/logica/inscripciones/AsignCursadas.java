package logica.inscripciones;
import java.util.*;
public class AsignCursadas {
     private LinkedList <Inscripcion> inscripciones; 
     private Iterator <Inscripcion> iter;
     
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
    
    public  promedioTotalyAprob () //implementar
    {
    	
    }
}

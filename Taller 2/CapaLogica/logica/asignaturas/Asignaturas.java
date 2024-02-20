package logica.asignaturas;
import java.util.*;
import grafica.valueobjects.VOAsignatura;

public class Asignaturas {
	  private static Asignaturas instancia;
	  private ArrayList <Asignatura> asignaturas;
      private Iterator <Asignatura> iter;
      
    private Asignaturas() {
        asignaturas = new ArrayList<>(); 
    }
    
    public static Asignaturas getInstancia ()
    {
    	if (instancia==null)
    		instancia = new Asignaturas();
    	return instancia;
    }

    public void insert (Asignatura a)
    {
    	asignaturas.add(a);
    }
    
    public boolean existe (String c)
    {
    	iter= asignaturas.iterator();
    	boolean existe= false;
    	while (iter.hasNext() && !existe)
    	{
    		Asignatura asig=iter.next();
    		if(asig.getCodigo()==c)
    			existe=true;
    	}
    	return existe;
    }
     
    public boolean estaVacia ()
    {
    	if (asignaturas.isEmpty())
    		return true;
    	else
    		return false;
    }
    
    public Asignatura find (String c)
    {
    	iter= asignaturas.iterator();
    	boolean existe= false;
    	Asignatura asig=null;
    	while (iter.hasNext() && !existe)
    	{
    		asig=iter.next();
    		if(asig.getCodigo()==c)
    			existe=true;
    	}
    	return asig;
    }
     
    public  ArrayList<VOAsignatura> listarAsign ()
    {
    	ArrayList <VOAsignatura> voasig= new ArrayList<>();
    	iter=asignaturas.iterator();
    	while(iter.hasNext())
    	{
    		Asignatura aux= iter.next();
    		VOAsignatura voaux= new VOAsignatura (aux.getCodigo(),aux.getNombre(),aux.getDescripcion());
    		voasig.add(voaux);
    	}
    	return voasig;
    }
}


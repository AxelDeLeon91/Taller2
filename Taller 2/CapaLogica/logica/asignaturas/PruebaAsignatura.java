package logica.asignaturas;
import grafica.valueobjects.*;
import java.util.*;
@SuppressWarnings("unused")
public class PruebaAsignatura {
	public static void main (String [] args)
	{
		//Pruebo Asignatura
		System.out.println("\nPrueba de asignatura\n");
		Asignatura asig1 = new Asignatura() ; //Pruebo el constructor por defecto
		System.out.println(asig1.getCodigo()+("\n")+asig1.getNombre()+("\n")+asig1.getDescripcion()); //Pruebo las selectoras
		Asignatura asig2= new Asignatura("C09L","Zurcido","Zurcen las cosas"); //Pruebo el constructor comun
		System.out.println(asig2.getCodigo()+("\n")+asig2.getNombre()+("\n")+asig2.getDescripcion()); //Pruebo las selectoras
		
		//Pruebo Asignaturas
		System.out.println("\nPrueba de secuencia asignaturas\n");
		Asignaturas a= Asignaturas.getInstancia(); //Pruebo el getInstancia que me crea la secuencia de asignaturas si no existe, sino, devuelve la ya creada
		if(a.estaVacia()) //Pruebo si esta vacia
			System.out.println("Esta Vacia");
		if(!a.existe("C09L")) //Pruebo el existe
		{
		   a.insert(asig2); //Como no va a existir pruebo el insertar asignatura
		   System.out.println("Insertado");
		}
		else
			System.out.println("No insertado");
		if(!a.existe("C09L")) //Pruebo el existe
		{
		   a.insert(asig2);
		   System.out.println("Insertado");
		}
		else
			System.out.println("No insertado"); //Va a existir por lo que no lo inserto
		
		if(!a.estaVacia()) //Pruebo si no esta vacia
			System.out.println("No esta vacia");
		
		//Ingreso todas las asignaturas
		Asignatura asig3= new Asignatura("ABL2","Bordado","Bordan las cosas");
		Asignatura asig4= new Asignatura("AD30","Corte","Cortan las cosas");
		Asignatura asig5= new Asignatura("AUI3","Tejidos","Tejen las cosas");
		Asignatura asig6= new Asignatura("OUI1","Costura","Costuran las cosas");
		Asignatura asig7= new Asignatura("DALP2","Teñido","Tiñen las cosas");
		Asignatura asig8= new Asignatura("12IU","Moldes","Moldan las cosas");
		Asignatura asig9= new Asignatura("DSQW","Botones","Botonean las cosas");
		Asignatura asig10;
		if(Asignatura.cantInstancias()<10) //Pregunto si esta llena obteniendo la cantidad de asignaturas creadas (no lo estara por lo que puedo ingresar otra asignatura)
		   asig10= new Asignatura("934O","Cierres","Cierran las cosas");
		else
			System.out.println("No se pueden ingresar mas");
		if(Asignatura.cantInstancias()<10) //Pregunto si esta llena obteniendo la cantidad de asignaturas creadas (lo estara por lo que no puedo crear otra asignatura)
			   asig10= new Asignatura("45LO","Test","Testean las cosas");
			else
				System.out.println("No se pueden ingresar mas");
		
		a.insert(asig3);a.insert(asig4);a.insert(asig5);a.insert(asig6);a.insert(asig7);a.insert(asig8);
		a.insert(asig9);
		Asignatura aux= a.find("ABL2"); //Pruebo el find, deberia asginarme asig3
		System.out.println(aux.getCodigo()+("\n")+aux.getNombre()+("\n")+aux.getDescripcion());
		
		
	   //Pruebo VOAsignatura
		System.out.println("\nPrueba del value object asignatura\n");
		VOAsignatura voasig= new VOAsignatura(); //Pruebo el constructor por defecto
		System.out.println(voasig.getCodigo()+("\n")+voasig.getNombre()+("\n")+voasig.getDescripcion()); //Pruebo las selectoras
		VOAsignatura voasig2= new VOAsignatura(asig3.getCodigo(),asig3.getNombre(),asig3.getDescripcion()); //Pruebo el constructor comun
		System.out.println(voasig2.getCodigo()+("\n")+voasig2.getNombre()+("\n")+voasig2.getDescripcion()); //Pruebo las selectoras
		System.out.println(voasig2.toString1()); //Pruebo el mostrar (tostring1)
		
		
		//Pruebo el listarAsign 
		System.out.println("\nPrueba de devolver un array de voasignaturas\n");
		ArrayList <VOAsignatura> voasignaturas=a.listarAsign();  //Creo el arraylist que me devolveran cargado con los voasignaturas de Asignaturas
		Iterator <VOAsignatura> iter=voasignaturas.iterator(); //Aca creo y cargo el iterador para poder recorrer el arraylist
		while (iter.hasNext())
		{
			voasig=iter.next();
			System.out.println(voasig.toString1()); //Muestro los datos de cada elemento del iterador 
		}
		
		//Testeado Correctamente
	}
}

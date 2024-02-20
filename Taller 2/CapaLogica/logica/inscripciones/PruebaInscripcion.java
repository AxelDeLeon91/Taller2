package logica.inscripciones;
import java.text.DecimalFormat;
import java.util.*;
import logica.asignaturas.Asignatura;
import grafica.valueobjects.*;

public class PruebaInscripcion {
	public static void main (String [] args)
	{
		//Pruebo Inscripcion
		System.out.println("\nPrueba de inscripcion\n");
		Inscripcion ins1= new Inscripcion (); //Pruebo el constructor por defecto
		System.out.println(ins1.getNumero()+("\n")+ins1.getAño()+("\n")+ins1.getMontoBase()+("\n")+ins1.getCalificacion()+("\n")); //Pruebo selectoras
		Asignatura asig= new Asignatura("C09L","Zurcido","Zurcen las cosas"); //Creo una asignatura
		Inscripcion ins2= new Inscripcion (1,2019,100.0,asig); //Pruebo el constructor comun
		System.out.println(ins2.getNumero()+("\n")+ins2.getAño()+("\n")+ins2.getMontoBase()+("\n")+ins2.getCalificacion()+("\n")); //Pruebo selectoras
		Asignatura asig2=ins2.getAsignaturaInsc();  //Pruebo la selectora que obtiene la asignatura inscripta
		System.out.println(asig2.getCodigo()+("\n")+asig2.getNombre()+("\n")+asig2.getDescripcion()); //Invoco las selectoras de asignatura
		ins2.setCalificacion(7); //Pruebo la setter de calificacion
		System.out.println("Despues de asignarle la calificacion: \n" +ins2.getCalificacion());
		
		//Pruebo AsignCursadas
		System.out.println("\nPrueba de la secuencia de asignaturas cursadas\n");
		AsignCursadas c= new AsignCursadas(); //Pruebo constructor por defecto
		
		//Creo 6 inscripciones para probar
		Asignatura asig3= new Asignatura("ABL2","Bordado","Bordan las cosas");
		Asignatura asig4= new Asignatura("AD30","Corte","Cortan las cosas");
		Asignatura asig5= new Asignatura("AUI3","Tejidos","Tejen las cosas");
		Asignatura asig6= new Asignatura("OUI1","Costura","Costuran las cosas");
		Asignatura asig7= new Asignatura("DALP2","Teñido","Tiñen las cosas");
		Inscripcion ins3= new Inscripcion (2,2019,100.0,asig3);
		Inscripcion ins4= new Inscripcion (3,2019,200.0,asig4);
		Inscripcion ins5= new Inscripcion (4,2019,250.0,asig5);
		Inscripcion ins6= new Inscripcion (5,2019,150.0,asig6);
		Inscripcion ins7= new Inscripcion (6,2019,180.0,asig7);
		Inscripcion ins8= new Inscripcion (7,2020,100.0,asig3);
		
		if(c.esVacia()) //Pruebo si la secuencia de inscripciones esta vacia 
			System.out.println("Esta vacia"); 
		
		//Ingreso la primera inscripcion que cree + las nuevas 6
		c.insert(ins2);
		c.insert(ins3);
		c.insert(ins4);
		c.insert(ins5);
		c.insert(ins6);
		c.insert(ins7);
		
		
		if(c.estaCursando("AUI3")) //Pruebo si esta cursando la asignatura asig5 (deberia)
			System.out.println("Esta cursando");
		else
			System.out.println("No esta cursando");
		
		//Asigno calificaciones aprobadas a ins4,ins5,ins6,ins7 y notas desaprobadas a ins3
		c.find(3).setCalificacion(8);
		c.find(4).setCalificacion(9);
		c.find(5).setCalificacion(8);
		c.find(6).setCalificacion(6);
		c.find(2).setCalificacion(4);
		
		if(c.estaCursando("AUI3")) //Ahora que le ingrese la calificacion aprobada deberia no esta cursando y estar aprobada
		   System.out.println("Esta cursando");
		else
			System.out.println("No esta cursando");
		
		if(c.estaAprobada("AUI3")) //Deberia estar aprobada
			System.out.println("Esta Aprobada");
		
		if(c.estaAprobada("ABL2")) //No deberia estar aprobada porque la perdio y tampoco la esta cursando
			System.out.println("Esta aprobada");
		else
			System.out.println("No esta aprobada");
		
		if(c.estaCursando("ABL2")) 
			   System.out.println("Esta cursando");
			else
				System.out.println("No esta cursando");
		
		if(c.esVacia()) //Pruebo si la secuencia de inscripciones esta vacia (no deberia)
			System.out.println("Esta vacia"); 
		else
			System.out.println("No esta vacia");
		
		System.out.println(c.ultimaCursada().getNumero()); //Pruebo si funciona la selectora de la ultima asignatura que curso
		
		//Le inscribo en la asignatura que perdio y se la apruebo
		c.insert(ins8);
		
		DecimalFormat decimal= new DecimalFormat("#.##"); //Esto es para que no se impriman tantos numeros despues de la coma (,)
		
		System.out.println(c.calcularMontoAño(2019)); //Pruebo a calcular el monto de un año ingresado
		
		System.out.println(decimal.format(c.promedioAprobadas())); //Pruebo a obtener el promedio de las asignaturas aprobadas
		
		System.out.println(decimal.format(c.promedioTotal())); //Pruebo a obtener el promedio de las asignaturas totales
		
		//Pruebo VOInscripcion
		System.out.println("\nPrueba de voinscripcion\n");
		VOInscripcion voins= new VOInscripcion (); //Pruebo constructor por defecto
		System.out.println(voins.getNumero()+("\n")+voins.getAño()+("\n")+voins.getMontoBase()+("\n")+voins.getCalificacion()+("\n"));  //Pruebo las selectoras
		VOAsignatura voasig= new VOAsignatura ("TEST1","Prueba","Prueba de asignatura");
		VOInscripcion voins2= new VOInscripcion (ins3.getNumero(),ins3.getAño(),ins3.getMontoBase(),voasig); //Pruebo constructor comun
		System.out.println(voins2.getNumero()+("\n")+voins2.getAño()+("\n")+voins2.getMontoBase()+("\n")+voins2.getCalificacion()+("\n")+voins2.getAsignaturaInsc().getCodigo()+("\n"));  //Pruebo las selectoras
		System.out.println(voins2.toString1()); //Pruebo el mostrar 1 (tostring1)
		System.out.println(voins2.toString2()); //Pruebo el mostrar 2 (tostring2)
		
		//Pruebo los listados (parcial y completo)
		System.out.println("\nPrueba de devolver los array de voinscripciones\n"); 
		System.out.println("\nPrueba del listado completo\n"); 
		ArrayList <VOInscripcion> voinscripciones=c.listadoCompleto(); //Pruebo el listado completo
		Iterator <VOInscripcion> iter= voinscripciones.iterator();
		while(iter.hasNext())
		{
			voins=iter.next();
			System.out.println(voins.toString2());
		}
		System.out.println("\nPrueba del listado parcial\n"); 
		ArrayList <VOInscripcion> voinscripciones2=c.listadoParcial(); //Pruebo el listado parcial
		Iterator <VOInscripcion> iter2= voinscripciones2.iterator();
		while(iter2.hasNext())
		{
			voins=iter2.next();
			System.out.println(voins.toString1());
		}
		
		//Testeado Correctamente
	}
}

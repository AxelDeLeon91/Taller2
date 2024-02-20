package logica.alumnos;

import java.util.*;

import grafica.valueobjects.VOAlumno;
import grafica.valueobjects.VOBecado;
import logica.asignaturas.Asignatura;
import logica.inscripciones.*;

public class PruebaAlumno {
	public static void main (String [] args)
	{
		//Pruebo Alumno
		System.out.println("\nPrueba de alumno\n");
		Alumno a1= new Alumno(); //Pruebo constructor por defecto
		System.out.println(a1.getCedula()+("\n")+a1.getNombre()+("\n")+a1.getApellido()+("\n")+a1.getDomicilio()+("\n")+a1.getTelefono()+("\n")+a1.getAsignAprobadas()); //Pruebo las selectoras
		Alumno a2= new Alumno(53902526,"Alex","Gomez","Simon del Pino",98553443); //Pruebo constructor comun
		System.out.println(a2.getCedula()+("\n")+a2.getNombre()+("\n")+a2.getApellido()+("\n")+a2.getDomicilio()+("\n")+a2.getTelefono()+("\n")+a2.getAsignAprobadas()); //Pruebo las selectoras
		Asignatura asig1= new Asignatura("ABL2","Bordado","Bordan las cosas"); // Creo algunas asignaturas para ingresar inscripciones
		Asignatura asig2= new Asignatura("AD30","Corte","Cortan las cosas");
		Asignatura asig3= new Asignatura("AUI3","Tejidos","Tejen las cosas");
		Inscripcion ins1= new Inscripcion (1,2019,100.0,asig1); //Creo las inscripciones para ingresar a la secuencia AsignCursadas
		Inscripcion ins2= new Inscripcion (2,2019,200.0,asig2);
		Inscripcion ins3= new Inscripcion (3,2019,250.0,asig3);
		a2.getAsignCursadas().insert(ins1); //Inserto las inscripciones en la secuencia
		a2.getAsignCursadas().insert(ins2);
		a2.getAsignCursadas().insert(ins3);
		AsignCursadas ac= a2.getAsignCursadas(); //Obtengo su secuencia de asigncursadas
		if(ac.estaCursando("ABL2")) //Pruebo si la inscripcion se ingreso en la secuencia
		{
		  System.out.println("Esta cursando");	
		}
		ins1.setCalificacion(8); //Ingreso calificacion
		a2.aumentarAsignAprobadas(); //Aumento la cantidad de asignaturas aprobadas de ese alumno
		System.out.println(a2.getAsignAprobadas());
		System.out.println(a2.getTipo()); //Pruebo el getTipo
		System.out.println(a2.calcularMonto(2019)); //Pruebo el calcular monto
		
		//Pruebo Becado
		System.out.println("\nPrueba de becado\n");
		Alumno a3= new Becado (); //Pruebo constructor por defecto
		System.out.println(a3.getCedula()+("\n")+a3.getNombre()+("\n")+a3.getApellido()+("\n")+a3.getDomicilio()+("\n")+a3.getTelefono()+("\n")+a3.getAsignAprobadas()+("\n")+((Becado)a3).getDescuento()+("\n")+((Becado)a3).getRazon()); //Pruebo las selectoras	
		Alumno a4= new Becado (49543545,"Jose","Perez","CaraCara",954555654,25.0,"Sorteo"); //Pruebo constructor comun
		System.out.println(a4.getCedula()+("\n")+a4.getNombre()+("\n")+a4.getApellido()+("\n")+a4.getDomicilio()+("\n")+a4.getTelefono()+("\n")+a4.getAsignAprobadas()+("\n")+((Becado)a4).getDescuento()+("\n")+((Becado)a4).getRazon()); //Pruebo las selectoras
		a4.getAsignCursadas().insert(ins1); //Inserto las inscripciones en la secuencia
		a4.getAsignCursadas().insert(ins2);
		a4.getAsignCursadas().insert(ins3);
		ac= a4.getAsignCursadas(); //Obtengo su secuencia de asigncursadas
		if(ac.estaCursando("AUI3")) //Pruebo si la inscripcion se ingreso en la secuencia
		{
		  System.out.println("Esta cursando");	
		}
		ins3.setCalificacion(6); //Ingreso calificacion
		a4.aumentarAsignAprobadas(); //Aumento la cantidad de asignaturas aprobadas de ese alumno
		System.out.println(a4.getAsignAprobadas());
		System.out.println(a4.getTipo()); //Pruebo el getTipo
		System.out.println(a4.calcularMonto(2019)); //Pruebo el calcular monto
		
		
		//Pruebo Alumnos
		System.out.println("\nPrueba del diccionario alumnos\n");
		Alumnos al= Alumnos.getInstancia(); //Pruebo el getInstancia que me crea el diccionario alumnos si no existe, sino, devuelve el ya creado
		//Creo 4 alumnos para ingresar (2 alumnos y 2 becados)
		Alumno a5= new Alumno (53902526,"Alex","Gomez","Simon del Pino",98553443);
		Alumno a6= new Alumno (53902527,"Axel","Pereira","Simon del Palo",98553444);
		Alumno a7= new Becado (49543545,"Jose","Perez","CaraCara",954555654,25.0,"Sorteo"); 
		Alumno a8= new Becado (49543546,"Juan","Pastilla","Parabela",954555655,26.4,"Competicion");
		if(!al.member(53902526)) //Consulto si es miembro el a5 (no deberia)
			System.out.println("No es miembro");
		if(al.esVacio()) //Consulto si el arbol esta vacio (deberia)
			System.out.println("El diccionario esta vacio");
		al.insert(a5); //Inserto los alumnos en el diccionario
		al.insert(a6);
		al.insert(a7);
		al.insert(a8);
		if(!al.member(53902526))//Consulto si es miembro el a5 (ahora si deberia)
			System.out.println("No es miembro");
		else
			System.out.println("Es miembro");
		if(al.esVacio()) //Consulto si el arbol esta vacio (ahora no deberia)
			System.out.println("El diccionario esta vacio");
		else
			System.out.println("El diccionario no esta vacio");
		System.out.println(al.find(53902526).getNombre()); //Pruebo el find 
		
		
		//Pruebo VOAlumno
		System.out.println("\nPrueba del voalumno\n");
		VOAlumno voa1= new VOAlumno (); //Pruebo el constructor por defecto
		System.out.println(voa1.getCedula()+("\n")+voa1.getNombre()+("\n")+voa1.getApellido()+("\n")+voa1.getDomicilio()+("\n")+voa1.getTelefono()+("\n")+voa1.getAsignAprobadas()); //Pruebo las selectoras
		VOAlumno voa2= new VOAlumno (53902526,"Alexis","Vazquez","Simon del Paso",955646744); //Pruebo el constructor comun
		System.out.println(voa2.getCedula()+("\n")+voa2.getNombre()+("\n")+voa2.getApellido()+("\n")+voa2.getDomicilio()+("\n")+voa2.getTelefono()+("\n")+voa2.getAsignAprobadas()); //Pruebo las selectoras
		voa2.setAsignAprobadas(a2.getAsignAprobadas()); // Pruebo la setter de asignaprobadas
		System.out.println(voa2.getAsignAprobadas());
		voa2.setPromedioAprobadas(12.0); //Pruebo los setter del promedio
		voa2.setPromedioTotal(6.0);
		System.out.println(voa2.getPromAprob()+"\n"+voa2.getPromTotal()); //Pruebo las selectoras de promedio
		System.out.println(voa2.getTipo()); //Pruebo el getTipo
		//Pruebo los mostrar (toString)
		System.out.println(voa2.toString1());
		System.out.println(voa2.toString2());
		System.out.println(voa2.toString3());
		System.out.println(voa2.toString4());
		
		
		//Pruebo VOBecado
		System.out.println("\nPrueba del vobecado\n");
		VOAlumno vob1= new VOBecado (); //Pruebo el constructor por defecto
		System.out.println(vob1.getCedula()+("\n")+vob1.getNombre()+("\n")+vob1.getApellido()+("\n")+vob1.getDomicilio()+("\n")+vob1.getTelefono()+("\n")+vob1.getAsignAprobadas()+("\n")+((VOBecado)vob1).getDescuento()+("\n")+((VOBecado)vob1).getRazon()); //Pruebo las selectoras
		VOAlumno vob2= new VOBecado (49543545,"Jose","Perez","CaraCara",954555654,25.0,"Sorteo"); //Pruebo constructor comun
		System.out.println(vob2.getCedula()+("\n")+vob2.getNombre()+("\n")+vob2.getApellido()+("\n")+vob2.getDomicilio()+("\n")+vob2.getTelefono()+("\n")+vob2.getAsignAprobadas()+("\n")+((VOBecado)vob2).getDescuento()+("\n")+((VOBecado)vob2).getRazon()); //Pruebo las selectoras
		vob2.setPromedioAprobadas(10.0);//Pruebo setters y selectoras de la clase padre
		vob2.setPromedioTotal(5.3);
		System.out.println(vob2.getPromAprob()+"\n"+vob2.getPromTotal()); 
		vob2.setAsignAprobadas(1);
		System.out.println(vob2.getAsignAprobadas());
		System.out.println(vob2.getTipo()); //Pruebo el getTipo
		//Pruebo el mostrar (toString2)
		System.out.println(vob2.toString2()); 
		
		
		//Pruebo los listados 
		System.out.println("\nPrueba de devolver los array de voalumnos\n");
		System.out.println("\nPruebo el listar alum apellido\n");
		ArrayList <VOAlumno> voalumnos = al.listarAlumApellido("Pe"); //Pruebo el listarAlumApellido
		Iterator <VOAlumno> iter= voalumnos.iterator();
		while(iter.hasNext())
		{
			voa1=iter.next();
			System.out.println(voa1.toString1());
		}
		a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();
		a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();a5.aumentarAsignAprobadas();
		a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();
		a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();a8.aumentarAsignAprobadas();
		
		ArrayList <VOAlumno> voalumnos2 =al.listarEgresados(); //Pruebo el listarEgresados
		Iterator <VOAlumno>iter2= voalumnos2.iterator();
		while(iter2.hasNext())
		{
			voa1=iter2.next();
			System.out.println("\nListado parcial\n");
			System.out.println(voa1.toString3()); //Listado parcial
			System.out.println("\nListado completo\n");
			System.out.println(voa1.toString4()); //Listado completo
		}
		
		//Testeado Correctamente
	}
}

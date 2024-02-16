package logica.alumnos;

public class Becado extends Alumno{
        private double descuento;
        private String razon;
        
     public Becado ()
     {
    	 super ();
    	 descuento= 0.0;
    	 razon= null;
     }
     
     public Becado (int c, String n, String a, String d, int t, double des, String r)
     {
    	 super (c,n,a,d,t);
    	 descuento= des;
    	 razon= r;
     }
     
     public double getDescuento ()
     {
    	 return descuento;
     }
     
     public String getRazon ()
     {
    	 return razon;
     }
     
     public String getTipo ()
     {
    	 return ("Becado");
     }
     
     public double calcularMonto (int a)
     {
    	 double monto= super.calcularMonto(a);
    	 double restar= (descuento / 100.0)* monto;
    	 return (monto - restar);
     }
}

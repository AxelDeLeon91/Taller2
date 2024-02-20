package grafica.valueobjects;

public class VOBecado extends VOAlumno{
     private double descuento;
     private String razon;
   
   public VOBecado ()
   {
	   super ();
	   descuento= 0.0;
	   razon= null;
   }
   
   public VOBecado (int c, String n, String a, String d, int t, double des, String r)
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
   
   public String toString2 ()
   {
	   String resu;
	   resu= super.toString2() + ", "+ "Descuento: "+ descuento+ ", "+ "Razon: "+ razon;
	   return resu;
   }
   
}

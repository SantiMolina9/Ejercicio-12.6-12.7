
package ejercicio.pkg12.pkg6;

public class TablaDispersaEnlazada {
   static final int TAMTABLA = 97;
   private double factorCarga;
   private int numElementos;
   Elemento[] tabla;
   static final double R = 0.618034;
   static int dispersion(long x){
         double t;
         int v;
         t = R * x - Math.floor(R * x); // parte decimal
         v = (int) (TAMTABLA * t);
         return v;
}
   public TablaDispersaEnlazada(){  
    tabla = new Elemento[TAMTABLA];
    for (int k = 0; k < TAMTABLA; k++)
    tabla[k] = null;
    numElementos = 0;
}
   public void insertar(Jugador s){
    int posicion;
    Elemento nuevo;
    posicion = dispersion(s.getCodigo());
    nuevo = new Elemento(s);
    nuevo.sgte = tabla[posicion];
    tabla[posicion] = nuevo;
        numElementos++;
}
    
    public void eliminar(int codigo){
        int posicion;
        Elemento anterior = null, actual = null;
        posicion = dispersion(codigo);
    if (tabla[posicion] != null){ // no está vacío
    anterior = null;
    actual = tabla[posicion];
    while ((actual.sgte != null) &&
    actual.getJugador().getCodigo() != codigo)
    {
    anterior = actual;
    actual = actual.sgte;
    }
    }
    if (actual.getJugador().getCodigo() != codigo){
System.out.println("No se encuentra en la tabla el socio "
+ codigo);
    }
else{
    anterior.sgte = actual.sgte;
    actual = null;
    numElementos--;}
}
    
    public Elemento buscar(int codigo){
        Elemento p = null;
        int posicion;
        posicion = dispersion(codigo);
        if (tabla[posicion] != null)
        {
        p = tabla[posicion];
        while ((p.sgte != null) && p.jugador.codigo != codigo){
        p = p.sgte;
        if (p.jugador.codigo != codigo){
             p = null;
        }
        }
        }
          return p;
}
    
    
}   
   


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12.pkg6;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Ejercicio126 {
    
    public static void pause(){
    System.out.println("");
    System.out.println("================================");
    System.out.println("Presione una tecla para continuar...");
    new java.util.Scanner(System.in).nextLine();
  }
    
    public static void clear() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
    
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        TablaDispersaEnlazada abm = new TablaDispersaEnlazada();
        String op, nombre, apellido;
        int edad, codigo,c;
        String clubActual;
        //Jugador de prueba
        Jugador jugador1 = new Jugador("Santiago",21,"River",123);
        
        do{
            System.out.println("1- Para dar de alta un jugador");
            System.out.println("2- Para dar de baja un jugador");
            System.out.println("3- Para buscar un jugador");
            System.out.println("0- Para salir");
            op = leer.nextLine();
            switch(op){
                case "1": 
                    System.out.println("Ingrese el nombre del jugador");
                    nombre = leer.nextLine();
                    System.out.println("Ingrese el apellido del jugador");
                    apellido = leer.nextLine();
                    System.out.println("Ingrese la edad del jugador");
                    edad = leer.nextInt();
                    System.out.println("Ingrese el club actual del jugador");
                    clubActual = leer.nextLine();
                    leer.nextLine();
                    System.out.println("Ingrese el codigo de identificacion");
                    codigo = leer.nextInt();
                    leer.nextLine();
                    //Instancio un jugador con los datos ingresados por el usuario
                    Jugador j = new Jugador(nombre, edad, clubActual, codigo);
                    //Inserto un jugador
                    abm.insertar(j);
                    pause();
                    clear();
                    break;
                case "2":
                    System.out.println("Ingrese el codigo del jugador que desea eliminar");
                     c = leer.nextInt();
                    abm.eliminar(c);
                    pause();
                    clear();
                    break;
                case "3":
                   System.out.println("Ingrese el codigo del jugador que desea buscar");
                        c = leer.nextInt();
                        Elemento r;
                        r = abm.buscar(c);
                        System.out.println("El nombre del jugador es: " + r.jugador.getNombre());
                        System.out.println("Su edad es: " + r.jugador.getEdad());
                        System.out.println("Su club actual es: " + r.jugador.getClubActual());
                        System.out.println("Su codigo es: " + r.jugador.getCodigo());
                        System.out.println("Presione una tecla para continuar...");
                        leer.nextLine();
                        clear();
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
            }
        }while(!"0".equals(op));
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;


import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author PersonaL-CTI
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        //variables
        String nombre;
        String posicion;
        int edad;
        int contador = 1;
        double estatura;
        boolean bandera = true;
        String cadena = "";
        int salida;
        
        do {
            //ingreso de datos
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la posicion en la que juega");
            posicion = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            //cadena
            cadena = String.format("%s%s. %s, %s, edad: %s, estatura: %s\n"
                     ,cadena, contador,  nombre, posicion, edad, estatura);
            
            contador = contador + 1;
            
            System.out.println("Ingrese -1 para presentar datos");
            salida = entrada.nextInt();
            entrada.nextLine();
            if (salida == -111) {
                bandera = false;
            }
        } while (bandera);
        System.out.printf("%s\n", cadena);
    }
    
}

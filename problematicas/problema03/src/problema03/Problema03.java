/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 1;
        int numeroInicial = 2;
        int suma = 0;
        String cadenaFinal = "";
        int limite = 37;
        do{ 

            numeroInicial = (suma + numeroInicial);
            cadenaFinal = String.format("%s%s ", cadenaFinal, numeroInicial);
            contador = contador + 2;
            suma = contador;
    } while (numeroInicial < limite);       
        System.out.printf("%s\n", cadenaFinal);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int contador = 1;
        int numeroInicial = 2;
        int suma = 0;
        String cadenaFinal = " ";
        int limite = 110;
        while (numeroInicial < limite) {
            numeroInicial = (suma + numeroInicial);
            cadenaFinal = String.format("%s%s ", cadenaFinal, numeroInicial);
            contador = contador + 1;
            suma = contador * 2;
        }
        System.out.printf("%s\n",cadenaFinal);
    }
    
}

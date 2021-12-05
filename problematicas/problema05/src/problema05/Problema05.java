/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author PersonaL-CTI
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        int limite = 15;
        int numerador = 1;
        int denominador = 1;
        int denominador2 = 3;
        String simbolo;
        String cadena = " ";

        do {
            simbolo = "-";
            if (denominador == 5 || denominador == 9 || denominador == 13) {
                simbolo = "+";
            }

            cadena = String.format("%s%s %d/%d ",
                    cadena,
                    simbolo,
                    numerador,
                    denominador);
            denominador = denominador + 2;

        } while (denominador <= limite);

        System.out.println(cadena);
    }

}

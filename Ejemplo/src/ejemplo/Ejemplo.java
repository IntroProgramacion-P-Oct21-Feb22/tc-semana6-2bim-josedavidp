/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;
import org.apache.commons.lang3.RandomUtils;
/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroInicial = 100;
        int numeroFinal = 110;

        int[] datos = obtenerNumero(numeroInicial, numeroFinal);

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%d\n", datos[i]);
        }

    }

    public static int[] obtenerNumero(int a, int b) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = RandomUtils.nextInt(a, b);
        }

        return numeros;
    }
}

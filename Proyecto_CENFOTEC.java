package ejercicios;
import java.io.*; // se agrega las caracateristicas de entrada y salidad de java
import java.util.Scanner;

import javax.swing.plaf.SliderUI;

public class Proyecto_CENFOTEC {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
    float liquidacion;
    float salario_mensual;
    float salario_pendiente;
    float vacaciones_ngozadas;
    float aguinaldo_proporcional;
    float preaviso;
    float cesantia;

        System.out.println("Digite su salario mensualmente");
        salario_mensual = input.nextFloat();
        System.out.println("Su salario mensual: "+ salario_mensual);
        salario_pendiente= salario_mensual;
        System.out.println("Salario pendiente: "+salario_pendiente);
        vacaciones_ngozadas= salario_mensual/30*14;
        System.out.println("Vacaciones no gozadas: "+vacaciones_ngozadas);
        aguinaldo_proporcional= salario_mensual/12;
        System.out.println("Aguinaldo proporcional: "+ aguinaldo_proporcional);
        preaviso= salario_mensual;
        System.out.println("Preaviso: "+preaviso);
        cesantia= salario_mensual/30*40*2;
        System.out.println("Cesantia: "+ cesantia);
        liquidacion= salario_pendiente+vacaciones_ngozadas+aguinaldo_proporcional+preaviso+cesantia;
        System.out.println("Su liquidacion equivale a: " +liquidacion);
    }
}

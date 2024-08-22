package package1;
import java.util.*;
public class Atividade6_ConverterTemp {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira a temperatura em graus Celsius:");
	double tempCel = sc.nextDouble();
	double tempFah = (tempCel * 1.8) + 32;
	System.out.println("A temperatura convertida em Fahrenheit é " + tempFah);
	
 }
}
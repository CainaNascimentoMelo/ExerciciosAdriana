package package1;
import java.util.*;
public class Atividade8_PositivoNegativo {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira um valor númerico:");
    double valNumero = sc.nextDouble();
    
	if (valNumero >= 0) {
		System.out.println("O valor inserido é positivo!");	
	} else {	
		System.out.println("O valor inserido é negativo!");	
		
  }
 }
}
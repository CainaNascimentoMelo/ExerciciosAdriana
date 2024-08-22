package package1;
import java.util.*;
public class Atividade12_ComparaMaiorValor {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Digite o primeiro valor númerico:");
	int valorNum1 = input.nextInt();
	System.out.println("Digite o segundo valor númerico:");
	int valorNum2 = input.nextInt();
			
	if (valorNum1 > valorNum2) {
		System.out.println("O primeiro número é maior que o segundo número");
	} else {
		System.out.println("O segundo número é maior que o primeiro número");
	}
			
 }
}
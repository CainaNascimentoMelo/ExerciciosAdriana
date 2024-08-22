package package1;
import java.util.*;
public class Atividade13_ValoresCrescentes {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Digite o primeiro valor númerico:");
	int valorNum1 = input.nextInt();
	System.out.println("Digite o segundo valor númerico:");
	int valorNum2 = input.nextInt();
		
	if (valorNum1 < valorNum2) {
	    System.out.println(valorNum1 + "," + valorNum2);		
	}else {
		System.out.println(valorNum2 + "," + valorNum1);			
	}
		
 }
}
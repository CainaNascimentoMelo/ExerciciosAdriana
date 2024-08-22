package package1;
import java.util.*;
public class Atividade4_CarroCustoFinal {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Escreva o valor do custo de fábrica:");
	double custoFabrica = sc.nextDouble();
	double porcDistribuidor = custoFabrica * 0.28;
	double imposto = custoFabrica * 0.45;
	double custoFinal = custoFabrica + (porcDistribuidor + imposto);
	
	System.out.println("O custo final do carro é R$" + custoFinal);
	
 }
}

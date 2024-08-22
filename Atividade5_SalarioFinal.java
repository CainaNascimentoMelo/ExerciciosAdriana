package package1;
import java.util.*;
public class Atividade5_SalarioFinal {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Escreva o salário fixo da funcionário:");
	double salarioFixo = sc.nextDouble();
	System.out.println("Escreva a quantidade de carros vendidos pelo funcionário:");
	double quantiCarros = sc.nextDouble();
	System.out.println("Escreva o valor recebido por cada carro:");
	double valorCarros = sc.nextDouble();
	System.out.println("Escreva o valor total de vendas realizadas:");
    double totalVendas = sc.nextDouble();
    
    double porcVendas = 0.05 * totalVendas;
    double salarioTotal = salarioFixo + (quantiCarros * valorCarros) + porcVendas;
    System.out.println("O salário final do funcionário é " + salarioTotal);
	
 }
}
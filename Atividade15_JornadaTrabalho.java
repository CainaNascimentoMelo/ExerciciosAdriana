package package1;
import java.util.*;
public class Atividade15_JornadaTrabalho {
public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Quantas horas foram trabalhadas durantes o mês:");
	int horasTrabMes = input.nextInt();
	System.out.println("Digite o salário por hora:");
	double salarioHora = input.nextDouble();

	if (horasTrabMes > 160) {
	    double salarioTotal = salarioHora * 160 + ((horasTrabMes - 160) * salarioHora * 1.5);
	    System.out.println("O salario do mês do funcionario é R$" + salarioTotal);
	} else {
		double salarioTotal = salarioHora * horasTrabMes;
		System.out.println("O salario do mês do funcionario é R$" + salarioTotal);
	}	
		
 }
}

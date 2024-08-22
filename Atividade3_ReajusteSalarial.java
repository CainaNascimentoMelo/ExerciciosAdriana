package package1;
import java.util.*;
public class Atividade3_ReajusteSalarial {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Escreva o salário mensal do funcionário:");
	double salario = sc.nextDouble();
	System.out.println("Escreva o reajuste salarial do funcionário:");
	double reajuste = sc.nextDouble();
	
	double novoSalario = salario - ((reajuste * salario) / 100);
	System.out.println("O novo salário do funcionário é RS$" + novoSalario);
	
 }
}

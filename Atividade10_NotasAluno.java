package package1;
import java.util.*;
public class Atividade10_NotasAluno {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira a primeira nota do aluno:");
	double nota1 = sc.nextDouble();
	System.out.println("Insira a segunda nota do aluno:");
	double nota2 = sc.nextDouble();
    double notaTotal = (nota1 + nota2) / 2;
    
    if (notaTotal >= 6) {
    	System.out.println("O aluno foi aprovado! sua nota é " + notaTotal);
    } else {
        System.out.println("O aluno foi reprovado! sua nota é " + notaTotal);
    }

 }
}


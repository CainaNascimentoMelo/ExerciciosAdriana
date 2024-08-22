package package1;
import java.util.*;
public class Atividade11_AnoVotacao {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Digite seu ano de nascimento:");
	int anoNascimento = input.nextInt();
	System.out.println("Digite o ano atual:");
	int anoAtual = input.nextInt();
		
	if (anoAtual - anoNascimento >= 18) {
		System.out.println("Você tem idade para votar este ano!");
	} else {
		System.out.println("Você não tem idade para votar este ano!");
	}
		
 }
}
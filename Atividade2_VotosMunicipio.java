package package1;
import java.util.*;
public class Atividade2_VotosMunicipio {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Escreva a quantidade de eleitores no munícipio:");
	int eleitores = sc.nextInt();
	System.out.println("Escreva a quantidade de votos brancos no munícipio:");
	int brancos = sc.nextInt();
	System.out.println("Escreva a quantidade de votos nulos no munícipio:");
	int nulos = sc.nextInt();
	System.out.println("Escreva a quantidade de votos válidos no munícipio:");
	int validos = sc.nextInt();
	
	double porcBranco = ((brancos * 100) / eleitores);
	double porcNulos = ((nulos * 100) / eleitores);
	double porcValidos = ((validos * 100) / eleitores);
	
	System.out.println("A porcentagem de votos brancos no município é " + porcBranco + "%");
	System.out.println("A porcentagem de votos nulos no município é " + porcNulos + "%");
	System.out.println("A porcentagem de votos valídos no município é " + porcValidos + "%");
	
 }
}

package package1;
import java.util.*;
public class Atividade1_AnosMesesDias {
public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Digite sua idade em anos, meses e dias, respectivamente:");
	int anos = sc.nextInt() * 365;
	int meses = sc.nextInt() * 30;
	int dias = sc.nextInt();
	
	int idadeFinal = anos + meses + dias;
	System.out.println("Sua idade total em dias é " + idadeFinal);

 }
}

package package1;
import java.util.*;
public class Atividade9_MaçasCompradas {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Insira a quantia de maçãs compradas:");
	int quantMaca = sc.nextInt();
	double valTotal = 0;
	
	if (quantMaca < 12) {
	    valTotal = 1.3 * quantMaca;
    } else if (quantMaca >= 12) {
        valTotal = quantMaca;
        
    }    
    System.out.println("O valor total da venda é R$" + valTotal); 
        
 }
}
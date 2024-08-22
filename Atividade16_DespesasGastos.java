package package1;
import java.util.*;
public class Atividade16_DespesasGastos {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double janeiro = 15000; 
	double fevereiro = 23000; 
	double marco = 17000; 
	
	double totalGasto = janeiro + fevereiro + marco;
	System.out.println("Os gastos do primeiro trimestre é R$" + totalGasto);
	System.out.println("Os gastos do primeiro trimestre é R$" + totalGasto / 3);

 }
}
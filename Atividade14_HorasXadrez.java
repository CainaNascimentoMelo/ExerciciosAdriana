package package1;
import java.util.*;
public class Atividade14_HorasXadrez {
public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	System.out.println("Digite a hora de início da partida(Utilize a forma de horário militar e considere meia noite como 00):");
	int horaInicio = input.nextInt();
	System.out.println("Digite a hora de termíno da partida:");
	int horaTermino = input.nextInt();
		
	if (horaInicio < horaTermino) {
		System.out.println("O jogo durou " + (horaTermino - horaInicio) + " horas");
	} else if (horaInicio + horaTermino > 24){
		System.out.println("Um jogo não pode durar mais de 24 horas");
	} else {
		System.out.println("O jogo durou " + (horaTermino + horaInicio) + " horas");
	}
	
 }
}
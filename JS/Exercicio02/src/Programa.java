
//for (int i = 0; i < 3; i++);
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		String[] matriculas = new String[5];
		for (int i = 0; i < 5; i++) {
		String matricula = leitor.nextLine();
		}
//nomes		
		String[] nomes = new String[5];
		nomes[0] = "Joao";
		nomes[1] = "Fernando";
		nomes[2] = "Henrique";
		nomes[3] = "Pedro";
		nomes[4] = "Gabriel";
		
//nota1
		double[] nota1 = new double[5];
		nota1[0] = 7.0;
		nota1[1] = 8.0;
		nota1[2] = 1.0;
		nota1[3] = 9.0;
		nota1[4] = 6.0;
		
//nota2		
		double[] nota2 = new double[5];
		nota2[0] = 7.0;
		nota2[1] = 3.0;
		nota2[2] = 9.0;
		nota2[3] = 5.0;
		nota2[4] = 6.0;
		
//notafinal		
		double[] notaFinal = new double[5];
		notaFinal[0]= nota1[0] + nota2[0] / 2;
		notaFinal[1]= nota1[1] + nota2[1] / 2;
		notaFinal[2]= nota1[2] + nota2[2] / 2;
		notaFinal[3]= nota1[3] + nota2[3] / 2;
		notaFinal[4]= nota1[4] + nota2[4] / 2;
		
//impressão		
		System.out.println("Matricula: " + matriculas[0]);
		System.out.println("Nome: " + nomes[0]);
		if (notaFinal[0] >= 6) {
			
			System.out.println("Aprovado: (x) Sim ( ) Não");
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) Não");
			
		}
		System.out.println("Nota final: " + notaFinal[0]);
		
		
		System.out.println("Matricula: " + matriculas[1]);
		System.out.println("Nome: " + nomes[1]);
		if (notaFinal[1] >= 6) {
			
			System.out.println("Aprovado: (x) Sim ( ) Não");
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) Não");
			
		}
		System.out.println("Nota final: " + notaFinal[1]);
		
		
		System.out.println("Matricula: " + matriculas[2]);
		System.out.println("Nome: " + nomes[2]);
		if (notaFinal[2] >= 6) {
			
			System.out.println("Aprovado: (x) Sim ( ) Não");
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) Não");
			
		}
		System.out.println("Nota final: " + notaFinal[2]);
		
		
		System.out.println("Matricula: " + matriculas[3]);
		System.out.println("Nome: " + nomes[3]);
		if (notaFinal[3] >= 6) {
			
			System.out.println("Aprovado: (x) Sim ( ) Não");
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) Não");
			
		}
		System.out.println("Nota final: " + notaFinal[3]);
		
		
		System.out.println("Matricula: " + matriculas[4]);
		System.out.println("Nome: " + nomes[4]);
		if (notaFinal[4] >= 6) {
			
			System.out.println("Aprovado: (x) Sim ( ) Não");
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) Não");
			
		}
		System.out.println("Nota final: " + notaFinal[4]);
		leitor.close();
	}
}

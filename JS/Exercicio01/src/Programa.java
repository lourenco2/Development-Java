
//vetor
//Declarar
//int [] vetor= new int[qtd];

//importa��es

import java.util.Scanner; 

public class Programa {//inicio programa

	public static void main(String[] args) {//inicio main
	
//		String matricula = "12345";  
//		String nome = "Jo�o"; 
//		double nota1 = 7.5;
//		double nota2 = 10;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Insira a Matricula:");
		String matricula = leitor.nextLine();
		System.out.println("Insira o Nome:");
		String nome = leitor.nextLine();
		System.out.println("Insira a primeira nota:");
		double nota1 = leitor.nextDouble();
		System.out.println("Insira a segunda nota:");
		double nota2 = leitor.nextDouble();
		
		double notaFinal = (nota1 + nota2) / 2; 
		
		System.out.println("Matricula: " + matricula); //Concatena��o
		System.out.println("Nome: " + nome);
		
		//igual ou superior a 6
		if (notaFinal >= 6) {
			
			System.out.println("Aprovado: (x) Sim ( ) N�o");
			
		} else {
			
			System.out.println("Aprovado: ( ) Sim (x) N�o");
			
		}
		
		System.out.println("Nota final: " + notaFinal);
	leitor.close();
	}//fim main

}//fim programa

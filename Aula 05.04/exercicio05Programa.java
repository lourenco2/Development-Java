import java.util.Scanner;

public class exercicio05Programa {
	public static void main(String[ ] args) {
		File arquivo = new File("C:\\users\\aluno\\documents\\aula 05.04\\grupos-tabulados.txt");
		Scanner leitor = new Scanner(arquivo);				
			while(leitor.hasNext(){
				String linha = leitor.nextLine();
				String[] dadoslinha = linha.split("\t");
				System.out.println("Grupo: " + dadoslinha[0]);
				System.out.println("Valor: " + dadoslinha[1]);
				
				String grupo = dadoslinha[0];
				String Valor = dadoslinha[1];

				String totalPorGrupo = 
				String total = dadoslinha[1] + dadoslinha[1];
				
			}
			
	
	leitor.close();
	}
		
	}
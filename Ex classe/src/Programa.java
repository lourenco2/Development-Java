
public class Programa {
	
	public static void main(String[] args) {
	
		Aluno aluno1 = new Aluno();
		aluno1.matricula = "123456";
		aluno1.nome = "João";
		aluno1.nota1 = 7.8;
		aluno1.nota2 = 8.3;
		aluno1.nota3 = 5.6;
		
		Aluno aluno2 = new Aluno();
		aluno2.matricula = "324446";
		aluno2.nome = "Pedro";
		aluno2.nota1 = 6.8;
		aluno2.nota2 = 5.3;
		aluno2.nota3 = 4.6;
		
		Aluno[] alunos = new Aluno[2];
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		
		For(int i = 0; i < alunos.lenght; i++){
			Aluno a = alunos[i];
			System.out.println("Matricul: " + a.matricula);
			System.out.println("Nome: " + a.nome);
			System.out.println("Nota 1: " + nota1);
			System.out.println();
			System.out.println();
			
		}
		
	}
}

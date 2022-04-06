import java.io.FileNotFoundException;

public class split {
    public static void main(String[] args) throws FileNotFoundException{
		
		String[] alunos = new String[2];
		alunos[0] = "Pedro;1234;7.8;8.6;9.0";
		double totalDasNotas = 0;
		
		for (int i = 0; i < alunos.length; i++) {
			String linha = alunos[i];
			String[] dados = linha.split(";");
		}
		
	}
}

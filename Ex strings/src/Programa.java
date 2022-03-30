
public class Programa {

 public static void name() {
	
	 String texto = "Só sei que nada sei.";
	 int comprimento = texto.length();
	 System.out.println("Comprimento: " + comprimento);
	 
	 String subTexto = texto.substring(5, 10);
	 System.out.println("Sub: " + subTexto);
	 
	 char  caractere = texto.charAt(9);
	 System.out.println("Char: " + caractere);
	 
	 for (int i = 0; i < texto.length(); i++){
		 System.out.println(texto.charAt(i));
	 }
}
	
}

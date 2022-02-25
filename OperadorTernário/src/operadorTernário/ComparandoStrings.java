package operadorTernário;

public class ComparandoStrings {

	public static void main(String[] args) {
		
		String nome1 = "Darlison";
		String nome2 = "Darlison H";
		String nome3 = new String("Darlison");
		String res;
		
		res = (nome1.equals(nome3))?"igual":"diferente";
		System.out.println(res);
		
	}

}

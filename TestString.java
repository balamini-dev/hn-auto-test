/**
* Déclaration de la classe principale de l’application
* Programme pour tester l’usage des chaînes
*/
public class TestString{
	/** main : Fonction d’entrée dans toute application java */
	public static void main (String args[]) {
		/* déclaration et instanciation des string */
		String ch1="Bonjour";
		String ch2=new String("l'IPI");
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1 + ch2);
		ch2="j'ai dit 2 fois \"bonjour l'IPI\"";
		System.out.println(ch2);
		String ch3 ;
		ch3= "Au revoir " ;
		System.out.println(ch3.toUpperCase());
			System.out.println("test".toUpperCase());
	}
}
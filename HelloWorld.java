public class HelloWorld{
	/**
	 * Class HelloWorld. Contient main
	 * @author : BD
	 * @param args : arguments du main
	 *
	 */ 

	public static void main (String args[]){ // en parametres la fonction println prend un tableau
		//System.out.println("Hello World JAVA");
		//System.out.println(arg[0]);
		for(int i=0; i<args.length; i++){ // pour i allant de "0" à la fin du tableau args[] défini dans la méthode main
			System.out.println("Les parametres entrés sont : " + args[i]); // on affiche tous les parametres. (Ces paramètres seront écrit en ligne de commande).
		}
	}
}

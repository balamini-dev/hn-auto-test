public class MainEquation{

	public static void main (String args[]){
		StructEquation exec = new StructEquation(); // on accède à la class 'StructEquation'. On accède aux attributs et fonctions à travers la variable 'exec'.
		exec.operationEquation(Float.parseFloat(args[0]), Float.parseFloat(args[1]), 0); // à travers la variable exec on accède à la méthode 'operationEquation' on lui met en paramètre les valeurs qu'entrera l'utilisateur. Ses valeurs seront mise dans le tableau args[].
	}
}
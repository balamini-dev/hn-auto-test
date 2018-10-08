public class Tableau{
	/** main : Fonction d’entrée dans toute application java */
	public static void main (String args[]) {
		/* déclaration du tableau */
		int[] monTab;
		/* création du tableau */
		monTab=new int[args.length];
		/* intialisation du tableau */
		for (int i=0 ; i<args.length; i++) {
			monTab[i]=Integer.parseInt(args[i]);
		}
		System.out.println();
		/* affichage du tableau */
		for(int i=0 ; i<monTab.length; i++) {
			System.out.println("tab["+i+"]="+monTab[i]);
		}
	}
}
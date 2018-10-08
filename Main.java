/**
* Déclaration de la classe principale de l’application
* Programme pour tester l’usage des structures
*/
public class Main{

	public static void main (String args[])
	{
		StructPersonne unePersonne=new StructPersonne();
		unePersonne.nom="Tomtom";
		unePersonne.prenom="Nana";
		unePersonne.anneeNaissance=1995;

		System.out.println("unePersonne =" +unePersonne.nom+" "+unePersonne.prenom+" "+unePersonne.anneeNaissance);
		StructPersonne p2;
		p2=unePersonne; // p2 et unePersonne sont des références
		p2.anneeNaissance=2000; // ça modifie p2 et unePersonne
		System.out.println("p2 =" +p2.nom+" " +p2.prenom+" "+p2.anneeNaissance);
		System.out.println("unePersonne =" +unePersonne.nom+" "+unePersonne.prenom+" "+unePersonne.anneeNaissance);
	
		public static void affichage(){
			System.out.println("unePersonne =" +unePersonne.nom+" "+unePersonne.prenom+" "+unePersonne.anneeNaissance);
			StructPersonne p2;
			p2=unePersonne; // p2 et unePersonne sont des références
			p2.anneeNaissance=2000; // ça modifie p2 et unePersonne
			System.out.println("p2 =" +p2.nom+" " +p2.prenom+" "+p2.anneeNaissance);
			System.out.println("unePersonne =" +unePersonne.nom+" "+unePersonne.prenom+" "+unePersonne.anneeNaissance);
	
		}
	}
}
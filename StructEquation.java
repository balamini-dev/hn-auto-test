public class StructEquation{
	// déclaration des attributs ("ils sont toujours 'pivate'.")
	private float a;
	private float b;
	private float sol;

	static void operationEquation(float a, float b, float sol){ // fonction pour la résolution de l'équation du premier degré.

		if(a==0 && b==0){
			System.out.println("Toute solutions possible");
		}
		else if(a==0 && b!=0){
			System.out.println("Il n'y a pas de solution");
		}
		else if(a!=0){
			System.out.println("La solution est ' -b/a '");
			sol=-b/a;
			System.out.println("La solution est : "+ sol);
		}

	}

}

// le code est éxuté dans la méthode main qui se trouve dans "MainEquation.java"
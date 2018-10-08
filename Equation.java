public class Equation{

	public static void main (String args[]){
		float a = Integer.parseInt(args[0]);
		float b = Integer.parseInt(args[1]);
		float sol;

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
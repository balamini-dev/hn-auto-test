public class TriBulle{
	public static void main (String args[]){
		int tmp=0;
		System.out.println("Le tableau initial est : ");
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}

		for(int i=1; i<args.length; i++){
			if(Integer.parseInt(args[i])<Integer.parseInt(args[i-1])){
				tmp=Integer.parseInt(args[i-1]);
				args[i-1]=args[i];
				Integer.parseInt(args[i])=tmp;
			}
		}
		System.out.println("Le nouveau tableau trié est le suivant : ");
		for(int i=0; i<args.length; i++){
			System.out.println(args[i]);
		}
	}

}
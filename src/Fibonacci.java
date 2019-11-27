
public class Fibonacci {
	
	public static String fibonacci(int etape) {
		
		int premier = 0;
		int deuxieme = 1;
		
		String retour = premier + ", "+ deuxieme;
		
		for (int i = 0; i < etape; i++) {
			int nouveau = premier + deuxieme ;
			retour += ", "+nouveau ;
			premier = deuxieme ; 
			deuxieme = nouveau;
		}
		
		return retour;
		
	}
}

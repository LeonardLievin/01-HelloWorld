
public class Start {

	/*
	 * Algorithme de rafraichissement de connaissances en langue Java
	 */
	
	
	public static void main(String[] args) {
		
		String fibo = fibonacci(20);
		System.out.println(fibo);
	
	}
	
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

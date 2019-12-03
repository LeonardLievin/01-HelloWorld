
public class TutoKoor {

	
	// tutoriel importance String Builder
	// importance 
	
	public static long varString() {
		String maString = "Valeur 1";
		
		int BOUCLE = 1_000 ;
		
		long tempsDebut = System.currentTimeMillis();
		
		for (int i = 0; i < BOUCLE; i++) {
			maString += "+ Valeur 2";
			maString += "+ Valeur 3";
			maString += "+ Valeur 4";
		}
		
		long tempsFin = System.currentTimeMillis();
		
		return tempsFin-tempsDebut;
	}
	
	public static long varStringBuilder() {
		StringBuilder maString = null;
		maString.append("Valeur 1");
		
		int BOUCLE = 1_000 ;
		
		long tempsDebut = System.currentTimeMillis();
		
		for (int i = 0; i < BOUCLE; i++) {
			maString.append("+ Valeur 2");
			maString.append("+ Valeur 3");
			maString.append("+ Valeur 4");
		}
		
		long tempsFin = System.currentTimeMillis();
		
		return tempsFin-tempsDebut;
	}
	
	
}
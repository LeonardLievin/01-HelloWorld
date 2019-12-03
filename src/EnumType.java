import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Tutoriel Koor
// Defintion des types enumeres
//exemple : feu de croisement


public class EnumType {

	static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)) ;
	
	public static void name() throws IOException {

		Feu  monFeu = Feu.ORANGE;
		System.out.println("Le feu est "+ monFeu.toString() +" , GO ou STOP ? ");
		
		String action = keyboard.readLine();

		if (action.equals("GO")) {
			if(monFeu.equals(Feu.VERT)) System.out.println("C'est correcte");
			else System.out.println("Non car le feu n'est pas vert");
		}
		else if (action.equals("STOP")) {
			if(monFeu.equals(Feu.VERT)) System.out.println("Il faut avancer");
			else System.out.println("C'est correcte");
		}
		else {
			System.out.println("Reponse inconnue");
			
		}
	}
}

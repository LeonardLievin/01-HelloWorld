import java.util.Scanner;


public class Exercice {
	
	private static Scanner sc;


	// Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
	// https://www.cours-gratuit.com/java/exercice-java-condition-if-nombre-pair-ou-impair
	public static String conditionIf(int valeur)
	{
		if(valeur % 2 == 0)
			return valeur + " est  un nombre pair";
		else
			return valeur + " est  un nombre impair";
	}
	
	
	//Ecrivez un programme Rectangle.java, permettant de lire la largeur et la hauteur d'un rectangle. Ce programme devra afficher, à la demande, le périmètre ou la surface du rectangle
	//https://www.cours-gratuit.com/java/exercice-java-modularisation-rectangle//
	public static String Rectangle()
	{
		System.out.println("Entrer largeur : ");
		sc = new Scanner(System.in);
		double largeur = sc.nextDouble();
		
		System.out.println("Entrer longueur : ");
		sc = new Scanner(System.in);
		double longueur = sc.nextDouble();
		
		double perimetre = largeur *2 + longueur *2 ;
		double surface = largeur * longueur ;
		
		return "Rectangle de cotes : "+ largeur+" * "+longueur+" avec surface = "+surface+" et perimetre = "+perimetre;
	}
	
}

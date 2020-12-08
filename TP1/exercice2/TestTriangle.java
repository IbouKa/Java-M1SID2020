package exercice2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {

	private static Scanner lectureClavier = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		int nfois=0;
		int choix=-1;
		
		while(n<3 || n>10){
			if (nfois==3) {
				System.exit (0);
			};
			nfois++;
			System.out.println("Donner la taille du triangle :");
			n = lectureClavier.nextInt();
				
		};
		
		while(choix<0 || choix>2){
			System.out.println("1:	Dessine triangle Haut");
			System.out.println("2:	Dessine triangle Bas");
			System.out.println("0:	Quitter");
			
			try {	
				System.out.println("");
				System.out.println("Entrer Votre choix :");
				choix = lectureClavier.nextInt();
				
		    } catch (InputMismatchException e) {
		    	choix=0;
		    }
		};
		
		switch(choix){
		case 1: DessineTriangle.DessineTriangleHaut(n);break;
		case 2: DessineTriangle.DessineTriangleBas(n);break;
		default : break;
		};
			
			
			
		
		

	}

}

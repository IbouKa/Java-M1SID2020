package exercice7;
import exercice6.Point;

public class Cercle {
	private double rayon;
	private Point centre;
	final static double PI=3.14;
	
	public Cercle(double r,Point c) {
		this.rayon=r;
		this.centre=c;
	}
	public void affiche() {
		System.out.println("Les caracteristiques du cercle sont :");
		System.out.println("Rayon :"+this.rayon);
		this.centre.affiche();
	}
	public double surface() {
		return PI*this.rayon*this.rayon;
	}
	public void imprimer() {
		System.out.println("La surface est :"+this.surface());
	}
	
	
}

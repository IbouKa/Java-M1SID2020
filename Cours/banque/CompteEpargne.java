package banque;

public class CompteEpargne extends Compte {
	 
	private double taux;
	public CompteEpargne(String n, String pr, double s,double t) {
		super(n, pr, s);
		this.taux=t;
		// TODO Auto-generated constructor stub
	}

}

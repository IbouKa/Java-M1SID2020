package banque;

public class ComtpeCheque extends Compte {
	private double decouvertAutorise;

	public ComtpeCheque(String n, String pr, double s,double d) {
		super(n, pr, s);
		this.decouvertAutorise=d;
		// TODO Auto-generated constructor stub
	}
	public void changeDecouvert(double d) {
		 this.decouvertAutorise=d;
	};
	
	public void retirer(double montant) {
		if (this.getSolde()+this.decouvertAutorise>=montant)
			this.setSolde(this.getSolde()-montant);
	};
	
	public void imprimeHistorique() {
		super.imprimeHistorique();
		System.out.println("Decouvert autorisée :"+this.decouvertAutorise);
	};
	
	 
}

package banque;

public class Compte {
	private String nom;
	private String prenom;
	private double solde;
	public Compte(String n,String pr,double s){
		this.nom=n;
		this.prenom=pr;
		this.solde=s;	
	};
	
	public void imprimeHistorique() {
		System.out.println("Solde :"+this.solde);
	};
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void deposer(double montant) {
		this.solde+=montant;
	};
	public void retirer(double montant) {
		if (this.solde>=montant)
			solde-=montant;
	};
}

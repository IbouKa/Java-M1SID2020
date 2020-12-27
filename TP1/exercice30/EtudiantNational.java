package exercice30;

public class EtudiantNational extends Etudiant {
	private String ethnie;
	public EtudiantNational(String nom, String pren, int age,String ethnie) {
		super(nom, pren, age);
		this.ethnie=ethnie;
		// TODO Auto-generated constructor stub
	}
	
	public void affiche() {
		System.out.println("Les information de l'etudiant National");
		super.affiche();
		System.out.println("Ethnie :"+this.ethnie);
	};


}

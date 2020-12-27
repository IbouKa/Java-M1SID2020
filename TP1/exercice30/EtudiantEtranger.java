package exercice30;

public class EtudiantEtranger extends Etudiant{
	private String pays;
	public EtudiantEtranger(String nom, String pren, int age,String p) {
		super(nom, pren, age);
		this.pays=p;
		// TODO Auto-generated constructor stub
	}
	
	public void affiche() {
		System.out.println("Les information de l'etudiant National");
		super.affiche();
		System.out.println("Pays :"+this.pays);
	};

}

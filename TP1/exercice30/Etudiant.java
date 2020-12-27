package exercice30;

public class Etudiant {
	protected String nom;
	protected String prenom;
	protected int age;

	public Etudiant(String nom,String pren,int age) {
		this.nom=nom;
		this.prenom=pren;
		this.age=age;
	};
	 
	public void affiche() {
		System.out.println("Les information de l'etudiant");
		System.out.println("Nom :"+getNom());
		System.out.println("Prenom :"+getPrenom());
		System.out.println("Age :"+getAge());
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

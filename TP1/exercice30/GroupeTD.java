package exercice30;

public class GroupeTD {

	
	static Etudiant liste[]=new Etudiant[30];
	static int nbEtudiant=0;
	
	public static void ajouter(Etudiant e){
		if(nbEtudiant<liste.length)
			liste[nbEtudiant++]=e;
	};
	
}

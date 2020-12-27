package exercice23;

public class TriTabEntier {
	/*
	 * Méthode indiceMIN retourne la valeur minimale d'un fragement de tableau t
	 * imin: indice de debut
	 * imax: indice de fin
	 */
	public static int indiceMIN(int t[],int imin,int imax){
		int ind=imin;
		for(int i=imin;i<=imax;i++)
			if(t[i]<t[ind])
				ind=i;
		return ind;
	};
	
	/*
	 * Cette fonction prend en argument un tableau et deux entiers i et j.
	 * Elle récupère la valeur contenue dansla iième case du tableau, 
	 * affecte à cette case la valeur contenue dans la jième case,
	 * puis affecte à la jième case l'ancienne valeur de la iième case.
	 */
	public static void echange(int t[],int i,int j){
		int z=t[i];
		t[i]=t[j];
		t[j]=z;
	};
	
	/*
	 * Cette methode permet de trier dans l'ordre croissante le tableau pris comme argument
	 */
	public static void tabTrie(int t[]) {
		int l=t.length;
		for(int i=0;i<l;i++) {
			int indiceMin=indiceMIN(t,i,l-1);
			echange(t,i,indiceMin);
		};
	};
}

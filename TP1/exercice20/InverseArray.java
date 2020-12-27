package exercice20;

public class InverseArray {
	/*
	 * Cette méthode inverse l'ordre des éléments du tableau.
	 * prend en argument la tableau à inverser
	 * et retourne le tableau inversé
	 */
	
	public static int[] inverseTab(int t []) {
		int l=t.length;
		int[] res=new int[l];
		
		for(int i=0;i<l;i++)
			res[l-1-i]=t[i];
		return res;
	};
	
	/*
	 * Cette méthode affiche le tableau inversé.
	 */
	public static void afficheTabInverse(int t[]){
		int l=t.length;
		int[] inv=new int[l];
		inv=inverseTab(t);
		System.out.println("Le tableau inversé est :");
		for(int i=0;i<l;i++)
			System.out.print(inv[i]+"  ");
	};

}

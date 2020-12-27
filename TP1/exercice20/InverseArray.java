package exercice20;

public class InverseArray {
	/*
	 * Cette m�thode inverse l'ordre des �l�ments du tableau.
	 * prend en argument la tableau � inverser
	 * et retourne le tableau invers�
	 */
	
	public static int[] inverseTab(int t []) {
		int l=t.length;
		int[] res=new int[l];
		
		for(int i=0;i<l;i++)
			res[l-1-i]=t[i];
		return res;
	};
	
	/*
	 * Cette m�thode affiche le tableau invers�.
	 */
	public static void afficheTabInverse(int t[]){
		int l=t.length;
		int[] inv=new int[l];
		inv=inverseTab(t);
		System.out.println("Le tableau invers� est :");
		for(int i=0;i<l;i++)
			System.out.print(inv[i]+"  ");
	};

}

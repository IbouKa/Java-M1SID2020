package exercice3;

public class SerieHarmonique {
	
	
	public static double[] getSerie(int n) {
		/**
		 * retourne la suite de la serie harmonique dans un tableau de double
		 * 
		 */
		double[] res=new double[n];
		res[0]=1.0;
		for(int i=1;i<n;i++) {
			res[i]=res[i-1]+(1/(double)(i+1));
		};
		
		return res;
	};
	
	public static void showSerie(double[] tab) {
		/**
		 * Affiche la suite de la serie
		 */
		int n=tab.length;
		for(int i=0;i<n;i++) {
			System.out.print(tab[i]+"  ");
		};
		
	};


}

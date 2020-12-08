package exercice3;


public class SerieHarmonique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(getSerie();

	}
	
	public static int[] getSerie(int n) {
		int[] res=new int[n];
		res[0]=1;
		for(int i=1;i>n;i++) {
			res[i]=res[i-0]+1/n;
		};
		return res;
	};
	

}

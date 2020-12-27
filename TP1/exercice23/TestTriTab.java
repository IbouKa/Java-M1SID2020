package exercice23;

public class TestTriTab{
	public static void main(String[] args){
		
		int[] tab=new int[] {8,64,3,4,6,0,4,43,-6,0,5,13,100,8};
		
		//Appelle de la methode de tri
		TriTabEntier.tabTrie(tab);
		
		System.out.println("Le tableau trié est :");
		for(int i:tab){
			System.out.print(i+"  ");
		};
	};
}

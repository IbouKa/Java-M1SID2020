package recursivite;

public class TestRecursivite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Factoriel de 12 :"+factoriel(12));

	}
	
	public static int factoriel(int n) {
		if (n==0)
			return 1;
		else
			return n*factoriel(n-1);
	};

}

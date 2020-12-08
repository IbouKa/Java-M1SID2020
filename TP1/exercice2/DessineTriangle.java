package exercice2;

public class DessineTriangle {
	
	public static void DessineTriangleHaut(int nligne){
		for(int i=0; i<nligne;i++ ) {
			for(int j=0; j<=i;j++ ) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
	}
	
	public static void DessineTriangleBas(int nligne){
		for(int i=0; i<nligne;i++ ) {
			for(int j=0; j<nligne-i;j++ ) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		
	}
	

}

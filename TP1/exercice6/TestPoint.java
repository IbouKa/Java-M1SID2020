package exercice6;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte c1=10,c2=9;
		Point n=new Point(5,7);
		Point m=new Point(6,8,c1);
		
		
		Point o=new Point();
		System.out.println("Point N");
		n.affiche();
		System.out.println("Point M");
		m.affiche();
		System.out.println("Point O");
		o.affiche();
		
		n.translater(1,1);
		System.out.println("Point N coincide avec Point M "+n.concide(m));
		
		
		
		
	}

}

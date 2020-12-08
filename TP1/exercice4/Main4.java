package exercice4;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1=new Point(8,6);
		Point p2=p1;
		
		p2.setX(4);
		
		System.out.println(p1.x+"	"+p2.x);
		System.out.println(p1==p2);
	}

}

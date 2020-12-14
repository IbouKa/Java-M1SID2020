package exercice6;
/**
 * @author IBOU KA
 *
 */
public class Point {
	private float x;
	private float y;
	private byte color;
	
	public Point(float x,float y) {
		this.x=x;
		this.y=y;
	};
	
	public Point(float x,float y,byte color) {
		this(x,y);
		this.color=color;
		
	};
	public Point() {
		this(0,0);
	};
	
	public void translater(float dx,float dy) {
		this.x+=dx;
		this.y+=dy;
	};
	
	public void affiche() {
		System.out.println("les propriétés du point");
		
		System.out.println("Abssice :"+this.x);
		System.out.println("Ordonne :"+this.y);
		System.out.println("Couleur :"+this.color);
	};
	
	public boolean concide(Point p) {
		
		return this.x==p.x && this.y==p.y;
	};
	
	
	//Definition des getters
	public float getX() {
		return this.x;
	};
	
	public float getY() {
		return this.y;
	};
	
	//Definition des setters
	public void setX(int x) {
		this.x=x;
	};
	public void setY(int y) {
		this.y=y;
	};
	

}

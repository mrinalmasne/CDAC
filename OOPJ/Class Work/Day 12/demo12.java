package Day12;
abstract class Shape{
	protected float area;
	public abstract void calArea() ;
	public float getArea() {
		return area;
	}
}
public class demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape sh=new Shape(){
			private float radius=2;
			public void calArea() {
				this.area=(float)(Math.PI*Math.pow(radius, 2));
			}	
	};
	sh.calArea();
	System.out.println("Area of Circle:"+sh.getArea());
	
	
	}
}

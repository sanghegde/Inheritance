//inheritance using array instances
public class ShapeArray {

	public static void main(String[] args) 
	{
		Shape arr[]=new Shape[3];
		arr[0]=new Circle();
		arr[1]=new Rectangle();
		arr[0].draw();
		arr[1].draw();

	}

}

package SolidDesignPrinciples.OCP;


public class Square extends Rectangle {

		
	@Override
	public int calculateArea() {
		return width + height;
	}
}

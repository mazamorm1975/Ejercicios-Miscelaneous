package SolidDesignPrinciples.OCP;

public class Rectangle {

	protected int width;
	protected int height;
	
	/*
	 * Este metodo puede ser heredado a otras subclases como Square.java, para calcular el area no solo de un rectangulo sino de 
	 * otras figuras geometricas, sin alterar la clase padre. El beneficio es que con la herencia de la clase padre Rectangle.class
	 * Square hace que el codigo sea mas mantenible, y se puedan evitar la introducción de bugs, y comportamiento inesperado.
	 */
	public int calculateArea() {
		return width * height;
	}
	
	
}

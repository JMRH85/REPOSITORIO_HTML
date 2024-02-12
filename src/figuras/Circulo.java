

package figuras;

/** clase para calcular el area de un circulo 
 * @author j&s
 * @version v1.1
 */

public class Circulo {

	protected double x; // coordenadas del centro

	protected double y; // diametro del circulo 

	protected double r; // radio del círculo

/**
 * constructor de la clase con los parametros x,y,r
 * @param x - introduccion de cordenadas del centro del circulo		 
 * @param y - introducción del diametro del circulo 
 * @param r - introduccion del radio del circulo 
 */
	public Circulo(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
/**
 * método que retorna un double para calcular el area del circulo 
 * @return Double del área
 */
	public double área() {
		return Math.PI * r * r;

	}
}
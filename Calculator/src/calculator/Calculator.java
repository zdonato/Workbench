package calculator; 

/**
 * @author Zachary Donato
 * This will be the calculator class that will hold all of the methods for computation.
 * Date: 3.9.14
 * Revisions: 
 */

public class Calculator{
	// Initialize data members.
	private double root1; 
	private double root2;
	private double disc; 
	
	// Constructor. 
	public Calculator(){
		
	}
	
	/**
	 * Method getRoots to calculate the quadratic root of a given functions coefficients.
	 * @param a Double a, coefficient of the quadratic term.
	 * @param b Double b, coefficient of the linear term.
	 * @param c Double c, the constant of the function.
	 * @return Returns true if the root was found, false otherwise.
	 */
	public boolean getRoots(double a, double b, double c){
		// Calculate discriminant.
		disc = (b * b) - (4 * a * c);
		
		// Negative discriminant means imaginary roots.
		if (disc < 0){
			System.out.println("No real roots."); 
			return false; 
		}
		
		// If the quadratic term is missing, return only one root.
		if (a == 0){
			root1 = -(c/b); 
			System.out.println("The root of " + a + "x^2 + " + b + "x + " + c + " is: " + root1); 
			return true;
		} else {
			root1 = (-b + disc)/(2 * a); 
			root2 = (-b - disc)/(2 * a); 
			
			// Check if the roots are the same.
			if (root1 == root2){
				System.out.println("The root of " + a + "x^2 + " + b + "x + " + c + " is: " + root1);
			} else {
				System.out.println("The roots of " + a + "x^2 + " + b + "x + " + c + " are: ");
				System.out.println(" ROOT1: " + root1); 
				System.out.println(" ROOT2: " + root2); 
			}
		
			return true; 
		} // End else. 
	} // End getRoots. 
	
	public static void main(String[] args){
		Calculator calc = new Calculator(); 
		
		calc.getRoots(1, 2, 1);
	}
}

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
	public String getRoots(double a, double b, double c){
		// Calculate discriminant.
		disc = (b * b) - (4 * a * c);
		
		// Negative discriminant means imaginary roots.
		if (disc < 0){
			return "No real roots.";
		}
		
		// If the quadratic term is missing, return only one root.
		if (a == 0){
			root1 = -(c/b); 
			return Double.toString(root1); 
		} else {
			root1 = (-b + Math.sqrt(disc))/(2 * a); 
			root2 = (-b - Math.sqrt(disc))/(2 * a); 
			
			// Check if the roots are the same.
			if (root1 == root2)
				return Double.toString(root1); 
			
			// If not return both roots.
			return Double.toString(root1) + ", " + Double.toString(root2); 
			} // End else. 
	} // End getRoots. 
	
	/** 
	 * Method add to add numbers.
	 * @param numbers Double numbers, a list of numbers for an arbitrary number of inputs.
	 * @return The sum of the doubles in numbers.
	 */
	public double add(Double... numbers){
		// Initialize variables.
		int i = 0;
		double sum = 0; 
		
		// Add of the number inputs.
		while (i < numbers.length){
			sum += numbers[i]; 
			i++;
		}
		
		// Return the sum.
		return sum; 
	}
	
	
	
	public static void main(String[] args){
		Calculator calc = new Calculator(); 
		
		System.out.println(calc.getRoots(1, 4, -5));
		System.out.println(calc.add(1.0, 5.0, 6.0, 7.0)); 
	}
}

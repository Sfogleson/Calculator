package calculator;

public class MagicCalculator extends CalculatorClass {
	//Private Variables
	
	//Constructor(s)
	public MagicCalculator() {
		
	}
	
	//Methods
	public double SquareRoot(double number) {
		return Math.sqrt(number);
	}
	
	public double Sin(double number) {
		 return Math.sin(number);
		
	}
	
	public double Cosine(double number) {
		return Math.cos(number);
	}
	
	public double Tangent(double number) {
		return Math.tan(number);
	}
	
	public double Factoral(double number) {
		    if (number <= 2) {
		        return number;
		    }
		    return number * Factoral(number - 1);
		
	}
}

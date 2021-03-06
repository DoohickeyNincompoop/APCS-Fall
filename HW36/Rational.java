//Wubin Peci
//APCS Pd. 1
//HW36 - Lets be rational for a second...
//2017-11-20

public class Rational {

	private int numerator;
	private int denominator;

	public Rational() {
		numerator = 0;		//no parameters makes a default value of 0/1
		denominator = 1;
	}

	public Rational(int num, int denom) {

		if (denom == 0) {				//if the denominator is zero, it is not a real number
			
			numerator = 0;				//sets it to the default value of 0/1
			denominator = 1;
		
			System.out.println("Invalid denominator inputted! Set default value to 0/1"); //prints error message indicating what has happened
		}
		else {
			numerator = num;		//otherwise, sets them to the values given
			denominator = denom;		
		}

	}

	public String toString() {

		String num = "" + numerator;		//makes the numerator a string
		String denom = "" + denominator;	//makes the denominator a string

		return num + "/" + denom;			//puts a slash between the two to signify that they are a fraction

	}

	public double floatValue() {
		return ((double)numerator)/denominator;
	}

	public void multiply(Rational rationalNum) {

		this.numerator = this.numerator * rationalNum.numerator;		//takes the numerator of this rational number and sets it = to the product
		this.denominator = this.denominator * rationalNum.denominator;	//takes the denominator of this rational number and sets it = to the product

	}

	public void divide(Rational rationalNum) {

		this.numerator = this.numerator * rationalNum.denominator;
		this.denominator = this.denominator * rationalNum.numerator;
		
	}

	public static void main(String[] args) {	//need main method to test functions!

	//Making sure default and overloaded constructor work
	
	Rational defaultNum = new Rational();				//calls default constructor
	System.out.println("defaultNum: " + defaultNum);	//should print out 0/1

	Rational divideByZero = new Rational(9, 0);				//calls overloaded constructor, but denominator is zero
	System.out.println("divideByZero: " + divideByZero);	//should print out 0/1
	
	//Testing first value of 2/3	
	
	Rational r = new Rational(2,3); //Stores rational number 2/3
	System.out.println("r: " + r);
	System.out.println("floating point approx.: " + r.floatValue());

	//Testing second value of 1/2
	
	Rational s = new Rational(1,2); //Stores rational number 1/2
	System.out.println("s: " + s);
	System.out.println("floating point approx. : " + s.floatValue());
	
	//Testing multiply function
	
	System.out.println("now performing r * s, only r should be modified");

	r.multiply(s); 									//Multiplies r by s 
	System.out.println("r: " + r + "\ns: " + s);	//r should be 2/6, s remains 1/2

	System.out.println("now performing r / s, only r should be modified");

	r.divide(s);									//Divides r by s
	System.out.println("r: " + r + "\ns: " + s);	//r should be 4/6, s remains 1/2

	}
}

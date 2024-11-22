package day1;

public class OperatorTask {
	public static void main(String args[]) {
		int FirstNumber=12;
		int SecondNumber=25;
		System.out.println("Arithmetic Operations:");
		int addition = FirstNumber +SecondNumber;
		System.out.println("Addition :"+addition);
		
		
		
		int Subtraction = FirstNumber -SecondNumber;
		System.out.println("Subtraction:"+Subtraction);
		
		
		int Multiplication = FirstNumber *SecondNumber;
		System.out.println("Multiplication:"+Multiplication);
		
		int Division = FirstNumber /SecondNumber;
		System.out.println("Division:"+Division);
		int Modulus = FirstNumber %SecondNumber;
		System.out.println("Modulus:"+Modulus);
		
		System.out.println("Relational Operation");
		boolean greater = FirstNumber>SecondNumber;
		boolean lesser  = FirstNumber<SecondNumber;
		boolean greateq = FirstNumber>=SecondNumber;
		boolean lessereq = FirstNumber<=SecondNumber;
		boolean doubleeq = FirstNumber==SecondNumber;
		boolean noteq = FirstNumber!=SecondNumber;
		System.out.println("12>25:"+(FirstNumber>SecondNumber));
		System.out.println("12<25:"+(FirstNumber<SecondNumber));
		System.out.println("12>=25:"+(FirstNumber>=SecondNumber));
		System.out.println("12<=25:"+(FirstNumber<=SecondNumber));
		System.out.println("12==25:"+(FirstNumber==SecondNumber));
		System.out.println("12!=25:"+(FirstNumber!=SecondNumber));
		
		
		
        		
		
	}

}

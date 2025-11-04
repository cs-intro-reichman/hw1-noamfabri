// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int  currentVallue = Integer.parseInt(args[0]);
	    double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double futureValue = currentVallue * Math.pow( (1.0 + rate /100.0), n);
		System.out.println("After" + n +  " years, " + "$" + currentVallue + 
		" saved at " + rate + "% " + "wiil yield " + "$" + (int) futureValue);
			



	}
}
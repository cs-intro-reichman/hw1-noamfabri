// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentVallue = Integer.parseInt(args[0]);
	    double rate = Double.parseDouble(args[1]);
		double n = Double.parseDouble(args[2]);
		double futureValue = currentVallue * Math.pow( (1.0 + rate /100.0), n);
		System.out.println("After " + (int) n +  " years, " + "$" + currentVallue + 
		 				   " saved at " + rate + "% " + "will yield " + "$" + (int) futureValue);
	}
}

// Nice
// I would avoid using (int) (double) in system.out.print commands...not because its wrong or bad practice. More like a 'personal coding style'
// you can define: 
// double futureValue = blah blah;
// and then:
// 	futureValue = (int) futureValue ;
// 	or
// int futureValueInt =  (int) futureValue ;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
 		int lim = Integer.parseInt(args[0]);
 		int a = (int) (Math.random() * (lim + 1));
        int b = (int) (Math.random() * (lim + 1));
        int c = (int) (Math.random() * (lim + 1));
		System.out.println(a + " " + " " + b + " " + c);
		int minNum = Math.min(a , (Math.min(b, c)));
		int maxNum = Math.max(a, (Math.max(b, c)));
		int middle = a + b + c - minNum - maxNum;
		System.out.println(minNum + " " + middle + " " + maxNum);
	}
}


// Good name choosing for variables
// Optional - if your'e always using `lim + 1` , maybe lim can be defined as:
// int lim = Integer.parseInt(args[0]);
// lim = lim + 1; (or lim++;)
// and then no need for lim + 1 every time 


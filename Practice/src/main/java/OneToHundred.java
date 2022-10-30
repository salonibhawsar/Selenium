//Print 1 to Hundred without using number
public class OneToHundred {

	public static void main(String[] args) {

		/*
		 * String s = ".........."; int one = 'A'/'A' ; // 10/10 = 1 int hundred =
		 * s.length()*s.length(); //
		 * 
		 * 
		 * for(int i=one;i<=hundred;i++) { System.out.println(i); }
		 */
		printNum(1);
	}

	public static void printNum(int n) {
		if (n <= 100) {
			System.out.println(n);
			n++;
			printNum(n);
		}
	}

	}



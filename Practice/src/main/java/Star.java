
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1
		/*
		 * for(int i=0;i<4;i++) { for(int j=0;j<=i;j++) { System.out.print("* "); }
		 * System.out.println(); }
		 */

//2
		/*
		 * for(int i=0;i<5;i++) { for(int j=5;j>=i;j--) { System.out.print(" *"); }
		 * System.out.println(); }
		 */

		// 3

		/*
		 * for(int i=0;i<5;i++) { for(int j=5;j>=i;j--) { System.out.print(" ");; }
		 * for(int k=1 ; k<=i;k++) { System.out.print("*"); } System.out.println(); }
		 */

		// 4

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
				;
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}

		int v = (byte) +(char) -(int) +(long) -1;
		System.out.print(v);

	}

}
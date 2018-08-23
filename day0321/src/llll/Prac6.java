//µð¹ö±ë ¸ðµå

package llll;

public class Prac6 {

	public static void main(String[] args) {

		int cc[][][] = new int[2][3][4];
		int n = 1;
		for (int k = 0; k < cc.length; k++) {
			for (int i = 0; i < cc[k].length; i++) {
				for (int j = 0; j < cc[k][i].length; j++) {
					cc[k][i][j] = n++;
				}
			}
		}
		System.out.println();

		for (int k = 0; k < cc.length; k++) {
			for (int i = 0; i < cc[k].length; i++) {
				for (int j = 0; j < cc[k][i].length; j++) {
					System.out.print(cc[k][i][j] + " ");
				}
			}

		}
	}

}
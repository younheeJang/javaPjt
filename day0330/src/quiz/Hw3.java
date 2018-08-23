package quiz;

public class Hw3 {

	public static void main(String[] args) {

		int[][] a = new int[4][];
		int sum = 0;
		int avg = 0;
		a[0] = new int[] { 78, 48, 78, 98 };
		a[1] = new int[] { 99, 92 };
		a[2] = new int[] { 29, 64, 83 };
		a[3] = new int[] { 34, 78, 92, 56 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + "\t");
				sum += a[i][j];
			}
			avg = sum/a[i].length;
			System.out.println();
			
			System.out.println("ÇÕ°è: "+sum + "\t" +"Æò±Õ: "+avg);
			System.out.println();
		}

	}

}

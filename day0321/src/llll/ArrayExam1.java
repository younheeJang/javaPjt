package llll;

public class ArrayExam1 {
	/*
	 * 1차원 배열 문제 임의의 숫자가 들어있는 배열의 숫자 데이터들 중 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 출력 하는 프로그램을
	 * 작성하시오.
	 * 
	 * 임의의 배열 데이터 : 4 7 9 1 3 2 5 6 8 1차원 배열로 구현
	 * 
	 * 배열의 전체데이터: 4 7 9 1 3 2 5 6 8
	 * 
	 * 짝수 데이터 : 4 2 6 8
	 * 
	 * 3의 배수 데이터: 9 3 6
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		int i, j;

		System.out.println("array배열의 길이" + array.length); // 배열의 데이터 길이를 알고 싶을 때

		// 전체 데이터 출력

		System.out.print("전체 데이터 출력");
		for (i = 0; i < array.length; i++)
			System.out.printf("%d\t", array[i]);

		// 짝수 데이터 출력
		System.out.print("\n짝수 데이터 출력:\n");
		for (i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0)
				System.out.printf("%d\t", array[i]);

			System.out.print("3의 배수 데이터 출력:\n");
			for (i = 0; i < array.length; i++) {
				if (array[i] % 3 == 0)
					System.out.printf("%d\t", array[i]);

			}

		}
	}
}

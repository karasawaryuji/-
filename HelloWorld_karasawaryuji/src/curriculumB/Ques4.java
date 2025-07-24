package curriculumB;

public class Ques4 {
	public static void main(String[] args) {

		/*
		 * for文を利用して出力
		 */

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {

				if (j <= 8) {
					System.out.printf(" %02d * %02d = %02d ||", i, j, i * j);
				} else {
					System.out.printf(" %02d * %02d = %02d ", i, j, i * j);
				}

			}

			System.out.println();
		}

	}
}

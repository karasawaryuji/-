package curriculumB;

public class Ques5 {
	public static void main(String[] args) {

		/*
		 * for文を利用して出力
		 */

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 20; j++) {

				if (j <= 19) {
					System.out.printf(" %03d * %03d = %03d ||", j, i, i * j);
				} else {
					System.out.printf(" %03d * %03d = %03d ", j, i, i * j);
				}

			}

			System.out.println();
		}

	}
}



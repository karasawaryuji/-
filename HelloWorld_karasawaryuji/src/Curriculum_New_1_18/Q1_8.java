package Curriculum_New_1_18;

public class Q1_8 {

	public static void main(String[] args) {

		/*
		 * Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		 */

		msg("Hello JavaSE", 11);
		msg2(1, 2);
		test(1);
	}

	public static void msg(String a, int b) {
		System.out.println("Hello JavaSE 11");
	}
	/*
	 * Q2引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	 */

	public static void msg2(int num1, int num2) {
		System.out.println(num1 * num2);
	}

	/*
	 * Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成
	 */
	private static void test(int[] nums) {
		System.out.println();
	}

}

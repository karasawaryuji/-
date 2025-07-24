package curriculumB;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Ques1_3 {
	public static void main(String[] args) {

		/*
		 * 1 ログイン時の入力チェックシステムを作成
		 * 2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力
		 */
		String regex_AlphaNum = "^[A-Za-z0-9]+$";
		Scanner scanner = new Scanner(System.in);
		String name = "";
		while (true) {
		 name = scanner.nextLine();

			if (name == null || name.length() <= 0) {
				System.out.println("「名前を入力してください」");
				System.out.println();
			} else if (!checkLogic(regex_AlphaNum, name)) {
				System.out.println("「半角英数字のみで入力してください」");
				System.out.println();
			}

			else if (name.length() > 10) {
				System.out.println("「名前を10文字以内で入力してください」");
				System.out.println();
			}

			else {
				System.out.println("ユーザー名「" + name + "」を登録しました。");
				break;
			}
		}

		/*
		 * 3 じゃんけんのシステム
		 */
		String[] hands = { "グー", "チョキ", "パー" };
		Random rand = new Random();
		int num = 0;
		while (true) {
			num++;
			int myhand = rand.nextInt(3);
			int yourhand = rand.nextInt(3);
			System.out.println(name + "の手は「" + hands[myhand] + "」");
			System.out.println("相手の手は「" + hands[yourhand] + "」");
			System.out.println();
			if ((myhand == 0 && yourhand == 1) || (myhand == 1 && yourhand == 2) || (myhand == 2 && yourhand == 0)) {
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				System.out.println();
				System.out.println("勝つまでにかかった合計回数は" + num + "です");
				break;
			} else if (myhand == 1 && yourhand == 0) {
				System.out.println("俺の勝ち！");
				System.out.println("負けは次に繋がるチャンスです！");
				System.out.println("ネバーギブアップ！");
				System.out.println();
			} else if (myhand == 2 && yourhand == 1) {
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				System.out.println();
			} else if (myhand == 0 && yourhand == 2) {
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください。");
				System.out.println("そしたらなにかが見えてくるはずです");
				System.out.println();
			} else {
				System.out.println("DLAW あいこ　もう一回しましょう！");
				System.out.println();
			}
		}

	}

	public static boolean checkLogic(String regex, String target) {
		boolean result = true;
		if (target == null || target.isEmpty())
			return false;
		// 3. 引数に指定した正規表現regexがtargetにマッチするか確認する
		Pattern p1 = Pattern.compile(regex); // 正規表現パターンの読み込み
		Matcher m1 = p1.matcher(target); // パターンと検査対象文字列の照合
		result = m1.matches(); // 照合結果をtrueかfalseで取得
		return result;
	}
}
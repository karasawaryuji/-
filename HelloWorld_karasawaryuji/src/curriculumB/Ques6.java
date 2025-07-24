package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Ques6 {
	public static void main(String[] args) {
		/*
		 * 入力した商品の残り台数が出力されるシステムを入力
		 */

		Scanner scanner = new Scanner(System.in);
		String name = "";
		name = scanner.nextLine();
		String[] names = name.split("、");
		Random rand = new Random();
		int numtv = rand.nextInt(11);

		//String[] name = { "パソコン", "冷蔵庫", "扇風機", "洗濯機", "加湿器", "テレビ", "ディスプレイ", "その他商品" };
		for (String str : names) { //(データ型 変数名: コレクション)

		
			int num = rand.nextInt(11);
			

			switch (str) {
			case "パソコン":
				System.out.println("パソコンの残り台数は" + num + "台です");
				System.out.println();
				break;
			case "冷蔵庫":
				System.out.println("冷蔵庫の残り台数は" + num + "台です");
				System.out.println();
				break;
			case "扇風機":
				System.out.println("扇風機の残り台数は" + num + "台です");
				System.out.println();
				break;
			case "洗濯機":
				System.out.println("洗濯機の残り台数は" + num + "台です");
				System.out.println();
				break;
			case "加湿器":
				System.out.println("加湿器の残り台数は" + num + "台です");
				System.out.println();
				break;
			case "テレビ":
			
			case "ディスプレイ":
				String message = (str.equals("テレビ")) ? "テレビの残り台数は" + numtv + "台です" 
						:"ディスプレイの残り台数は" + (11-numtv) + "台です";
				System.out.println(message);
				System.out.println();
				break;

			default:

				System.out.print("『" + str + "』は指定の商品ではありません");
				System.out.println();
				break;

			}
		}
	}
}

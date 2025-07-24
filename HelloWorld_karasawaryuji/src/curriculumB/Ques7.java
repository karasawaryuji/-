package curriculumB;

import java.util.ArrayList;
import java.util.Scanner;

public class Ques7 {
	public static void main(String[] args) {

		/*
		 * N人の生徒の成績を管理するプログラムを下記条件で作成してください
		 */
		Scanner scanner = new Scanner(System.in);
		//String name = "";
		System.out.print("生徒の人数を入力してください(2以上) :");
		int num = scanner.nextInt();
		

		ArrayList<ArrayList<Integer>> arrays = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i <= num; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			System.out.print(i + "人目の『英語』の点数を入力してください :");
			list.add(scanner.nextInt());
			System.out.print(i + "人目の『数学』の点数を入力してください :");
			list.add(scanner.nextInt());
			System.out.print(i + "人目の『理科』の点数を入力してください :");
			list.add(scanner.nextInt());
			System.out.print(i + "人目の『社会』の点数を入力してください :");
			list.add(scanner.nextInt());
			arrays.add(list);
			System.out.println();
			
		}

		double ave;
		int sum = 0;
		double aveE;
		int sumE = 0;
		double aveS;
		int sumS = 0;
		double aveR;
		int sumR = 0;
		double aveSh;
		int sumSh = 0;
		
		


		for (int i = 1; i <= num; i++) {
			for (Integer s : arrays.get(i-1)) {
				sum = sum + s;
			}
			ave = (double) sum / 4;

			System.out.println(i + "人目の平均点は" + String.format("%.2f",ave) + "です。");
			
			sum = 0;
			ave=0;
			
		sumE = sumE + arrays.get(i-1).get(0);
		sumS = sumS + arrays.get(i-1).get(1);
		sumR = sumR + arrays.get(i-1).get(2);
		sumSh = sumSh+ arrays.get(i-1).get(3);
		
		
		}
		System.out.println();
		
		aveE = (double) sumE/ num ;
		System.out.println("英語の平均点は" +  String.format("%.2f",aveE) + "です。");
		
		aveS = (double) sumS/ num ;
		System.out.println( "数学の平均点は" +  String.format("%.2f",aveS) + "です。");
		
		aveR = (double) sumR/ num ;
		System.out.println("理科の平均点は" +  String.format("%.2f",aveR) + "です。");
		
		aveSh = (double) sumSh/ num ;
		System.out.println("社会の平均点は" +  String.format("%.2f",aveSh) + "です。");
		
		double aveAll =  (double)(sumE + sumS + sumR + sumSh) / (num * 4);
		
		System.out.println("全体の平均点は" +  String.format("%.2f",aveAll) + "です。");
		
	

	}
}

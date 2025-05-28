package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args){
	
		/*
		* 1ローカル変数として宣言
		*/
        //byte型
		byte byteNum;
		//short型
		short shortNum;
		//int型
		int intNum;
		//long型
		long longNum;
		//double型
		double doubleNum;
		//float型
		float floatNum;
		//char型
		char sample;
		//String型
		String str;
		//boolean型
		boolean b = false;
		/*
		* ２ローカル内でそれぞれの初期値を代入し初期化
		*/
        //byte型
		byteNum = 0;
		//short型
		shortNum = 0;
		//int型
	    intNum = 0;
		//long型
		longNum = 0L;
		//double型
		doubleNum = 0.0d;
		//float型
		floatNum = 0.0f;
		//char型
		sample = '0';
		//String型
		str = null;
		//boolean型
		b = false;
		/*
		* 3初期化をしたそれぞれの変数に下記の値を代入
		*/
        //byte型
		byteNum = 10;
		//short型
		shortNum = 100;
		//int型
	    intNum = 1000;
		//long型
		longNum = 10000L;
		//double型
		doubleNum = 9.5d;
		//float型
		floatNum = 10.5f;
		//char型
		sample = 'a';
		//String型
		str = "ハロー";
		//boolean型
		b = true;
		/*
		* 4コンソール出力
		*/
        //11110
		System.out.println(longNum + intNum + shortNum + byteNum); 
		//20
		System.out.print(byteNum + byteNum);
		//aハローtrue
	    System.out.print('a' + "ハロー" + b); 
		//11130
		System.out.print(longNum + intNum + shortNum + byteNum * 3); 
		//10000000000
		System.out.print(longNum * longNum * shortNum);
		//0.105
		System.out.print(floatNum / shortNum); 
		//-90
		System.out.print(byteNum - shortNum); 
		/*
		* 5「ハローJAVA43」と正しく動作するように修正
		*/
        //11110
		int num = 20;
		int num1 = 23;
        System.out.print("ハローJAVA" + (num + num1));
        /*
		* 6『』で囲われた人の情報を変数にして、formatの通りコンソールに出力ローカル変数に代入し○○に入れてください
		* 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		*/
        //名前
        String name = "山田 太郎";
        // 年齢
        int age = 25;
        //身長
        double height =170.5;
        //体重
        double weight = 62.2;
        //好きな食べ物
        String food = "寿司";
        
        /*
        * 自己紹介文を出力する処理
        */
        
        System.out.println("初めまして" + name + "です。");
        System.out.println("年齢は" + age + "歳です。");
        System.out.println("身長は" + height + "cmです。");
        System.out.println("身長は" + weight + "kgです。");
        System.out.println("好きな食べ物は" + food + "です。");
        /*
         * 7 6で作成した自己紹介に続いてBMIが出力されるようにしてください
         */
        //BMI
        double BMI = weight / ((height / 100) * (height / 100));
        
       /*
        * BMIを出力する処理
        */
        System.out.println("BMIは" + BMI + "です");
        /*
		* 8 6で宣言した変数に再代入し下記の通りコンソールに出力
		*/
        //名前
        String strName = "鈴木 一郎";
        // 年齢
        int intAge = 24;
        //身長
        double doubleHeight =168.5;
        //体重
        double doubleWeight = 64.2;
        //好きな食べ物
        String strFood = "オムライス";
        //BMI
        float floatBMI = 22.6f;
        
        /*
        * 自己紹介文を出力する処理
        */
        
        System.out.println("初めまして" + strName + "です。");
        System.out.println("年齢は" + intAge + "歳です。");
        System.out.println("身長は" + doubleHeight + "cmです。");
        System.out.println("身長は" + doubleWeight + "kgです。");
        System.out.println("好きな食べ物は" + strFood + "です。");
        System.out.println("BMIは" + floatBMI + "です");
        /*
         * 9 8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力
         */
        System.out.println("初めまして" + strName + "です。");
        System.out.println("年齢は" + (intAge + 20) + "歳です。");
        System.out.println("身長は" + (doubleHeight + 168.5) + "cmです。");
        System.out.println("身長は" + (doubleWeight + 64.2) + "kgです。");
        System.out.println("好きな食べ物は" + strFood + "です。");
        System.out.println("BMIは" + (floatBMI -= 11.29 ) + "です");
        /*
         * 10 8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
         */
        System.out.println(intAge >= 25); //true
        /*
         * 11 8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力
         */
        String sintAge = Integer.toString(intAge).toString();
        String sdoubleHeight = String.valueOf(doubleHeight).toString();
        String sdoubleWeight = String.valueOf(doubleWeight).toString();
        
        System.out.print(sintAge);
        System.out.print(sdoubleHeight);
        System.out.print(sdoubleWeight);
        /*
         * 12 11で変換した【年齢・身長】を整数型に変換して出力
         */	
        int i = Integer.parseInt(sintAge);
        double d = Double.parseDouble(sdoubleHeight); 
        double D = Double.parseDouble(sdoubleWeight); 
        
        System.out.println(i);
        System.out.println(d);
        System.out.println(D);
        /*
         * 13 12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
         */	
        System.out.println(i >= 25 || d >=160); //true
        
		}

}

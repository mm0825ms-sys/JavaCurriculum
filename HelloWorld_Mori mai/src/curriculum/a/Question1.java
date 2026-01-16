package curriculum.a;

/**
 * 【概要】変数①のQ１問題処理
 * 【詳細】各データ型の変数を宣言する。
 */
public class Question1 {
	/**
	 * 【概要】メイン処理
	 * 【詳細】問題の指示に従い変数を宣言する。
	 * 
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//各型の変数を宣言、初期値を設定し処理
		byte bytenum = 0;
		short shortnum = 0;
		int intnum = 0;
		long longnum = 0L;
		float floatnum = 0.0f;
		double doublenum = 0.0;
		char letter = '\u0000';
		String letters = null;
		boolean isBoolean = false;

		// 各型の変数に指定された値を代入する
		bytenum = 10;
		shortnum = 100;
		intnum = 1000;
		longnum = 10000;
		floatnum = 9.5f;
		doublenum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;

		// 値を代入した変数を用いて処理
		System.out.println(bytenum + shortnum + intnum + longnum);
		System.out.println(bytenum + bytenum);
		System.out.println(letter + letters + isBoolean);
		System.out.println(bytenum + shortnum + intnum + longnum + floatnum + doublenum);
		System.out.println(bytenum * shortnum * intnum * longnum);
		System.out.println(doublenum / shortnum);
		System.out.println(bytenum - shortnum);

		// Q04【概要】文字列変数の出力処理
		// 文字列変数を使用して挨拶文を表示する
		String nama = "山田太郎";
		System.out.println("こんにちは、" + nama + "さん！");

		// Q05【概要】数値変数の出力処理
		// 【詳細】年齢を表す数値変数を使用して年齢情報を表示する
		int age = 25;
		System.out.println("年齢：" + age + "歳");

		// Q06【概要】加算結果の代入処理
		// 【詳細】2つの数値を加算し、その結果を変数に代入して表示する
		int num1 = 10;
		int num2 = 5;
		int sum = (num1 + num2);
		System.out.println(sum);

		//Q07【概要】整数値の加算処理
		//scoreに20を加算し、最終スコア表示をする
		int score = 80;
		score = score + 20;
		System.out.println("最終スコア：" + score);

		//Q08【概要】型変換処理
		//【詳細】double型の値を、int型に変換し表示する
		double price = 99.99;
		int num = (int) price;
		System.out.println("整数価格：" + num);

		// Q09【概要】文字列から数値への変換処理
		// 文字列をint型に変換し、加算した結果を表示する
		String numStr = "123";
		int numa = Integer.parseInt(numStr);
		System.out.println(numa + 10);

		// Q10【概要】数値から文字列への変換処理
		// 【詳細】int型の数値から、String型に変換し表示する
		int num3 = 50;
		String str = String.valueOf(num3);
		System.out.println("得点：" + str + "点");

		// Q11【概要】条件判断処理
		// aがbより小さいかどうかを判断し、表示する
		int a = 10;
		int b = 20;
		boolean result = (a < b);
		System.out.println(result);

		// Q12【概要】条件演算子を使用して判断処理
		// 【詳細】xが10以上ならOK、そうでなければNGを表示する
		int x = 15;
		String judge = x >= 10 ? "OK" : "NG";
		System.out.println(judge);

		// Q13【概要】文字列の置換処理
		// 【詳細】文章中の「Java」を「Python」に置き換えて表示する
		String text = "私はJavaが好きです。Javaは楽しい！";
		String changed = text.replace("Java", "Python");
		System.out.println(changed);

	}

}

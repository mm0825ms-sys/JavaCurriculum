package curriculu.b;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 【Q01】for文で1～10の数字を表示する
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// 【Q02】for文で2～20の偶数を数字で示する
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		// 【Q03】for文で1～10をウントダウンで表示する
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		// 【Q04】for文で1～100の合計を表示する
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 【Q05】for文記号を使って三角形を表示する
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 【Q06】while文で1～10の数字を表示する
		int count = 1;
		while (count <= 10) {
			System.out.println(count);
			count++;
		}
		// 【Q07】while文で2～20の偶数を数字で示する
		int count1 = 1;
		while (count1 <= 20) {
			if (count1 % 2 == 0) {
				System.out.println(count1);
			}
			count1++;
		}

		// 【Q08】while文で1～10をウントダウンで表示する
		int count2 = 10;
		while (count2 >= 1) {
			System.out.println(count2);
			count2--;
		}

		// 【Q09】while文で1～100の合計を表示する
		int count3 = 1;
		int sum1 = 0;
		while (count3 <= 100) {
			sum1 += count3;
			count3++;
		}
		System.out.println(sum1);

		// 【Q10】0が入力せれるまで数値の入力返す
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("数値を入力してください。");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("終了しました。");
				break;
			}
		}

		// 【Q11】九九の計算結果を表形式で表示する
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(
						String.format("%02d*%02d=%02d ||", i, j, i * j));
			}
			System.out.println();
		}

		// 【Q12】入力された商品名に応じて残り台数を表示する
		int tvStock = (int) (Math.random() * 12);
		int displayStock = 11 - tvStock;

		System.out.println("商品名を入力してください");
		sc.nextLine();
		String input = sc.nextLine();
		String[] items = input.split("、");
		for (String raw : items) {
			String item = raw.trim();
			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int stock = (int) (Math.random() * 12);
				System.out.println(item + "の残り台数は" + stock + "台です");
				break;
			case "テレビ":
				System.out.println("テレビの残り台数は" + tvStock + "台です");
				break;
			case "ディスプレイ":
				System.out.println("ディスプレイの残り台数は" + displayStock + "台です");
				break;

			default:
				System.out.println("受付不可：" + item + "は指定の商品ではありません");
				break;
			}
		}
		sc.close();
	}
}
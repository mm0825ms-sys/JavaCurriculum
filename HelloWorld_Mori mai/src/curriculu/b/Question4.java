package curriculu.b;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 【Q01】配列の要素を順番に表示する
		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

		// 【Q02】配列の要素を逆順に表示する
		int[] score = { 10, 20, 30, 40, 50 };
		for (int i = score.length - 1; i >= 0; i--) {
			System.out.println(score[i]);
		}

		// 【Q03】配列の要素の合計値を表示する
		int[] numbers2 = { 3, 5, 7, 9, 11 };
		int sum = 0;
		for (int i = 0; i < numbers2.length; i++) {
			sum += numbers2[i];
		}
		System.out.println(sum);

		// 【Q04】配列の最大値と最小値を表示する
		int[] score2 = { 12, 7, 9, 21, 5, 18 };
		int max = score2[0];
		int min = score2[0];
		for (int i = 0; i < score2.length; i++) {
			if (score2[i] > max) {
				max = score2[i];
			}
			if (score2[i] < min) {
				min = score2[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

		// 【Q05】配列の要素を2倍にし表示する
		int[] numbers3 = { 1, 2, 3, 4, 5 };
		for (int num : numbers3) {
			System.out.println(num * 2);
		}

		// 【Q06】入力した数字が配列に含まれているか判断し表示する
		Scanner sc = new Scanner(System.in);
		System.out.println("数字を入力してください");
		int input = sc.nextInt();

		int[] numbers4 = { 4, 7, 10, 15, 20 };
		boolean found = false;
		for (int num1 : numbers4) {
			if (num1 == input) {
				found = true;
				break;
			}

		}
		if (found) {
			System.out.println("入力した値は配列に含まれています");
		} else {
			System.out.println("入力した値は配列に含まれていません");
		}

		// 【Q07】2次元配列で配列のすべての要素を表示する
		int[][] numbers5 = {
				{ 1, 2 },
				{ 3, 4 },
				{ 5, 6 }
		};

		for (int i = 0; i < numbers5.length; i++) {
			for (int j = 0; j < numbers5[i].length; j++) {
				System.out.print(numbers5[i][j] + "");
			}
			System.out.println();
		}

		// 【Q08】】2次元配列で配列の要素の合計値を表示する
		int[][] score3 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		int sum3 = 0;
		for (int i = 0; i < score3.length; i++) {
			for (int j = 0; j < score3[i].length; j++) {
				sum3 += score3[i][j];
			}
		}
		System.out.println(sum3);

		// 【Q09】2次元配列で配列の最大値と最小値を表示する
		int[][] numbers6 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		int max2 = numbers6[0][0];
		int min2 = numbers6[0][0];
		for (int i = 0; i < numbers6.length; i++) {
			for (int j = 0; j < numbers6[i].length; j++) {
				if (numbers6[i][j] > max2) {
					max2 = numbers6[i][j];
				}
				if (numbers6[i][j] < min2) {
					min2 = numbers6[i][j];
				}
			}
		}
		System.out.println(max2);
		System.out.println(min2);

		// 【Q10】3次元配列で配列のすべての要素を表示する
		int[][][] numbers7 = {
				{
						{ 1, 2 },
						{ 3, 4 },
						{ 5, 6 },
						{ 7, 8 }
				}
		};
		for (int a = 0; a < numbers7.length; a++) {
			for (int b = 0; b < numbers7[a].length; b++) {
				for (int c = 0; c < numbers7[a][b].length; c++) {
					System.out.println(numbers7[a][b][c]);
				}
			}
		}
	}
}
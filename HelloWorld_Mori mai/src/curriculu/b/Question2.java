package curriculu.b;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//Q01【概要】点数に応じて合否を判断する処理
//【詳細】代入したscoreが60以上の場合は「合格です」と表示する
int score = 75;
if (score >= 60) {
	System.out.println("合格です！");
}

//Q02【概要】適正範囲かを判断する処理
//【詳細】20以上30以下の場合「適正年齢」それ以外の場合「対象外」と表示する
int age = 25;
if (age >= 20 && age <= 30) {
	System.out.println("適正年齢です");
} else {
	System.out.println("対象外です");
}

//【Q03】年齢に応じて区分を判定し表示する
int age2 = 18;
if (age2 >= 20) {
	System.out.println("成人です");
} else if (age2 >= 13 && age2 <= 19) {
	System.out.println("ティーンエイジャーです");
} else {
	System.out.println("子供です");
}

//【Q04】一番大きな数値を判断し表示する
int x = 30;
int y = 15;
int z = 50;
if (x >= y && x >= z) {
	System.out.println(x);
} else if (y >= x && y >= z) {
	System.out.println(y);
} else {
	System.out.println(z);
}

//【Q05】コンソールから入力された数値を判断し表示する
Scanner sc = new Scanner(System.in);
System.out.println("数字を入力してください");
int num = sc.nextInt();
if (num > 0) {
	System.out.println("正の数です");
} else if (num == 0) {
	System.out.println("0です");
} else {
	System.out.println("負の数です");
}

//【Q06】コンソールから入力された数値を判断し表示する
Scanner sc1 = new Scanner(System.in);
System.out.println("数字を入力してください");
int value = sc1.nextInt();
if (value % 2 == 0) {
	System.out.println("偶数です");
} else {
	System.out.println("奇数です");
}

//【Q07】入力された点数を判断し、成績を表示する
Scanner sc2 = new Scanner(System.in);
System.out.println("数字を入力してください");
int score2 = sc2.nextInt();
if (score2 >= 90) {
	System.out.println("優");
} else if (score2 >= 70) {
	System.out.println("良");
} else if (score2 >= 50) {
	System.out.println("可");
} else {
	System.out.println("不可");
}

//【Q08】入力がnullか空文字かを判断し、無効な場合メッセージを表示する
Scanner sc3 = new Scanner(System.in);
System.out.println("文字を入力してください");
String input = sc3.nextLine();
if (input == null || input.isEmpty()) {
	System.out.println("入力が無効です");
} else {
	System.out.println("入力内容：" + input);
}

//【Q09】入力された数値に応じて曜日を表示する
Scanner sc4 = new Scanner(System.in);
System.out.println("数字を入力してください");;
int day = sc4.nextInt();
switch (day) {
case 1:
	System.out.println("今日は月曜日です");
	break;
case 2:
	System.out.println("今日は火曜日です");
	break;
case 3:
	System.out.println("今日は水曜日です");
	break;
case 4:
	System.out.println("今日は木曜日です");
	break;
case 5:
	System.out.println("今日は金曜日です");
	break;
case 6:
	System.out.println("今日は土曜日です");
	break;
case 7:
	System.out.println("今日は日曜日です");
	break;
default:
	System.out.println("無効な数値です");
}

//【Q10】入力された月の値に応じて季節を表示する
Scanner sc6 = new Scanner(System.in);
System.out.println("1～12のいずれかを入力してください");
int month = sc6.nextInt();
switch (month) {
case 12:
case 1:
case 2:
	System.out.println("冬");
	break;
case 3:
case 4:
case 5:
	System.out.println("春");
	break;
case 6:
case 7:
case 8:
	System.out.println("夏");
	break;
case 9:
case 10:
case 11:
	System.out.println("秋");
	break;
default:
	System.out.println("無効な数値です");
}
}
}

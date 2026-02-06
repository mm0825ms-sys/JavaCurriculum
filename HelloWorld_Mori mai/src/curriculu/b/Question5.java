package curriculu.b;

public class Question5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		helloWorld();

		int num = 10;
		int result = doubleValue(num);
		System.out.println(num + "を2倍すると" + result + "です。");
		
		int num1=7;
		int num2=10;
		System.out.println(num2+"は"+(isEven(num2)?"偶数":"奇数")+"です");
		System.out.println(num1+"は"+(isEven(num1)?"偶数":"奇数")+"です");
		}

	// 【Q01】Hello,Worid表示する
	public static void helloWorld() {
		System.out.println("Hello,World!");
	}

	// 【Q02】戻り値をもとに実行例を表示する
	public static int doubleValue(int num) {
		return num * 2;
	}
	// 【Q03】実行例を表示する
	public static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		} else {
			return false;
		}
	}
}

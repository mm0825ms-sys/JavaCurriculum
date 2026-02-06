package curriculu.c;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Animal animal = new Animal();

		animal.setName("ライオン");
		animal.setHeight(2.1);
		animal.setSpeed(80);

		System.out.println("動物名:" + animal.getName());
		System.out.println("体長：" + animal.getHeight() + "m");
		System.out.println("速度：" + animal.getSpeed() + "km/h");
	}
}

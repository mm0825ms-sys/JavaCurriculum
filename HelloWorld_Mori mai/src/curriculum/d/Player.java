package curriculum.d;

import java.util.Random;
import java.util.Scanner;

public class Player extends Character {
	private static final Random rand = new Random();

	public Player() {
		super(inputName(),
				randRange(70, 100),
				randRange(10, 20),
				randRange(5, 10));
	}

	private static String inputName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Playerの名前を入力");
		return sc.nextLine();
	}

	private static int randRange(int min, int max) {
		return rand.nextInt(max - min + 1) + min;
	}

}


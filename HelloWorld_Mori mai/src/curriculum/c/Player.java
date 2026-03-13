package curriculum.c;

import java.util.Scanner;

public class Player {
	Scanner scanner;

	public Player(Scanner scanner) {
		this.scanner = scanner;

	}

	public int getHand() {
		int hand;

		while (true) {
			System.out.print("あなたの手を入力(0:グー 1:チョキ 2:パー):");
			hand = scanner.nextInt();

			if (hand >= 0 && hand <= 2) {
				return hand;
			}
			System.out.println("0〜2を入力してください");

		}
	}
}
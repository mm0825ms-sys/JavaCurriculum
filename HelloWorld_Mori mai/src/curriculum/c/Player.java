package curriculum.c;

import java.util.Scanner;

public class Player {
	private Scanner sc = new Scanner(System.in);

	public int getHand() {
		System.out.print("あなたの手を入力(0:グー 1:チョキ 2:パー):");
		return sc.nextInt();
	}
}

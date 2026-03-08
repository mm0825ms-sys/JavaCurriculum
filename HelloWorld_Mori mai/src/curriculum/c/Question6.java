package curriculum.c;

import java.util.Random;

public class Question6 {

	public static void main(String[] args) {
		Player player = new Player();
		CPU cpu = new CPU();

		String[] hands = { "グー", "チョキ", "パー" };
		while (true) {
			int playerHand = player.getHand();
			int cpuHand = cpu.getHand();
			System.out.println("CPUの手:" + hands[cpuHand]);

			if ((playerHand == 0 && cpuHand == 1) ||
					(playerHand == 1 && cpuHand == 2) ||
					(playerHand == 2 && cpuHand == 0)) {
				System.out.println("あなたの勝ち！");
				break;
			} else if (playerHand == cpuHand) {
				System.out.println("あいこ");
			} else {
				System.out.println("負け、もう一回！");
			}
		}

	}

}

class CPU {
	private Random rand = new Random();

	public int getHand() {
		return rand.nextInt(3);
	}
}

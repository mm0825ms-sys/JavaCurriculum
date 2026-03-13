package curriculum.d;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Question7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		try {
			Player player = new Player();
			Daemon daemon = new Daemon("src/curriculum/d/daemon_status.txt");

			System.out.println("バトル開始");
			System.out.println(player.status());
			System.out.println(daemon.status());

			String result = battle(player, daemon);
			System.out.println(result);

			try (BufferedWriter bw = new BufferedWriter(new FileWriter("battle_log.txt"))) {
				bw.write(result);
			}
			System.out.println("バトル終了");
			System.out.println("結果を battle_log.txt に出力しました");

		} catch (IOException e) {
			System.out.println("ファイル読み書きでエラー：" + e.getMessage());
		}

	}

	private static String battle(Character player, Character daemon) {
		StringBuilder log = new StringBuilder();
		Random rand = new Random();

		log.append("===Battle Log===\n");
		log.append(player.status()).append("\n");
		log.append(daemon.status()).append("\n\n");
		int turn = 1;

		while (!player.isDead() && !daemon.isDead()) {
			log.append("----Turn").append(turn).append("----\n");

			Character first;
			Character second;

			if (player.sp > daemon.sp) {
				first = player;
				second = daemon;
			} else if (player.sp < daemon.sp) {
				first = daemon;
				second = player;
			} else {
				if (rand.nextBoolean()) {
					first = player;
					second = daemon;
				} else {
					first = daemon;
					second = player;
				}
			}

			int dmg1 = first.attack(second);
			log.append(first.name).append("の攻撃")
					.append(second.name).append("に").append(dmg1).append("ダメージ\n");
			log.append("HP:").append(player.name).append("=").append(player.hp)
					.append("/").append(daemon.name).append("=").append(daemon.hp).append("\n");

			if (second.isDead())
				break;

			int dmg2 = second.attack(first);
			log.append(second.name).append("の攻撃")
					.append(first.name).append("に").append(dmg2).append("ダメージ\n");
			log.append("HP:").append(player.name).append("=").append(player.hp)
					.append("/").append(daemon.name).append("=").append(daemon.hp).append("\n\n");

			turn++;
		}
		if (player.isDead()) {
			log.append("勝者：").append(daemon.name).append("\n");
		} else {
			log.append("勝者：").append(player.name).append("\n");
		}
		return log.toString();
	}

}



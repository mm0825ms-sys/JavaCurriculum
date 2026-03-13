package curriculum.d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {
	public Daemon(String filePath) throws IOException {
		super(loadName(filePath), loadHp(filePath), loadAt(filePath), loadSp(filePath));
	}

	//名前
	private static String loadName(String filePath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			return br.readLine();
		}
	}

	//HP
	private static int loadHp(String filePath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();
			return Integer.parseInt(br.readLine());
		}
	}

	//AT
	private static int loadAt(String filePath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();
			br.readLine();
			return Integer.parseInt(br.readLine());
		}
	}

	//SP
	private static int loadSp(String filePath) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			br.readLine();
			br.readLine();
			br.readLine();
			return Integer.parseInt(br.readLine());
		}
	}

}



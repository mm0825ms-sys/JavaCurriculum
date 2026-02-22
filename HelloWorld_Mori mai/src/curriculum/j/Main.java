package curriculum.j;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Billable> list = new ArrayList<>();

		list.add(new FullTimeEmployee("E001", "山田"));
		list.add(new ContractEmployee("E002", "佐藤"));

		for (Billable b : list) {
			int wage = b.costForDay(9);
			System.out.println(wage + "円");
		}

	}

}

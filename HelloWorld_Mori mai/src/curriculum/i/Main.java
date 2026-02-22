package curriculum.i;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new FullTimeEmployee("E001", "山田"));
		employeeList.add(new ContractEmployee("E002", "佐藤"));

		for (Employee e : employeeList) {
			int wage = e.calculateDailyWage(9);
			System.out.println(e.getName() + "の給与" + wage + "円");
		}

	}

}

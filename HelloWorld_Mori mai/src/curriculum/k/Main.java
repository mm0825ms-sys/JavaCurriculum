package curriculum.k;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Billable> employees = new ArrayList<>();
		employees.add(new FullTeimEmployee("田中", 8));
		employees.add(new ContractEmployee("佐藤", 8));
		employees.add(new FullTeimEmployee("鈴木", 6));

		for (Billable b : employees) {
			System.out.println(b.getName() + "の時給" + b.costForDay() + "円です。");
		}

	}

}

interface Billable {
	int costForDay();

	String getName();
}

abstract class Employee implements Billable {
	private String name;
	private int hours;

	public Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}

	@Override
	public String getName() {
		return name;
	}

	public int getHours() {
		return hours;
	}

	protected abstract int getHourlyRate();

	@Override
	public int costForDay() {
		return getHours() * getHourlyRate();
	}
}

class FullTeimEmployee extends Employee {
	public FullTeimEmployee(String name, int hours) {
		super(name, hours);
	}

	@Override
	protected int getHourlyRate() {
		return 1200;
	}
}

class ContractEmployee extends Employee {
	public ContractEmployee(String name, int hours) {
		super(name, hours);
	}

	@Override
	protected int getHourlyRate() {
		return 1000;
	}
}

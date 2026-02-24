package curriculum.f;

public class Employee {
	// TODO 自動生成されたメソッド・スタブ
	private String employeeId;
	private String name;

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showInfo() {
		System.out.println("社員ID：" + employeeId + "," + "名前：" + name);
	}
}

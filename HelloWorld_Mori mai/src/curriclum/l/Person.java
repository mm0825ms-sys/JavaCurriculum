package curriclum.l;

public class Person {
	static int count;
	String name;
	int age;
	double height;
	double weight;

	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight=weight;
		count++;
	}

	public double bmi() {
		return this.weight / (this.height * this.height);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.2fです%n",this.bmi());
		System.out.println("合計" + Person.count + "です");
	}

	Person() {

	}

}

package hw10UseOfSuperInChildClass;

public class Daughter extends Father {

	public String birthMonth;
	public int age;

	public Daughter() {
		super("May", 40, 'M', true);
		System.out.println("This is defualt constructor from Daughter class");
	}

	public Daughter(String birthMonth, int age) {
		super();
		this.birthMonth = birthMonth;
		this.age = age;
		System.out.println("");
		super.father();
		super.fatherInfo("Abdul", 40, 'M', true);
		super.familyName = "Ahmed Family";
	}

	public void daughter() {
		super.name= "Julia";
		super.familyName= "Ahmed";
		super.age = 21;
		System.out.println("This is from the daughter method");
	}

	public void daughterInfo(String birthMonth, int age) {
		System.out.println("Daughter birth month: " + birthMonth + ", Daughter age: " + age);
	}
}

package homework3t2;

public class Human {
	private String firstName;
	private String secondName;
	private int age;
	private String nationality;
	public Human(String firstName, String secondName, int age, String nationality) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
		this.nationality = nationality;
	}
	public Human() {
		super();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return "First Name  " + firstName + ", Second Name  " + secondName + ", Age - " + age + ", Nationality is "
				+ nationality;
	}
}

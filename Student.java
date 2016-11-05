package homework3t2;

public class Student extends Human{
	private int groupNumber;

	public Student(String firstName, String secondName, int age, String nationality, int groupNumber) {
		super(firstName, secondName, age, nationality);
		this.groupNumber = groupNumber;
	}

	public Student() {
		super();
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	@Override
	public String toString() {
		return "Group Number - " + groupNumber + super.toString();
	}
	
}

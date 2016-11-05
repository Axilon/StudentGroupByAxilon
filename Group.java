package homework3t2;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
	Student[] groupOfStudents = new Student[10];

	public Group() {
		super();
	}

	public void addStudent(Student student) {
		try {
			for (int i = 0; i < groupOfStudents.length; i++) {
				if (groupOfStudents[i] == null) {
					groupOfStudents[i] = student;
					return;
				}

			}
			throw new MyException();

		} catch (MyException e) {
			System.out.println(e.getMessage());
		}

	}

	public void deleteStudent(int indexNumber) {
		String secName = "";
		secName = groupOfStudents[indexNumber - 1].getSecondName();
		groupOfStudents[indexNumber - 1] = null;
		System.out.println("Student - " + secName + " was deleted from the group list");
		return;
	}

	public void deleteStudent(String surName) {
		for (int i = 0; i < groupOfStudents.length; i++) {
			if (groupOfStudents[i].getSecondName().equals(surName)) {
				groupOfStudents[i] = null;
				System.out.println("Student - " + surName + " was deleted from the group list");
				return;
			}
		}
		System.out.println("There is no " + surName + " in the group");
	}

	public void searchForTheStudentBySecondName(String secondName) {
		// try{

		for (int i = 0; i < groupOfStudents.length; i++) {
			if (groupOfStudents[i].getSecondName().equalsIgnoreCase(secondName) && groupOfStudents[i] != null) {
				System.out.format("First name: %s. Second name: %s.%n%d years old. Nationality is %s. Group number: %d",
						groupOfStudents[i].getFirstName(), secondName, groupOfStudents[i].getAge(),
						groupOfStudents[i].getNationality(), groupOfStudents[i].getGroupNumber());
				return;
			}
		}
		// }catch(NullPointerException e){
		//
		// }

		System.out.println("Sorry, but there is no student,that you are locking for.");
	}

	public static void sort(Student[] studentArray) {

	}

	public static Comparator<Student> surNameComperator = new Comparator<Student>() {
		@Override
		public int compare(Student a, Student b) {
			if(a.getSecondName()==null){
				return -1;
			}else if(b.getSecondName()==null){
				return 1;
			}else if (a.getSecondName()==null && b.getSecondName()==null){
				return 0;
			}else {
			return a.getSecondName().compareTo(b.getSecondName());
			}

		}
	};

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Group list:");
		sb.append(System.lineSeparator());

		for (int i = 0; i < groupOfStudents.length; i++) {
			sb.append((i + 1) + ". ");
			
			if (groupOfStudents[i] == null) {
					sb.append("free");
				}else if (groupOfStudents[i] != null) {
				Arrays.sort(groupOfStudents, Group.surNameComperator);
				sb.append(groupOfStudents[i].getSecondName() + " " + groupOfStudents[i].getFirstName());
			 }

			sb.append(System.lineSeparator());
		}
		return sb.toString();
	}

}

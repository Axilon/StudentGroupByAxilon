package homework3t2;



public class Main {

	public static void main(String[] args) {
		Student[] studentArray = new Student[11];
		Group group = new Group();
		group.addStudent( studentArray[0]=new Student("Pavel", "Struchkov", 21, "Ukranian", 12));
		group.addStudent( studentArray[1] = new Student("Oleg", "Olegov", 45, "Russian", 11));
		group.addStudent(studentArray[2] = new Student("Aleksey", "Stenkov", 12, "Slovenian", 12));
		group.addStudent(studentArray[3] = new Student("Olga", "Molochka", 18, "Ukranian", 12));
		group.addStudent(studentArray[4] = new Student("Mariya", "Oduvanchik", 25, "Armenian", 13));
		group.addStudent(studentArray[5] = new Student("Sveta", "Strucha", 29, "Armenian", 12));
		group.addStudent(studentArray[6] = new Student("Svetik", "Semizvetik", 21, "Ukranian", 13));
		group.addStudent(studentArray[7] = new Student("Artur", "Pirozhkov", 20, "Ukranian", 11));
		group.addStudent(studentArray[8] = new Student("Dun`ka", "Vuvorka", 15, "Russian", 12));
		group.addStudent(studentArray[9] = new Student("Andriian", "Sukhanov", 24, "Russian", 12));
		
		System.out.println(group.toString());
		System.out.println();
		group.addStudent(studentArray[10] = new Student("Andrey", "Shahbazyan", 13, "Ukranian", 15));
		System.out.println();
		group.searchForTheStudentBySecondName("Semizvetik");
		System.out.println();
		System.out.println();
		group.deleteStudent("Olegov");
		group.deleteStudent(4);
		

	}

}

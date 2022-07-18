
public class Curric {
public String courseName;
public String teacherName;
public String departmentName;
public int id;
public int numOfStudents;
public Curric(String cname, String tname, int id, String dName,int numOfStudents) {
this.courseName = cname;
this.teacherName = tname;
this.id = id;
this.departmentName = dName;
this.numOfStudents = numOfStudents;
}
public void displayMessage() {
	System.out.println("The name of this course is " + courseName);
	System.out.println("The name of the instructor is " + teacherName);
	System.out.println("The course is in the  " + departmentName + " department");
	System.out.println("The id number for this course is " + id);
	System.out.println("There are " + numOfStudents + " students in this class");
}
}

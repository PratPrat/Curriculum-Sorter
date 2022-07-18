
public class computerScience extends Curric {
	public computerScience(String cname, String tname, int id, String dName,int numOfStudents) {
		 super(cname, tname, id, dName, numOfStudents);
		
	 }
	public void displayMessage() {
		super.displayMessage();
		System.out.println("Major or minor in cs is required to sign up for this course");
		System.out.println("-----------------------");
	}
}

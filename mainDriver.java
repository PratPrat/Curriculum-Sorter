
public class mainDriver {
public static void main(String [] args) {
	Curric t1, t2, t3, t4, t5;
	t1 = new englishOne("English One:Intro to Professional Writing", "Robert Strickland", 1104, "English", 75);
	t1.displayMessage();
	t2 = new englishTwo("English Two:Perfecting Logic and Reason", "Robert Strickland", 2104, "English", 40);
	t2.displayMessage();
	t3 = new computerScience("Computer Science One:Intro to Java", "Edward Strafton", 1133, "Computer Science ", 125);
	t3.displayMessage();
	t4 = new compScitwo("Computer Science Two:Algorithms In java", "Stacy Kellock", 2233, "Computer Science ", 55);
	t4.displayMessage();
	t5 = new calcOne("Calculus of a Single Variable", "Bradley Bartin", 1215, "Mathematics", 300);
	t5.displayMessage();
}
}

import java.util.ArrayList;
import java.util.Scanner;
 
class Exercise2 {
	public static void main(String[] args) {
		// Initialize Instances
		Scanner scanner = new Scanner(System.in);
		ArrayList<Float> studentGrade;
		studentGrade = new ArrayList<>();
		float sum = 0;
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>> ");
		// Loop : Add to ArrayList for 6times
		int i = 0;
		while(i < 6) {
			switch(scanner.next()) {
			case "A" : studentGrade.add((float) 4.0); break;
			case "B" : studentGrade.add((float) 3.0); break;
			case "C" : studentGrade.add((float) 2.0); break;
			case "D" : studentGrade.add((float) 1.0); break;
			case "F" : studentGrade.add((float) 0); break;
			default : System.out.println("����� �� ���� �Է��Դϴ� "); break;
			}
			i ++;
		}
		// Get Sum of All Grades
		for (Float float1 : studentGrade) {
			sum = sum + float1;
		}
		scanner.close();
		// Print out Result
		System.out.println(sum / studentGrade.size());
	}
}
import java.util.HashMap;
import java.util.Scanner;
 
class Exercise3 {
	public static void main(String[] args) {
		// Initialize Instances
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.");
		// Loop : Add to HashMap<Nation, Population>
		boolean b = true;
		while (b) {
			System.out.print("���� �̸�, �α� >> ");
			String nation = scanner.next();
			switch (nation) {
			// if, Next String == "Stop", To be Break Loop
			case "Stop" : b = false; break;
			default : {
				Integer population = scanner.nextInt();
				nations.put(nation, population); break;
				}
			}
		}
		b = true;
		// Loop : Searching with Keyword
		while (b) {
			System.out.print("�α� �˻� >> ");
			String search = scanner.next();
			Integer result;
			if (nations.containsKey(search)) {
				result = nations.get(search);
				System.out.println(search + "�� �α��� " + result);
			} else {
				// if, Keyword does not match with ContainsKey of HashMap,
				// To be Break Loop
				b = false;
			}
		}
		scanner.close();
	}
}
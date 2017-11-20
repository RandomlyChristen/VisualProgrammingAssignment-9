import java.util.HashMap;
import java.util.Scanner;
 
class Exercise3 {
	public static void main(String[] args) {
		// Initialize Instances
		HashMap<String, Integer> nations = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("나라 이름과 인구를 10개 입력하세요.");
		// Loop : Add to HashMap<Nation, Population>
		boolean b = true;
		while (b) {
			System.out.print("나라 이름, 인구 >> ");
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
			System.out.print("인구 검색 >> ");
			String search = scanner.next();
			Integer result;
			if (nations.containsKey(search)) {
				result = nations.get(search);
				System.out.println(search + "의 인구는 " + result);
			} else {
				// if, Keyword does not match with ContainsKey of HashMap,
				// To be Break Loop
				b = false;
			}
		}
		scanner.close();
	}
}
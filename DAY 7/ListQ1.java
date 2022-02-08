import java.util.ArrayList;

public class ListQ1 {
	private ArrayList<Integer> l1 = new ArrayList<Integer>();

	public ArrayList<Integer> saveEvenNumbers(int N) {
		l1 = new ArrayList<Integer>();

		for (int i = 2; i <= N; i++) {
			if (i % 2 == 0)
				l1.add(i);
		}

		return l1;
	}

	public ArrayList<Integer> printEvenNumbers() {
		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (int item : l1) {
			newList.add(item * 2);
			System.out.println(item * 2);
		}

		return newList;
	}

	public static void main(String[] args) {
		ListQ1 l = new ListQ1();
		l.saveEvenNumbers(25);
		l.printEvenNumbers();

	}

}

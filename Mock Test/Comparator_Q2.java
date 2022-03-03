import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Comparator_Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of entries");
		int s = sc.nextInt();
		System.out.println("Enter name and score");
		Player[] player = new Player[s];
		checker c = new checker();
		for (int i = 0; i < s; i++) {
			player[i] = new Player(sc.next(), sc.nextInt());

		}
		sc.close();
		Arrays.sort(player, c);
		for (int i = 0; i < player.length; i++) {
			System.out.printf("%s %s\n", player[i].name, player[i].score);
		}

	}
}

class Player {
	String name;
	int score;

	Player(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

class checker implements Comparator<Player> {
	public int compare(Player a, Player b) {
		if (a.score < b.score) {
			return 1;
		} else if (a.score > b.score) {
			return -1;
		} else {
			return a.name.compareTo(b.name);
		}
	}
}


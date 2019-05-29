package programs;

class Club {
	final int No_of_players = 11;
	final int No_of_HeadCoach = 1;

	void win() {
		System.out.println("Play to win");

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			} else {
				continue;
			}
		}
	}
}

class Manager {
	String Manager_name = "Zindane";

	void coach() {
		System.out.println("Coach players");
	}

	void tactics() {
		System.out.println("Tiki-Taka");
	}
}

public class RealMadridInheritance extends Club {

	void Style_of_play() {
		Manager zidane = new Manager();
		zidane.coach();
		zidane.tactics();
		System.out.println("Attacking Football");
	}

	void Status() {
		System.out.println("European Giant");
	}

	public static void main(String args[]) {

		RealMadridInheritance team = new RealMadridInheritance();
		team.win();

		team.Style_of_play();
		team.Status();
		Club obj = new Club();
		obj.win();
	}
}

package programs;

interface Playable {
	static int play_time = 10;

	public void play();
}

public class AnonymousTest {
	public static void main(String args[]) {
		Playable playing = () -> {
			int play_time = 12;
			System.out.println("play time =" + play_time); // using this keyword has no use
			System.out.println("inside lambda expression");// whenit is inside a class
		};
		playing.play();
	}
}
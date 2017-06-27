import org.jointheleague.graphical.robot.Robot;

public class IntroToLeagueRobot {
	public static void main(String[] args) {
		// put your code here
		Robot ac = new Robot();
		ac.setSpeed(10);
		ac.move(10);
		ac.penDown();
		ac.hide();

		for (int r = 0; r < 50; r++) {
			for (int i = 0; i < 36; i++) {

				ac.move(10);
				ac.turn(10);

			}
			int a = 10;
			ac.penUp();
			ac.turn(a + 10);
			ac.move(50);
			ac.turn(a - 10);
			ac.penDown();
		}
	}
}
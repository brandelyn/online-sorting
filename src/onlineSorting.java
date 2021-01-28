
public class onlineSorting {

	public static void main(String[] args) {

		// sort students based on traits
		// if student is daring, put them in gryffindor
		// otherwise put them in slytherin

		int daring = 1;
		int cunning = 2;
		int clever = 3;
		int loyal = 4;
		int brave = 5;
		int shrewd = 6;
		int witty = 7;

		int studentTrait = 4;
		boolean isMuggleBorn = false;

		if (studentTrait == daring || studentTrait == brave) {
			System.out.println("You belong in gryffindor");

		} else if ((studentTrait == cunning || studentTrait == shrewd) && !isMuggleBorn) {
			System.out.println("You belong in slytherin");
		} else if (studentTrait == clever || studentTrait == witty) {
			System.out.println("You belong in ravenclaw");
		} else {
			System.out.println("You belong in hufflepuff");
		}

	}

}

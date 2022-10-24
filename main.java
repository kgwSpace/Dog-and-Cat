package gt;

public class main {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.Sound());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
	}

}

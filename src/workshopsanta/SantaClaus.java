package workshopsanta;

public class SantaClaus {

	private static SantaClaus instance;

	public static SantaClaus getInstance() {

		if (instance == null) {
			instance = new SantaClaus();
		}

		return instance;
	}

	public void callingDwarf() {
		System.out.println("🎅: Джуджета, къде сте?");
	}

	public String wantedToy(String toy) {
		System.out.println("🎅: Хо-хо-хо, трябва ми: " + toy);
		return toy;
	}
	
	

}
